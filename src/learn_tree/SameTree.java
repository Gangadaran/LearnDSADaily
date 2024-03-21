package learn_tree;

import org.junit.Test;

public class SameTree {
    public Tree root1, root2;
    private class Tree{
        private int value;
        private Tree left;
        private Tree right;
        public Tree(){

        }
        public Tree(int value){
            this.value = value;
        }

    }
    @Test
    public void addBinaryTree(){
         root1 = new Tree(1);
         root1.left = new Tree(2);
         root1.right = new Tree(3);
         root2 = new Tree(1);
        root2.left = new Tree(2);
        root2.right = new Tree(4);
        System.out.println(sameTree(root1,root2));


    }

    private boolean sameTree(Tree root1, Tree root2) {
      if(root1==null && root2==null) return true;
      if (root1==null || root2==null) return false;
      if (root1.value!=root2.value) return false;
      return sameTree(root1.left,root1.left) && sameTree(root1.right,root2.right);


    }


}
