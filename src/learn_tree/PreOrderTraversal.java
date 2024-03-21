package learn_tree;

import org.junit.Test;

public class PreOrderTraversal {
    public Tree root;
    class Tree{
        int value;
        Tree left;
        Tree right;
        Tree(int value){
           this.value = value;
        }
    }
    @Test
    public void addTree(){
        root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.left.right.left = new Tree(6);
        root.right.left = new Tree(7);
        root.right.right = new Tree(8);
        root.right.right.left = new Tree(9);
        root.right.right.right = new Tree(10);
        preOderTraversal(root);
    }

    private void inOrderTraversal(Tree root) {
        if (root==null) return;
        inOrderTraversal(root.left);
        System.out.println(root.value);
        inOrderTraversal(root.right);
    }

    private void preOderTraversal(Tree root) {
         if (root==null) return;
        System.out.print(root.value+ " --> ");
        preOderTraversal(root.left);
        preOderTraversal(root.right);

    }

}
