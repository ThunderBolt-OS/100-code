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
//     public ListNode middleNode(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;
        
//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
           
//         }
//         return slow;
            
//     }
    public ListNode middleNode(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode midPrev = null;
        

        while(head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
         ListNode mid = midPrev.next;
         midPrev.next = null;
        return mid;
    }
}