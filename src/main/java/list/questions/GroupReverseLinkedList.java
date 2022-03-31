package list.questions;

import list.LinkedList;

public class GroupReverseLinkedList extends LinkedList{

    static Node groupReverseLinkedList(Node head,int k){

        Node current = head;
        Node prev = null;
        Node next=null;

        int count = 0;

        while (count < k && current != null) {
            next = current.next;
            current.next= prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null)
            head.next = groupReverseLinkedList(next, k);

        return prev;
    }

    public static void main(String[] args) {
        LinkedList linkedList = createLinkedList();
        System.out.println(linkedList.head);
        System.out.println(groupReverseLinkedList(linkedList.head,3));
    }
}
