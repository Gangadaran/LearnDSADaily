package learnlinkedlist;

import java.util.LinkedList;

public class Demo {
    public Node head, tail;
    public int size;

    public Demo(){
        this.size = 0;
    }

    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }

    public void insertFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null){
            tail= head;
        }
        size++;
    }

    public void display(Node node){
        while(node != null){
            System.out.print(node.value+"--> ");
            node = node.next;
        }
        System.out.println("End");
    }
    public void insertLast(int value){
        Node newNode = new Node(value);
        if (head==null){
            insertFirst(value);
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public boolean deleteFirst(){
        if (head==null) return false;
        head = head.next;
        if (head==null){
            tail = head;
        }
        size--;
        return true;
    }
    public boolean deleteLast(){
        if (head==null) return false;
        return true;
    }

    public void insertAtIndex(int index, int value){
        if(index < 0 || index > size) return;
        if (index==0){
            insertFirst(value);
        }
        if (index==size){
            insertLast(value);
        }
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.insertLast(5);
        demo.insertLast(4);
        demo.insertLast(3);
        demo.insertLast(2);
        demo.insertLast(1);
        demo.insertAtIndex(4, 7);
        demo.display(demo.head);
    }



}
