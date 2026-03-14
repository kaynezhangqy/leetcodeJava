#!/usr/bin/env python3
import sys
import re

def parse_leetcode_discuss(file_path):
    with open(file_path, 'r', encoding='utf-8') as f:
        content = f.read()
    
    # 查找章节标题
    chapter_pattern = r'<h2 id="([^"]+)">([^<]+)</h2>'
    chapters = list(re.finditer(chapter_pattern, content))
    
    result = []
    
    for i, chapter in enumerate(chapters):
        chapter_id = chapter.group(1)
        chapter_title = chapter.group(2)
        start = chapter.start()
        
        # 找到下一个章节的开始位置
        if i + 1 < len(chapters):
            end = chapters[i + 1].start()
        else:
            # 最后一个章节到文件末尾
            end = len(content)
        
        chapter_content = content[start:end]
        
        # 提取列表项
        # 查找<ul>和</ul>标签
        ul_pattern = r'<ul>(.*?)</ul>'
        ul_matches = list(re.finditer(ul_pattern, chapter_content, re.DOTALL))
        
        problems = []
        for ul_match in ul_matches:
            ul_content = ul_match.group(1)
            # 查找<li>标签
            li_pattern = r'<li>(.*?)</li>'
            li_matches = list(re.finditer(li_pattern, ul_content, re.DOTALL))
            for li_match in li_matches:
                li_content = li_match.group(1)
                # 提取链接和文本
                link_pattern = r'<a href="([^"]+)"[^>]*>([^<]+)</a>'
                link_match = re.search(link_pattern, li_content)
                if link_match:
                    url = link_match.group(1)
                    text = link_match.group(2)
                    # 可能还有难度分
                    difficulty = ''
                    # 查找难度数字（如1263）
                    diff_match = re.search(r'(\d{4,})', li_content)
                    if diff_match:
                        difficulty = diff_match.group(1)
                    problems.append({
                        'text': text,
                        'url': url,
                        'difficulty': difficulty
                    })
        
        result.append({
            'title': chapter_title,
            'id': chapter_id,
            'problems': problems
        })
    
    return result

if __name__ == '__main__':
    if len(sys.argv) != 2:
        print("Usage: python parse.py <html_file>")
        sys.exit(1)
    
    data = parse_leetcode_discuss(sys.argv[1])
    
    # 打印格式化输出
    print("LeetCode 题单列表")
    print("=" * 50)
    for chapter in data:
        print(f"\n{chapter['title']}")
        print("-" * len(chapter['title']))
        if chapter['problems']:
            for idx, prob in enumerate(chapter['problems'], 1):
                diff = f" (难度: {prob['difficulty']})" if prob['difficulty'] else ""
                print(f"{idx}. {prob['text']}{diff}")
                print(f"   {prob['url']}")
        else:
            print("  无题目")