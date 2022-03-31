package list.questions;

import list.LinkedList;

public class DetectLoopLinkedList extends LinkedList {

    Node head; // head of list

    /* Linked list Node*/
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    boolean isLoopedInLinkedList() {
        Node slow_p = head;
        Node fast_p = head;
        boolean isLooped = false;
        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = head.next;
            fast_p = head.next.next;

            if (slow_p == fast_p) {
                isLooped = true;
                break;
            }
        }

        return isLooped;
    }

    void detectLoop() {
        Node slow_p = head, fast_p = head;
        int flag = 0;
        while (slow_p != null && fast_p != null
                && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Loop found");
        else
            System.out.println("Loop not found");
    }


    public static void main(String[] args) {
        DetectLoopLinkedList linkedList = new DetectLoopLinkedList();

        linkedList.push(20);
        linkedList.push(4);
        linkedList.push(15);
        linkedList.push(10);

        /*Create loop for testing */
        linkedList.head.next.next.next.next = linkedList.head;

        //isLoopedInLinkedList(linkedList.head);
        System.out.println(linkedList.isLoopedInLinkedList());
    }
}
