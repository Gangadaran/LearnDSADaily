package learn_tree;

import org.junit.Test;

public class BinaryTree {
    public class Tree{
        int value;
        Tree right,left;
        public Tree(int value){
            this.value = value;
        }
    }
    @Test
    public void addTree(){
        Tree head = new Tree(4);
        head.left = new Tree(2);
        head.right = new Tree(4);
        head.left.left = new Tree(1);
        head.left.right = new Tree(0);
        System.out.println(findBinarySearchTree(head));



    }

    private boolean findBinarySearchTree(Tree head) {
        if (head == null ){
            return true;
        }
        if (head.left!=null && head.left.value < head.value) return false;
        if (head.right != null && head.right.value > head.value) return false;
       return findBinarySearchTree(head.left) && findBinarySearchTree(head.right);
    }
}
