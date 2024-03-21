package treetraversal;

import org.junit.Test;

public class PostOrderTraversal {
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
        findPostOrderTraversal(head);
        System.out.print("null");

    }

    private void findPostOrderTraversal(Tree head) {
        if (head==null) return;
        findPostOrderTraversal(head.left);
        findPostOrderTraversal(head.right);
        System.out.print(head.value+" --> ");
    }
}
