package learnlinkedlist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DetectLoop {
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
        head.next.next.next.next.next = head.next;
        findLoop(head);

    }

    private boolean findLoop(Node head) {
        List<Node> list = new ArrayList<>();
        Node current = head;
        while(current != null){
            list.add(current);
            current = current.next;
        }

        while (head != null){
            if (list.contains(head.next)) return true;
            head = head.next;
        }
        return false;

    }
}
