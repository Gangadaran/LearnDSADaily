package learnlinkedlist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinked {
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
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        Node prev = null;

        System.out.println(printNodes(reverseNodes1(head,prev)));




    }

    private Node reverseNodes1(Node head,Node prev) {


        if (head == null){
            return prev;
        }

        Node nextNode = head.next;
        head.next = prev;
        prev = head;
        return reverseNodes1(nextNode,prev);
    }

    private Node reverseNodes(Node head) {
        Node prev = null;
        Node current = head;
        Node nextNode;
        while (current != null){
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
        return head;
    }

    public List<Integer> printNodes(Node node){
        List<Integer> list = new ArrayList<>();
        while (node != null){
            list.add(node.value);
            node = node.next;
        }
        return list;
    }


}
