package learn_tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValueInEachLevel {
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
      System.out.println(findMaxValueInEachLevel(head));
    }

    private List<Integer> findMaxValueInEachLevel(Tree head) {
        Queue<Tree> queue = new LinkedList<>();
        queue.add(head);

        ArrayList<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                Tree poll = queue.poll();
                max = Math.max(max, poll.value);
                if (poll.left != null){
                    queue.add(poll.left);

                }
                if (poll.right!=null){
                    queue.add(poll.right);
                }

            }
            list.add(max);



        }
        return list;
    }
}
