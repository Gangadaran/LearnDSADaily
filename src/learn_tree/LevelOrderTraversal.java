package learn_tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public Tree root;
    class Tree{
        int value;
        Tree right, left;
        public Tree(int value){
            this.value = value;
        }
    }

    @Test
    public void createTree(){
      root =  new Tree(3);
      root.left = new Tree(9);
      root.right = new Tree(20);
      root.right.left = new Tree(15);
      root.right.right = new Tree(7);
        System.out.println(levelOrder(root));
    }

    private List<List<Integer>> levelOrder(Tree root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root==null) return result;
        Queue<Tree> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> current = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Tree currentNode = queue.poll();
                current.add(currentNode.value);
                if (currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(current);
        }
        return result;
    }
}
