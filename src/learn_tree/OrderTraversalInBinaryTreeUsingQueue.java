package learn_tree;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class OrderTraversalInBinaryTreeUsingQueue {

    public class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;


        public TreeNode(int value) {
            this.value = value;
        }
    }
    @Test
    public void example(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        levelOfTraversal(root);


    }
    public void levelOfTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode nodeData = queue.poll();
            System.out.println(nodeData.value+ " ");
            if (nodeData.left != null){
                queue.add(nodeData.left);
            }
            if (nodeData.right != null){
                queue.add(nodeData.right);
            }

        }

    }
}
