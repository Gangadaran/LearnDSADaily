package learnlinkedlist;

public class DoublyLinkedListCustom {
    public Node head,tail;
    public int size;
    class Node{
        int value;
        Node next;
        Node before;
        public Node(int value){
            this.value = value;
        }
    }

    public void insert(int value){
        Node newNode = new Node(value);
        head = newNode;

    }
    public void insertFirst(int value){
        Node newNode = new Node(value);
        if (head==null){
            head = newNode;
            tail = head;
        }

        head.before = newNode;
        newNode.next = head;
        head = newNode;



    }


}
