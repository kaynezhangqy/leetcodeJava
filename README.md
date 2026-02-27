# LeetCode Java Solutions

一个包含LeetCode算法题Java实现的练习项目，采用Gradle构建工具管理依赖。

## 项目结构

```
src/
├── com/
│   └── leetcode/
│       ├── array/
│       │   ├── easy/
│       │   │   ├── TwoSum.java          # 两数之和（哈希表解法）
│       │   │   └── Solution1_twoSum.java # 两数之和（暴力解法）
│       │   └── medium/
│       │       └── ProductExceptSelf.java # 除自身以外数组的乘积
│       └── string/
│           └── medium/
│               ├── longestPalindrome.java # 最长回文子串
│               └── maxVowels.java        # 子串中元音的最大数量
└── Main.java                            # 项目演示入口

test/
└── com/
    └── leetcode/
        └── array/
            └── easy/
                └── TwoSumTest.java       # 两数之和测试用例
```

## 已实现的算法

### 数组 (Array)

#### 简单 (Easy)
- **Two Sum (两数之和)** - 在数组中找到两个数，使它们的和等于目标值
  - `TwoSum.java` - 使用哈希表优化解法
  - `Solution1_twoSum.java` - 暴力双重循环解法

#### 中等 (Medium)  
- **Product of Array Except Self (除自身以外数组的乘积)** - 计算数组中每个元素除自身外的乘积

### 字符串 (String)

#### 中等 (Medium)
- **Longest Palindromic Substring (最长回文子串)** - 找到字符串中最长的回文子串
- **Maximum Number of Vowels in a Substring of Given Length (子串中元音的最大数量)** - 在给定长度的子串中找到最多元音数量

## 快速开始

### 运行演示
```bash
./gradlew run
```

### 运行测试
```bash
./gradlew test
```

### 构建项目
```bash
./gradlew build
```

## 技术栈

- **Java** - 编程语言
- **Gradle** - 构建工具
- **JUnit 5** - 测试框架

## 贡献

欢迎提交Pull Request来添加新的LeetCode解决方案或改进现有代码！

## 许可证

MIT License