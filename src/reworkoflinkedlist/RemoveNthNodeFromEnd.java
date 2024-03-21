package reworkoflinkedlist;

import org.junit.Test;

public class RemoveNthNodeFromEnd {
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
        int n = 2;
        printNodes(removeNthNode(head, n));
    }

    private Node removeNthNode(Node head, int n) {
        if (head==null || n <=0) return null;
        int index = 0;
        Node current = head;
        while(current != null){
            index++;
            current = current.next;
        }
        int temp = index-n;

        current = head;

        for (int i = 1; i < index-n; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        return head;
    }

    private void printNodes(Node head){
        while(head != null){
            System.out.println(head.value);
            head = head.next;
        }
    }
}
