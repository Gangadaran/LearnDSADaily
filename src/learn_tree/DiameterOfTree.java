package learn_tree;

import org.junit.Test;

public class DiameterOfTree {
    public Tree root;
    class Tree{
        int value;
        Tree left,right;
        public Tree(int value){
            this.value = value;
        }
    }
   @Test
    public void addTree(){
        root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.right.left = new Tree(4);
        root.right.right = new Tree(6);
       System.out.println(maxDepth(root));
    }

    private int maxDepth(Tree root) {
        if (root == null){
            return 0;}
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1+Math.max(leftDepth, rightDepth);
    }
}
