package learn_tree;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InorderTraversal {
    /*
    Binary Tree Inorder Traversal
     */
    public Tree root;

    class Tree{
        int value;
        Tree left;
        Tree right;
        public Tree(){}
        public Tree(int value){
            this.value = value;
        }
    }
    @Test
    public void addTree(){
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);
        root.left.right.left = new Tree(8);
        root.right.right.left = new Tree(9);
        root.right.right.right = new Tree(10);
        List<Integer> expected = inorderTraversal(root);
        System.out.println(expected);
    }

    public List<Integer> inorderTraversal(Tree root){
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;


    }

    private void helper(Tree root, List<Integer> list) {
        if (root != null){
            list.add(root.value);
            System.out.println(list);
            helper(root.left, list);
            helper(root.right, list);
        }
    }
}
