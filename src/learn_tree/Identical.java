package learn_tree;

import org.junit.Test;

public class Identical {

    class Node{
        int value;
        Node left, right;
        public Node(int value){
            this.value = value;
        }
    }
    @Test
    public void addNodes(){
       Node head1 = new Node(1);
       head1.left = new Node(2);
       head1.right = new Node(3);
       head1.left.left = new Node(4);

       Node head2 = new Node(1);
       head2.left = new Node(2);
       head2.right = new Node(3);
       head2.left.left = new Node(4);

        System.out.println(findIdentical(head1,head2));

    }

    private boolean findIdentical(Node head1, Node head2) {

        if (head1 == null && head2==null) return true;
        if (head1 == null || head2==null) return false;
        boolean leftIdentical = findIdentical(head1.left, head2.left);
        boolean rightIdentical = findIdentical(head1.right, head2.right);
        return leftIdentical && rightIdentical;

    }
}
