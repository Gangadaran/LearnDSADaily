package learn_tree;

import org.junit.Test;

import java.util.*;

public class AllNodesDistanceKinBinaryTree {

    class Tree {
        int value;
        Tree left, right;

        public Tree(int value) {
            this.value = value;
        }
    }

    @Test
    public void addTree() {
        AllNodesDistanceKinBinaryTree treeProcessor = new AllNodesDistanceKinBinaryTree(); // Create an instance
        Tree root = treeProcessor.new Tree(3); // Use the instance to create Tree nodes
        root.left = treeProcessor.new Tree(5);
        root.right = treeProcessor.new Tree(1);
        root.left.left = treeProcessor.new Tree(6);
        root.left.right = treeProcessor.new Tree(2);
        root.left.right.left = treeProcessor.new Tree(7);
        root.left.right.right = treeProcessor.new Tree(4);
        root.right.left = treeProcessor.new Tree(0);
        root.right.right = treeProcessor.new Tree(8);
        Tree target = root.left;
        int k = 2;
        List<Integer> list = new ArrayList<>();
        treeProcessor.findTargeted(target, k, list); // Call the instance method
        Map<Tree,Tree> map = new LinkedHashMap<>();
        buildParent(root,null, map);
        System.out.println(map);


    }

    private void findTargeted(Tree target, int k, List<Integer> list) {
        if (target == null) {
            return;
        }
        if (k == 0) {
            list.add(target.value);
            return;
        }
        findTargeted(target.left, k - 1, list);
        findTargeted(target.right, k - 1, list);
    }

    private void buildParent(Tree node, Tree p, Map<Tree, Tree> parent){
        if (node==null){
            return;
        }
        parent.put(node,p);
        buildParent(node.left,node,parent);
        buildParent(node.right,node,parent);
    }
}
