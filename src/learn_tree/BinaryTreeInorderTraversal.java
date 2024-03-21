package learn_tree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    static class Tree{
        int value;
        Tree left, right;
        public Tree(int value){
            this.value = value;
        }

        @Test
        public void addTrees(){

        }

        public static void main(String[] args) {
            Tree root = new Tree(1);
            root.right = new Tree(2);
            root.right.left = new Tree(3);
            System.out.println(inOrderTraversal1(root));
        }


        private static List<Integer> inOrderTraversal1(Tree root) {
            List<Integer> list = new ArrayList<>();
            if (root==null){
                return list;
            }
            list.addAll(inOrderTraversal1(root.left));
            list.add(root.value);
            list.addAll(inOrderTraversal1(root.right));
            return list;

        }
    }
}
