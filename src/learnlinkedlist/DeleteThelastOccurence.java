package learnlinkedlist;

import org.junit.Test;

public class DeleteThelastOccurence {
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
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next = new Node(3);

        int target = 3;
        Node node = deleteLastOccurence(head, target);
        while(node != null){
            System.out.println(node.value);
            node = node.next;
        }

    }

    private Node deleteLastOccurence(Node head, int target) {
        int count =0;
        Node temp = head;
        while (temp != null){
            if (temp.value==target){
                count++;
            }
            temp = temp.next;
        }
        int count1 =0;
        Node cur = head;
        while (cur != null && cur.next != null){
            if(cur.next.value==target){
                count1++;
            }   if ( count==count1){
                cur.next = cur.next.next;
                return head;
            }
            cur = cur.next;
        }

        return null;

    }
}
