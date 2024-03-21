package learn_tree;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class FindMaxInBT {
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
        int maxOfBT1 = findMaxOfBT1(root);
        System.out.println(maxOfBT1);


    }

    private int findMaxOfBT1(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int leftMax = findMaxOfBT1(root.left);
        int rightMax = findMaxOfBT1(root.right);

        return Math.max(root.value, Math.max(leftMax, rightMax));
    }

    private int findMaxOfBT(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int max = Integer.MIN_VALUE;
        while (!queue.isEmpty()){
            TreeNode nodeData = queue.poll();
            if (nodeData.value > max){
                max = nodeData.value;
            }
            if (nodeData.left != null){
                queue.add(nodeData.left);
            }
            if (nodeData.right != null){
                queue.add(nodeData.right);
            }

        }
        System.out.println(max);
        return max;
    }
}
