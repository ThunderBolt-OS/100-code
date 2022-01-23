/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        int length = 0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                break;
            }
        }
       
        ListNode f = head;       
        if(fast == null || fast.next == null){
            return null;
        }
        
        while (f != slow){
            f = f.next;
            slow = slow.next;
        }
        return f;
    }
    
    
    
    
}