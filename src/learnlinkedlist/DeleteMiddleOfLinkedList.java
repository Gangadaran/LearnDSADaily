package learnlinkedlist;

import org.junit.Test;

public class DeleteMiddleOfLinkedList {
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
        Node node = deleteMiddle(head);
        while(node != null){
            System.out.println(node.value);
            node = node.next;
        }

    }

    private Node deleteMiddle(Node head) {
        int cound =0;
        Node current = head;
        while(current.next != null){
            current = current.next;
            cound++;
        }

        int mid = cound/2;
        Node temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}
