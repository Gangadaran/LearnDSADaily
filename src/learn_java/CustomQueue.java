package learn_java;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    private int end=0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length-1;
    }
    public boolean isEmpty(){
        return end==0;
    }

    public boolean insert(int value) throws Exception{
        if (isFull()){
           return false;
        }
        data[end++] = value;
        return true;

    }

    public int remove(){
        if (isEmpty()){
            throw new RuntimeException("Queue is full");
        }
        int remove = data[0];
        for (int i = 1; i <end ; i++) {
            data[i-1] = data[i];
        }
        end--;
      return remove;
    }

    public int front(){
        if (isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return data[0];
    }
}
