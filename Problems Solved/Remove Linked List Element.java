/*
Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
*/

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
    public ListNode removeElements(ListNode head, int val) {
        // for [1],2 or [1],1 cases
        while (head != null && head.val == val) head = head.next;
      
         // for other cases
        ListNode curr = head;
        while (curr != null && curr.next != null){
           if (curr.next.val == val){
               curr.next = curr.next.next;       
           } else {
               curr = curr.next;
           }
           
        }
        return head;
    }
}
