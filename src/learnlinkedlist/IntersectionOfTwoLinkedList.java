package learnlinkedlist;

import org.junit.Test;

public class IntersectionOfTwoLinkedList {
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    @Test
    public void addNodes(){
        Node head1 = new Node(4);
        head1.next = new Node(1);
        Node newNode = new Node(8);
        head1.next.next = newNode;
        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(1);
        head2.next.next.next = newNode;
        newNode.next = new Node(4);
        newNode.next.next = new Node(5);
        System.out.println(intersectionOfList(head1,head2).value);
    }

    private  Node intersectionOfList(Node head1, Node head2) {
        if (head1 == null || head2==null) return null;
        Node tail1 = head1;
        Node tail2 = head2;
        int length1 = 1;
        int length2 = 1;

        while (tail1.next != null){
            tail1 = tail1.next;
            length1++;
        }

        while (tail2.next != null){
            tail2 = tail2.next;
            length2++;
        }

        int diff = Math.abs(length1-length2);
        Node longer = length1 > length2 ? head1:head2;
        System.out.println(longer.value);
        Node shorter = length1 > length2 ? head2 : head1;
        System.out.println(shorter.value);
        while (diff > 0) {
            longer = longer.next;
            diff--;
        }
        System.out.println(longer.value);

        // Step 4: Traverse both lists simultaneously to find intersection
        while (longer != null && shorter != null) {
            if (longer == shorter)
                return longer;
            longer = longer.next;
            shorter = shorter.next;
        }

        // No intersection found
        return null;

    }
}
