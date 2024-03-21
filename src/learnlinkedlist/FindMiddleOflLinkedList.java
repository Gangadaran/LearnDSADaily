package learnlinkedlist;

import org.junit.Test;

public class FindMiddleOflLinkedList {

    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    @Test
    public void addNodes(){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        findMiddle(head);
    }

    private void findMiddle(Node head) {
        int count = 1;
        Node current = head;
        while (current.next != null){
            current = current.next;
            count++;
        }
        int mid = count/2;
        for (int i =1; i < mid; i++){
            head = head.next;
        }
        System.out.println(head.value);
    }
}
