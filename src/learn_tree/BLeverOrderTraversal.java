package learn_tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BLeverOrderTraversal {
    class Tree{
        int value;
        Tree left, right;
        public Tree(int value){
            this.value = value;
        }
    }
    @Test
    public void addTrees(){
        Tree root =  new Tree(3);
        root.left = new Tree(9);
        root.right = new Tree(20);
        root.right.left = new Tree(15);
        root.right.right = new Tree(7);
        System.out.println(findLevelOrder(root));

    }

    private List<List<Integer>> findLevelOrder(Tree root) {
        Queue<Tree> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer>  list1 = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Tree poll =queue.poll();
                list1.add(poll.value);
                if (poll.left!=null){
                    queue.add(poll.left);
                }
                if (poll.right!=null){
                    queue.add(poll.right);
                }
            }
            list.add(list1);
        }
        return list;
    }
}
