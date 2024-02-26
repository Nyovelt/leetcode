/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int idx = 0;
        while (idx < n && s.charAt(idx) == ' ') {
            idx++;
        }
        if (idx == n) {
            return 0;
        }
        int sign = 1;
        if (s.charAt(idx) == '+' || s.charAt(idx) == '-') {
            sign = (s.charAt(idx) == '+' ? 1 : -1);
            idx++;
        }
        long ret = 0;
        while (idx < n && Character.isDigit(s.charAt(idx))) {
            ret = ret * 10 + (s.charAt(idx) - '0');
            if (ret > Integer.MAX_VALUE) {
                return (sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
            }
            idx++;
        }
        return (int)ret * sign;
    }
}
// @lc code=end

