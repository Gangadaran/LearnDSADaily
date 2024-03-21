package learnlinkedlist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoLinkedList {
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
        list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);

        list2 = new Node(0);
        list2.next = new Node(3);
        list2.next.next = new Node(4);


        System.out.println(printNodes(mergeTwoLinkedListRec(list1,list2)));

    }

    public List<Integer> printNodes(Node node){
        List<Integer> list = new ArrayList<>();
        while (node != null){
            list.add(node.value);
            node = node.next;
        }
        return list;
    }

    private Node mergeTwoLinkedListRec(Node list1, Node list2) {
        if (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                list1.next = mergeTwoLinkedListRec(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLinkedListRec(list1, list2.next);
                return list2;
            }
        }
        return (list1 == null) ? list2 : list1;
    }

    private LinkedList<Integer> mergeTwoLinkedList(Node list1, Node list2) {
        LinkedList<Integer> result = new LinkedList<>();
        while (list1 !=null && list2 !=null){
           if (list1.value < list2.value){
               result.add(list1.value);
               list1 = list1.next;

           }else {
               result.add(list2.value);
               list2 = list2.next;

           }
        }

        while (list1 !=null){
            result.add(list1.value);
            list1 = list1.next;
        }
        while (list2 != null){
            result.add(list2.value);
            list2 = list2.next;
        }
        return result;
    }
}
