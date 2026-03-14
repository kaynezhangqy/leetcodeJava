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
                    # 可能还有难度分（数字，通常在4位以上）
                    difficulty = ''
                    # 查找难度数字（如1263），但排除题目编号（如1456.）
                    # 题目编号格式：\d+\.
                    # 在链接文本后可能有难度数字
                    # 使用更精确的匹配：在文本后可能有空格和数字
                    # 例如："1456. 定长子串中元音的最大数目 1263"
                    # 我们需要提取"1456."作为题目编号，"1263"作为难度分
                    # 但文本可能包含其他数字，所以我们假设最后一个数字是难度分
                    # 先提取题目编号
                    problem_id = ''
                    # 查找开头的数字序列，后跟点号
                    prob_id_match = re.match(r'^(\d+\.)', text)
                    if prob_id_match:
                        problem_id = prob_id_match.group(1)
                        text_without_id = text[len(problem_id):].strip()
                    else:
                        text_without_id = text
                    
                    # 查找文本中的数字（可能是难度分）
                    # 难度分通常是4位数字，且在文本末尾
                    # 使用正则查找最后的连续数字
                    diff_match = re.search(r'(\d{4,})(?!.*\d{4,})', li_content)
                    if diff_match:
                        difficulty = diff_match.group(1)
                    
                    problems.append({
                        'id': problem_id,
                        'text': text_without_id,
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
        print("Usage: python parse2.py <html_file>")
        sys.exit(1)
    
    data = parse_leetcode_discuss(sys.argv[1])
    
    # 打印格式化输出
    print("LeetCode 滑动窗口与双指针题单")
    print("=" * 60)
    print("\n来源：https://leetcode.cn/discuss/post/3578981/ti-dan-hua-dong-chuang-kou-ding-chang-bu-rzz7/")
    print("=" * 60)
    
    total_problems = 0
    for chapter in data:
        chapter_problems = len(chapter['problems'])
        total_problems += chapter_problems
        print(f"\n{chapter['title']} ({chapter_problems}题)")
        print("-" * len(chapter['title']))
        if chapter['problems']:
            for idx, prob in enumerate(chapter['problems'], 1):
                diff = f" (难度: {prob['difficulty']})" if prob['difficulty'] else ""
                print(f"{idx}. {prob['id']}{prob['text']}{diff}")
                print(f"   {prob['url']}")
        else:
            print("  无题目")
    print(f"\n总计: {total_problems} 道题目")