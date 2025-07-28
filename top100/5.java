package top100;

class Solution {

  public String longestPalindrome(String s) {
	String res = "";
	if (s.length() <= 1) {
	  return s;
	}
	for (int i = 0; i < s.length(); i++) {
	  String t1 = expander(s, i, i);
	  if (t1.length() > res.length()) {
		res = t1;
	  }
	  String t2 = expander(s, i, i + 1);
	  if (t2.length() > res.length()) {
		res = t2;
	  }
	}
	return res;
  }

  private String expander(String s, int l, int r) {
	int sSize = s.length();
	while (l >= 0 && r < sSize && s.charAt(l) == s.charAt(r)) {
	  l--;
	  r++;
	}
	return s.substring(l + 1, r);
  }


}