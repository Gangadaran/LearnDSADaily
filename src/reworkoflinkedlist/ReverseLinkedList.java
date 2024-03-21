package reworkoflinkedlist;

import org.junit.Test;

public class ReverseLinkedList {
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;

        }
    }

    @Test
    public void addLinkedList(){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        printNodes(reverseNodes(head));
    }

    private Node reverseNodes(Node head) {
        Node prev = null;
        Node current = head;

        while(current !=null){
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
    private void printNodes(Node head){
        while(head != null){
            System.out.println(head.value);
            head = head.next;
        }
    }
}
