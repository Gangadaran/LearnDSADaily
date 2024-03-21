package learn_tree;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class FindNode {
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
    root = new Tree(1);
    root.left = new Tree(2);
    root.right = new Tree(3);
    root.left.left = new Tree(4);
    root.right.right = new Tree(5);
    int x = 4;
    System.out.println(findTheSpecificNode(root,x).value);
}

    private Tree findTheSpecificNode1(Tree root, int x) {
        Queue<Tree> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Tree current = queue.poll();
                if (current.value==x) return current;
                if (current.left != null){
                    queue.offer(current.left);
                }
                if (current.right != null){
                    queue.offer(current.right);
                }
            }
        }
        return null;
    }

    private Tree findTheSpecificNode(Tree root, int x) {
    if (root==null) return null;
    if (root.value==x) return root;
    Tree leftResult = findTheSpecificNode(root.left, x);
    Tree rightResult = findTheSpecificNode(root.right, x);
    if (leftResult !=null){
        return leftResult;
    }else{
        return rightResult;
    }

    }

}
