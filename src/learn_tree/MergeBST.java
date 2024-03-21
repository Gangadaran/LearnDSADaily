package learn_tree;

import org.junit.Test;

public class MergeBST {
    public Tree root1,root2;
    public class Tree{
        int value;
        Tree right,left;
        public Tree(int value){
            this.value = value;
        }
    }
    @Test
    public void addTree(){
        root1 = new Tree(1);
        root1.left = new Tree(3);
        root1.right = new Tree(2);
        root1.left.left = new Tree(5);

        root2 = new Tree(2);
        root2.left = new Tree(1);
        root2.right = new Tree(3);
        root2.left.right = new Tree(4);
        root2.right.right = new Tree(7);
        inorderTraversal(mergeTrees(root1, root2));

    }

    private Tree mergeTrees(Tree root1, Tree root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        Tree mergedNode = new Tree(root1.value + root2.value);
        mergedNode.left = mergeTrees(root1.left, root2.left);
        mergedNode.right = mergeTrees(root1.right, root2.right);
        return mergedNode;
    }

    public void inorderTraversal(Tree root) {
        if (root != null) {
            System.out.print(root.value + " ");
            inorderTraversal(root.left);

            inorderTraversal(root.right);
        }
    }
}
