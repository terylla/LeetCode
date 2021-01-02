/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
/*
Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

 
Example 1:

Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: l1 = [], l2 = []
Output: []
Example 3:

Input: l1 = [], l2 = [0]
Output: [0]
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
   
        if (l1 == null){
            return l2;
        } else if (l2 == null){
            return l1;
        } else if (l1 == null && l2 == null){
            return null;
        }
        
        ListNode list = l1.val < l2.val ? l1 : l2;
        
//         if (l1.val<l2.val) { 
//              list = l1; 
//         } else { 
//             list = l2;
//         }
        
        // continue the cycle
        list.next = mergeTwoLists( list.next, list == l1 ? l2 : l1 );
        
        // if (list == l1){
        //     list = l2;
        // }else {
        //     list = l1;
        // }

        
        return list;
    }
    
}
