package treetraversal;

import org.junit.Test;

public class InOrderTraversal {
    public class Tree{
        char value;
        Tree right,left;
        public Tree(char value){
            this.value = value;
        }
    }
    @Test
    public void addTree(){
        Tree head = new Tree('A');
        head.left = new Tree('B');
        head.right = new Tree('C');
        head.left.left = new Tree('D');
        head.left.right = new Tree('E');
        findInOrderTraversal(head);
        System.out.print("null");

    }

    private void findInOrderTraversal(Tree head) {
        if (head==null) return;
        findInOrderTraversal(head.left);
        System.out.print(head.value + " --> ");
        findInOrderTraversal(head.right);
    }
}
