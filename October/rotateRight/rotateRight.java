
// Definition for singly-linked list.
//  public class ListNode {
//      int val;
//     ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
 

class Solution {

    public ListNode rotateRight(ListNode head, int k) {
        
        ListNode temp = head, temp2 = head; // have their own list so they don't mess with og list
       
        if ( k == 0 || head == null|| head.next == null) {
            return head;
        }
        
        int count =  1; // we have to count the 0th element too
        // if there is still element(s), keep going next. This is to count how many elements are left after 1st
        while (temp.next != null){
            temp = temp.next; 
            count++;
        }
        
    
       // so find the diff of k and count, then count difference and we how how many times to rotate
        k = count - k % count;
        while (k > 1){ // k > 1 because we need to put temp2.next at the 1st element, not 0th element
            temp2 = temp2.next; // rotate until k = 1
            k--; //deduct until k = 1
        }
        
        //Rotation
        temp.next = head ;  
        head = temp2.next; 
        temp2.next = null; //nothing left to rotate
        
        return head;
        
    }
}