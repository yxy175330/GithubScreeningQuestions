package com.problem1;

public class LongestPalindromeSubstring {
	public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return s;
        
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            
            if (len > end - start + 1) {
                if (len == len1) {
                    start = i - len / 2;
                    end = i + len / 2;
                } else {
                    start = i - len / 2 + 1;
                    end = i + len / 2;
                }
            }
        }
        return s.substring(start, end + 1);
    }
    public static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
