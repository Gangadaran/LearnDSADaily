package learnlinkedlist;

import org.junit.Test;

public class RemoveLinkedList {
    public Node head;
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }

    @Test
    public void addNodes(){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(6);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(6);
        int value = 6;

     printValues(removelements(head,value));



    }



    private Node removelements(Node head,int val) {
        Node current = head;
        while(current != null && current.next !=null){
            if (current.next.value == val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }


    private void printValues(Node head){
        while(head != null){
            System.out.println(head.value);
            head = head.next;
        }
    }
}
