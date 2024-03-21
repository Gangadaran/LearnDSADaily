package learn_tree;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

public class InvertBT {
    class Tree{
        int value;
        Tree left, right;
        public Tree(int value){
            this.value = value;
        }
    }
    @Test
    public void addTrees(){
        Tree head =  new Tree(4);
        head.left = new Tree(2);
        head.right = new Tree(7);
        head.left.left = new Tree(1);
        head.left.right = new Tree(3);
        head.right.left = new Tree(6);
        head.right.right = new Tree(9);
        inOrder(revertBianaryTree(head));


    }

    private Tree revertBianaryTree(Tree head) {
        if (head==null){
            return null;
        }
        Tree temp = head.left;
        head.left = head.right;
        head.right = temp;
        revertBianaryTree(head.left);
        revertBianaryTree(head.right);
        return head;
    }

    private void inOrder(Tree root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.value+ " --> ");
        inOrder(root.right);

        Deque<Integer> deque = new LinkedList<>();

    }
}
