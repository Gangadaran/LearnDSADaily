package learn_tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevel {
    public Tree root;
    public class Tree {
        int value;
        Tree right;
        Tree left;
        public Tree(int value){
            this.value = value;
        }
    }
    @Test
    public void attachTree(){
        root =  new Tree(3);
        root.left = new Tree(9);
        root.right = new Tree(20);
        root.right.left = new Tree(15);
        root.right.right = new Tree(7);
        System.out.println(AverageOfLevelsInBinaryTree(root));
    }

    private List<Double> AverageOfLevelsInBinaryTree(Tree root) {
        List<Double> result = new ArrayList<>();
        Queue<Tree> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            double average = 0;
            for (int i = 0; i < size ; i++) {
                Tree current = queue.poll();
                average += current.value;
                if (current.left !=null){
                    queue.offer(current.left);
                }
                if (current.right!=null){
                    queue.offer(current.right);
                }
            }

            average = average/size;
            result.add(average);

        }
        return result;
    }
}
