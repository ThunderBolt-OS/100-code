package Linkedlists;

import org.w3c.dom.Node;

public class LengthofCycle {
    private Node head;      //head of ll
    private Node tail;      //tail of ll
    private int size;       //size of ll
    public LinkedList(){
        this.size = 0;      //initially declaring the size 0;
    }

    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            second = second.next;
            if (fast == second) {
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }
}
