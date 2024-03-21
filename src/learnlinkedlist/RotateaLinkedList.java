package learnlinkedlist;

import org.junit.Test;

public class RotateaLinkedList {
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    @Test
    public void addNodes(){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        int k = 4;
        printNodes(rotateList(head,k));
    }

    private Node rotateList(Node head, int k) {
        Node current = head;
        for (int i = 1; i <= k ; i++) {
            current = current.next;
        }
        Node last = current;
        while (last != null && last.next != null){
            last = last.next;
        }
        Node temp = head;
        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }

        temp.next = null;
        last.next = head;

        return current;
    }

    private void printNodes(Node head){
        while (head != null){
            System.out.println(head.value);
            head = head.next;
        }
    }
}
