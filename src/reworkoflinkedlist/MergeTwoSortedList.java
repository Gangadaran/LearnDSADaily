package reworkoflinkedlist;

import org.junit.Test;

import java.util.LinkedList;

public class MergeTwoSortedList {
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(){

        }
    }
    @Test
    public void addNodes(){
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);
        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);
        printNodes(mergeTwoheads1(head1, head2));
    }

    private Node mergeTwoheads1(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node current = dummy;
        while(head1 != null && head2 != null){
            if (head1.value < head2.value){
                current.next = head1;
                head1 = head1.next;
            }else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        while(head1!=null){
            current.next = head1;
            head1 = head1.next;
        }
        while (head2!=null){
            current.next = head2;
            head2 = head2.next;
        }
     return dummy.next;
    }

    private LinkedList<Integer> mergeTwoheads(Node head1, Node head2) {
        LinkedList<Integer> output = new LinkedList<>();
        while(head1!=null && head2 != null){
            if (head1.value < head2.value){
                output.add(head1.value);
                head1 = head1.next;
            }else{
                output.add(head2.value);
                head2 = head2.next;
            }
        }

        while(head1!=null){
            output.add(head1.value);
            head1 = head1.next;
        }
        while(head2!=null){
            output.add(head2.value);
            head2 = head2.next;
        }

        return output;
    }

    private void printNodes(Node head){
        while(head!=null){
            System.out.println(head.value);
            head = head.next;
        }
    }
}
