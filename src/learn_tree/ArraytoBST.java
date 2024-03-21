package learn_tree;

public class ArraytoBST {
    public class Tree{
        int value;
        BinaryTree.Tree right,left;
        public Tree(int value){
            this.value = value;
        }
    }
    public void testCase(){
        int[] nums ={1,2,3,4};
        int left =0, right = nums.length-1;
        convertARRToBst(nums,left,right);
    }

    private Tree convertARRToBst(int[] nums,int left, int right) {
      if (left > right ){
          return null;
      }
      int mid = left +(right-left)/2;
      Tree head = new Tree(nums[mid]);

      return head;

    }
}
