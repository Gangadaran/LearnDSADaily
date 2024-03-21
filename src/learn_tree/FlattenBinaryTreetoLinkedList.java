package learn_tree;

import org.junit.Test;

import java.util.LinkedList;

public class FlattenBinaryTreetoLinkedList {
    class Tree{
        int value;
        Tree left, right;
        public Tree(int value){
            this.value = value;
        }
    }
    @Test
    public void addTrees(){
        Tree head =  new Tree(1);
        head.left = new Tree(2);
        head.right = new Tree(5);
        head.left.left = new Tree(3);
        head.left.right = new Tree(4);
        head.right.right = new Tree(6);

        System.out.println(convertToLinkedList(head));
    }

    private LinkedList<Integer> convertToLinkedList(Tree head) {
        LinkedList<Integer> list = new LinkedList<>();
        if (head==null){
            return list;
        }
        list.add(head.value);
        list.addAll(convertToLinkedList(head.left));
        list.addAll(convertToLinkedList(head.right));
        return list;
    }
}
