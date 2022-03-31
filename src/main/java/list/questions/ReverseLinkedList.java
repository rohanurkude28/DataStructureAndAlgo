package list.questions;

import list.LinkedList;

public class ReverseLinkedList extends LinkedList{

    static Node reverseLinkedListIterative(Node node){

        Node current = node;
        Node prev = null;
        Node next;

        while(current !=null){
            next = current.next;
            current.next= prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static Node reverseLinkedListRecursive(Node head)
    {
        if (head == null || head.next == null)
            return head;

        /* reverse the rest list and put
        the first element at the end */
        Node newHead = reverseLinkedListRecursive(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;

        /* fix the head pointer */
        return newHead;
    }


    public static void main(String[] args) {
        LinkedList linkedList = createLinkedList();
        System.out.println(linkedList.head);
        //System.out.println(reverseLinkedListIterative(linkedList.head));
        System.out.println(reverseLinkedListRecursive(linkedList.head));
    }
}
