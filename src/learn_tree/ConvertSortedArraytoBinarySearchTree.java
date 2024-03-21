package learn_tree;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedArraytoBinarySearchTree {

    private class Tree{
        private int value;
        private Tree left;
        private Tree right;
        public Tree(){

        }
        public Tree(int value){
            this.value = value;
        }

    }




    @Test
    public void example(){
        int[] nums = {-10,-3,0,5,9};
        List<Integer> list = new ArrayList<>();
        printBTS(convertToBTS(nums,0,nums.length-1, list));
        System.out.println(list);
    }




    private Tree convertToBTS(int[] nums, int start, int end, List<Integer> list) {
        if (start > end){
            return null;
        }


        int mid = start + (end - start)/2;
        Tree root =new Tree(nums[mid]);
        list.add(nums[mid]);

        root.left = convertToBTS(nums,start,mid-1,list);
        root.right = convertToBTS(nums,mid+1,end,list);
        return root;
    }



    private void printBTS(Tree root){
        if (root==null){
            return;
        }

        printBTS(root.left);
        System.out.print(root.value + " ");
        printBTS(root.right);

    }
}
