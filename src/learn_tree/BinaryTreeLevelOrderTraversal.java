package learn_tree;

import org.junit.Test;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
   public Tree root;
   public class Tree{
       int value;
       Tree left, right;
       public Tree(){

       }
       public Tree(int value){
           this.value = value;
       }

   }
   @Test
   public void addBinaryTree(){
     root = new Tree(3);
     root.left = new Tree(9);
     root.right = new Tree(20);
     root.right.left = new Tree(15);
     root.right.right = new Tree(7);
       System.out.println(leverOrder(root));
   }

   public List<List<Integer>> leverOrder(Tree root){
       List<List<Integer>> result = new ArrayList<>();
       Queue<Tree> queue = new LinkedList<>();
       queue.offer(root);
       while (!queue.isEmpty()){
           int size = queue.size();
           List<Integer> list = new ArrayList<>();
           for (int i = 0; i < size; i++) {
               Tree current = queue.poll();
               list.add(current.value);
               if (current.left != null){
                   queue.offer(current.left);
               }
               if (current.right != null){
                   queue.offer(current.right);
               }
           }
           result.add(list);
       }
    return result;
   }
}
