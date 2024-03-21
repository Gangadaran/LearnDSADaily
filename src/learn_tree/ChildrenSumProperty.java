package learn_tree;

import org.junit.Test;

public class ChildrenSumProperty {
    public class Tree{
        int value;
        Tree right,left;
        public Tree(int value){
            this.value = value;
        }
    }
    @Test
    public void addTree(){
        Tree head = new Tree(10);
        head.left = new Tree(8);
        head.right = new Tree(2);
        head.left.left = new Tree(3);
        head.left.right = new Tree(5);
        head.right.left = new Tree(2);
        System.out.println(findSumOfChildrens(head));


    }

    private boolean findSumOfChildrens(Tree head) {
       if (head==null || (head.left==null && head.right==null)){
           return true;
       }
       int sum =0;
       if (head.left!=null){
           sum +=head.left.value;
       }
       if (head.right!=null){
           sum += head.right.value;
       }

       return (head.value==sum) && findSumOfChildrens(head.left) && findSumOfChildrens(head.right);

    }
}
