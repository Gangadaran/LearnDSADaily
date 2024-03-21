package learnlinkedlist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesfromSortedList {public Node list1, list2;
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }

    public List<Integer> printNodes(Node node){
        List<Integer> list = new ArrayList<>();
        while (node != null){
            list.add(node.value);
            node = node.next;
        }
        return list;
    }

    @Test
    public void addNodes(){
        list1 = new Node(1);
        list1.next = new Node(1);
        list1.next.next = new Node(2);
        list1.next.next.next = new Node(3);
        list1.next.next.next.next = new Node(3);

        removeDuplicateFromLinkedList(list1);
        System.out.println(printNodes(list1));

    }

    private void removeDuplicateFromLinkedList(Node list1) {
        while (list1 != null && list1.next !=null){
            if (list1.value==list1.next.value){
                list1.next = list1.next.next;
            }
            list1 = list1.next;
        }
    }



}
