package learn_tree;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;

public class ZigZog {
    class Tree{
        int value;
        Tree left, right;
        public Tree(int value){
            this.value = value;
        }
    }
    @Test
    public void addTrees(){
        Tree head =  new Tree(1);
        head.left = new Tree(2);
        head.right = new Tree(3);
        head.left.left = new Tree(7);
        head.left.right = new Tree(6);
        head.right.left = new Tree(5);
        head.right.right = new Tree(4);
        findZigZog(head);
    }

    private void findZigZog(Tree head) {
        Deque<Tree> deque = new LinkedList<>();
        deque.addFirst(head);
        while (!deque.isEmpty()){

        }

    }
}
