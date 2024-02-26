/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s, int idx1, int idx2) {
        while (idx1 < idx2) {
            if (s.charAt(idx1) != s.charAt(idx2)) {
                return false;
            }
            idx1++;
            idx2--;
        }
        return true;
    }


    public String longestPalindrome(String s) {
        String str = "";
        int n = s.length();
        for (int idx1 = 0; idx1 < n; idx1++) {
            for (int idx2 = idx1; idx2 < n; idx2++) {
                if (isPalindrome(s, idx1, idx2) && (idx2 - idx1 + 1) > str.length()) {
                    str = s.substring(idx1, idx2 + 1);

                }
            }
        }
        return str;
    }
}
// @lc code=end

