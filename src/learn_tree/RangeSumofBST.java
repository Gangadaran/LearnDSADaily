package learn_tree;

import org.junit.Test;

public class RangeSumofBST {
    public Tree root;
    public class Tree{
        int value;
        Tree right,left;
        public Tree(int value){
            this.value = value;
        }
    }
    @Test
    public void addTree(){
        root = new Tree(10);
        root.left = new Tree(5);
        root.right = new Tree(15);
        root.left.left = new Tree(3);
        root.left.right = new Tree(7);
        root.right.right = new Tree(18);
        int low = 7, high = 15;
        System.out.println(sumOfRange(root,low,high));

    }

    private int sumOfRange(Tree root, int low, int high) {
        if (root == null){
            return 0;
        }
        int sum =0;
        if (root.value >= low && root.value<=high){
            sum +=root.value;
        }
        sum +=sumOfRange(root.left,low,high);
        sum +=sumOfRange(root.right, low, high);
        return sum;
    }
}
