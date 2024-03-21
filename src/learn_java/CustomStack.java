package learn_java;

import java.util.*;

public class CustomStack {
   protected int[] data;
   private int index =-1;
   private static final int DEFAULT_SIZE = 10;
   public CustomStack(int size){
       this.data = new int[size];
   }
   public CustomStack(){
       this(DEFAULT_SIZE);
   }

    public boolean push(int value){
       if (isFull()){
           int[] temp = new int[data.length*2];
           for (int i = 0; i < data.length; i++) {
               temp[i] = data[i];
           }
           data = temp;

       }
       data[++index] = value;
        System.out.println(index);
       return true;
    }
    public int pop(){
       if (isEmpty()){
           throw new RuntimeException("stack is empty");

       }

       return data[index--];
    }

    private boolean isFull() {
       return index==data.length-1;
    }

        public boolean isEmpty(){
       return index==-1;
        }

    public int peek(){
       if (isEmpty()){
           System.out.println("this is empty stack");
       }
       return data[index];
    }
}
