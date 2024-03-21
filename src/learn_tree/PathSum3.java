package learn_tree;

import org.junit.Test;

public class PathSum3 {
    class Tree{
        int value;
        Tree left, right;
        public Tree(int value){
            this.value = value;
        }
    }
    @Test
    public void addTrees(){
        Tree root =  new Tree(10);
        root.left = new Tree(5);
        root.right = new Tree(-3);
        root.left.left = new Tree(3);
        root.left.right = new Tree(2);
        root.left.left.left = new Tree(3);
        root.left.left.right = new Tree(-2);
        root.right.right = new Tree(11);
        int target = 8;
        System.out.println(findPaths3(root,target));

    }

    private int findPaths3(Tree root,int target) {
        if (root==null){
            return 0;
        }
        int count =0;
        if (root.value==target){

            count++;
        }
        count += findPaths3(root.left, target-root.value);
        count += findPaths3(root.right, target-root.value);
        return count;
    }
}
