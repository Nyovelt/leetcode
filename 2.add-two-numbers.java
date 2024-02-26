/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode ret = new ListNode();
    ListNode tmp = ret;
    ListNode prev_tmp = null;
    int carry = 0;
    while (l1 != null || l2 != null) {
      int val1 = (l1 == null ? 0 : l1.val);
      int val2 = (l2 == null ? 0 : l2.val);
  
      tmp.val = val1 + val2 + carry;
      System.out.println(tmp.val);
      if (tmp.val>= 10) {
        carry = 1;
        tmp.val -= 10;
      }
      else {
        carry = 0;
      }
      tmp.next = new ListNode();
      prev_tmp = tmp;
      tmp = tmp.next;
      l1 = (l1 == null ? null : l1.next);
      l2 = (l2 == null ? null : l2.next);
    }
    if (carry != 0){
        tmp.val = carry;
    }
    else if (prev_tmp != null) {
       prev_tmp.next = null;
    }
    return ret;
  }
}
// @lc code=end
