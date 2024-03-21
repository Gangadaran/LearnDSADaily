package learnlinkedlist;

import org.junit.Test;

public class NthNodefromEndOfNode {
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
        int n = 3;
        System.out.println(findNthNode(head, n));
    }

    private int findNthNode(Node head, int n) {
        int count = 1;
        Node current = head;
        while (current.next !=null){
            current = current.next;
            count++;
        }
        int diff = count-n;
        for (int i = 0; i < diff; i++) {
            head = head.next;
        }

        return head.value;

    }
}
