package learnlinkedlist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {

    public Node list1, list2;
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }

    @Test
    public void addNodes(){
        list1 = new Node(2);
        list1.next = new Node(4);
        list1.next.next = new Node(3);

        list2 = new Node(5);
        list2.next = new Node(6);
        list2.next.next = new Node(4);
        addTwoNumber(list1,list2);



    }

    private void addTwoNumber(Node list1, Node list2) {

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
