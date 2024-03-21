package learn_tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
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
        System.out.println(zigZog(root));
    }

    private List<List<Integer>> zigZog(Tree root) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<Tree> queue = new LinkedList<>();
        queue.addFirst(root);
        boolean reverse = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
               if (!reverse){
                   Tree current = queue.pollFirst();
                   list.add(current.value);
                   if (current.left !=null){
                       queue.addLast(current.left);
                   }
                   if (current.right !=null){
                       queue.addLast(current.right);
                   }
               }else{
                   Tree current = queue.pollLast();
                   list.add(current.value);
                   if (current.right != null){
                       queue.addFirst(current.right);
                   }
                   if (current.left != null){
                       queue.addFirst(current.left);
                   }
               }
            }
           reverse = !reverse;
            result.add(list);
        }
        return result;
    }
}
