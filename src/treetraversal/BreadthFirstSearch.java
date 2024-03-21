package treetraversal;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

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
        findLeveOrderTraversal(head);

    }

    private void findLeveOrderTraversal(Tree head) {

        Queue<Tree> queue = new LinkedList<>();
        queue.add(head);
        while(!queue.isEmpty()){
            Tree temp = queue.poll();
            System.out.print(temp.value + " --> ");
            if (temp.left != null ){
                queue.add(temp.left);
            }
            if (temp.right != null){
                queue.add(temp.right);
            }

        }
        System.out.println("null");
    }
}
