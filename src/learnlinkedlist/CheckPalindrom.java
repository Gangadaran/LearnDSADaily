package learnlinkedlist;

import org.junit.Test;

public class CheckPalindrom {
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    @Test
    public void testCase(){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        findPalindrom(head);

    }

    private void findPalindrom(Node head) {

    }

    private boolean palindromCheck(String name) {
        char[] chars = name.toCharArray();
        int left =0, right = chars.length-1;
        while(left < right){
            if (chars[left] != chars[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
