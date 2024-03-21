package learn_tree;

import org.junit.Test;

public class MirrorTree {
    public class Tree{
        int value;
        Tree right,left;
        public Tree(int value){
            this.value = value;
        }
    }
    @Test
    public void addTree(){
        Tree head = new Tree(1);
        head.left = new Tree(2);
        head.right = new Tree(3);
        head.right.left = new Tree(4);
        printInorder(findMirrorTree(head));
    }

    private Tree findMirrorTree(Tree head) {
        if (head==null) return null;
        Tree temp = head.left;
        head.left = head.right;
        head.right = temp;
        findMirrorTree(head.left);
        findMirrorTree(head.right);
        return head;
    }

    private void printInorder(Tree head){
        if (head != null){
            printInorder(head.left);
            System.out.print(head.value + " --> ");
            printInorder(head.right);
        }
    }

}
