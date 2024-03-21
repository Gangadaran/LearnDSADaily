package learn_tree;

import org.junit.Test;

import java.util.*;

public class BinaryTreeRightSideView {
    public Tree root;
    public class Tree{
        Tree right, left;
        int value;
        public Tree(int value){
            this.value = value;
        }
    }
    @Test
    public void addTree(){
       root = new Tree(1);
       root.left = new Tree(2);
       root.right = new Tree(3);
       root.left.right = new Tree(5);
       root.right.right = new Tree(4);
       System.out.println(rightSideView(root));

    }



    private List<Integer> rightSideView(Tree root) {

        List<Integer> result = new ArrayList<>();
        if (root==null) return result;
        Queue<Tree> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Tree current = queue.poll();
                if (i == size-1){
                    result.add(current.value);
                }
                if (current.left != null){
                    queue.offer(current.left);
                }
                if (current.right != null){
                    queue.offer(current.right);
                }
            }
        }
        return result;

    }
}
