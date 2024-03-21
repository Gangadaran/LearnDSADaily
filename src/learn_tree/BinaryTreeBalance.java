package learn_tree;

import org.junit.Test;

public class BinaryTreeBalance {
    public class Tree{
        int value;
        Tree right,left;
        public Tree(int value){
            this.value = value;
        }
    }
    @Test
    public void addTree(){
        Tree head = new Tree(1);
        head.left = new Tree(2);
        head.right = new Tree(3);
        System.out.println(findBalancedTree(head));


    }

    private boolean findBalancedTree(Tree head) {
        if (head==null) return true;
        int left = getHeight(head.left);
        int right = getHeight(head.right);
        if (Math.abs(left-right)>1){
            return false;
        }
        return findBalancedTree(head.left) && findBalancedTree(head.right);
    }

    private int getHeight(Tree head) {
        if (head==null) return 0;
        int left1 = getHeight(head.left);
        int right1 = getHeight(head.right);
        return (left1 > right1) ? (left1+1):(right1+1);
    }
}
