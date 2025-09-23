package leetcode.string.medium;

class Solution {
  public int maxVowels(String S, int k) {
	char[] s = S.toCharArray();
	int res = 0;
	int curVowels = 0;
	for (int i = 0; i < s.length; i++) {
	  if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
		curVowels++;
	  }
	  if (i < k - 1) {
		continue;
	  }
	  res = Math.max(res, curVowels);
	  char out = s[i - k + 1];
	  if (out == 'a' || out == 'e' || out == 'i' || out == 'o' || out == 'u') {
		curVowels--;
	  }
	}
	return res;
  }
}