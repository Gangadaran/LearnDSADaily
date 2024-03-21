package learn_tree;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class findSuccersor {
    public Tree root;
    class Tree{
        int value;
        Tree right;
        Tree left;
        public Tree(int value){
            this.value = value;
        }
    }
    @Test
    public void addTrees(){
        root = new Tree(3);
        root.left = new Tree(4);
        root.right = new Tree(5);
        root.left.left = new Tree(6);
        root.left.right = new Tree(7);
        root.right.left = new Tree(8);
        root.right.right = new Tree(9);
        int key = 4;
        System.out.println(findNextValue(root,key));
    }

    private int findNextValue(Tree root, int key) {
        if (root==null) return 0;
        Queue<Tree> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Tree current = queue.poll();
            if (current.left != null){
                queue.offer(current.left);
            }
            if (current.right != null){
                queue.offer(current.right);
            }
            if (current.value==key) return queue.poll().value;
        }
        return -1;
    }
}
