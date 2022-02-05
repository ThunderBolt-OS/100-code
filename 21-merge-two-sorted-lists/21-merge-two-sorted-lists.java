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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode firsthead = list1;
        ListNode secondhead = list2;
        ListNode dummyHead = new ListNode();
        ListNode ans = dummyHead;
        
        while(firsthead != null && secondhead != null){
            if(firsthead.val < secondhead.val){
                dummyHead.next = firsthead;
                firsthead = firsthead.next;                
            }else{
                dummyHead.next = secondhead;
                secondhead = secondhead.next;
            }
            dummyHead = dummyHead.next;
        }
        if(firsthead != null){
            dummyHead.next = firsthead;
        }
        if(secondhead != null){
            dummyHead.next = secondhead;
        }
        return ans.next;
        
    }
}