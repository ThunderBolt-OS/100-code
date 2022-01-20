package LinkedLists;

public class Main {
    public static void main(String[] args) {

//        *****Linked Lists*****
        LinkedList list = new LinkedList();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(8);
        list.insertFirst(10);
        list.insertFirst(12);
        list.insertFirst(6);

        list.insertAt(100, 4);

        list.insertLast(5102);

        list.display();
        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.deleteAt(3));
        list.display();
        list.insertRec(199, 2);
        list.display();

//        *****Doubly Linked Lists*****
//        DoublyLinkedLists dll = new DoublyLinkedLists();
//
//        dll.insertFirst_DLL(2);
//        dll.insertFirst_DLL(4);
//        dll.insertFirst_DLL(5);
//        dll.insertFirst_DLL(7);
//        dll.insertFirst_DLL(9);
////        dll.display_DLL();
//        dll.display_DLL_reverse();
    }

}
