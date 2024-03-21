package learn_tree;

public class Learn_Tree {
   private Tree root;
    class Tree{
        private int value;
        private Tree left;
        private Tree right;
        public Tree(int value){
            this.value = value;
        }
    }

    public void createBinaryTree(){
        Tree first = new Tree(1);
        Tree second = new Tree(2);
        Tree third= new Tree(3);
        Tree fourth = new Tree(4);
        Tree fifth= new Tree(5);
        root = first;
        root.left = second;
        root.right =third;

        second.left = fourth;
        second.right = fifth;

    }

}
