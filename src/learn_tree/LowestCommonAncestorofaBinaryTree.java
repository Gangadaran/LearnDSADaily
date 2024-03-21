package learn_tree;

import org.junit.Test;

public class LowestCommonAncestorofaBinaryTree {
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
        root.left = new Tree(5);
        root.right = new Tree(1);
        root.left.left = new Tree(6);
        root.left.right = new Tree(2);
        root.left.right.left = new Tree(7);
        root.left.right.right = new Tree(4);
        root.right.left = new Tree(0);
        root.right.right = new Tree(8);
        Tree p = new Tree(5);
        Tree q = new Tree(1);
        System.out.println(findLCA(root,p,q));
    }

    private Tree findLCA(Tree root,Tree p,Tree q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        // Check for LCA in the left subtree
        Tree left = findLCA(root.left, p, q);

        // Check for LCA in the right subtree
        Tree right = findLCA(root.right, p, q);

        // If both left and right are not null, it means both p and q are found in
        // different subtrees, hence, the current root is the LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return the non-null node (either left or right) which could be the LCA
        return left != null ? left : right;
    }
}
