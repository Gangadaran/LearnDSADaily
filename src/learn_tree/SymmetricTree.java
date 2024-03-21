package learn_tree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public Tree root;
    public class Tree{
        int value;
        Tree right, left;
        public Tree(int value){
            this.value = value;
        }
    }
    public void addTree(){
       root = new Tree(1);
        root.left =new Tree(2);
        root.right = new Tree(2);
        root.left.left = new Tree(3);
        root.left.right = new Tree(4);
        root.right.left =new Tree(4);
        root.right.right =new Tree(3);
        findShawdo(root);

    }

    private boolean findShawdo(Tree root) {
        Queue<Tree> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();

            if (size > 1){
                if (!isCorrect(queue.poll(),queue.poll())) return false;
            }


        }
        return true;
    }

    private boolean isCorrect(Tree poll, Tree poll1) {
        return poll.value==poll1.value;
    }


}
