package treetraversal;

import org.junit.Test;

public class PreOrderTraversal {
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
        findPreOrderTraversal(head);
        System.out.print("null");

    }

    private void findPreOrderTraversal(Tree head) {
        if (head==null){
            return;
        }
        System.out.print(head.value+ " --> ");
        findPreOrderTraversal(head.left);
        findPreOrderTraversal(head.right);

    }
}
