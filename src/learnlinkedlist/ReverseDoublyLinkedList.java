package learnlinkedlist;

import org.junit.Test;

public class ReverseDoublyLinkedList {
    class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value){
            this.value = value;
        }
    }
    @Test
    public void addNodes(){
        Node head = new Node(1);
        head.prev = null;
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = null;
        while(head != null && head.next != null){

            head = head.next;
        }

        while (head != null){
            System.out.println(head.value);
            head = head.prev;
        }
    }
}
