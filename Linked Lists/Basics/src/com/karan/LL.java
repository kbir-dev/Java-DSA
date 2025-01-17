package com.karan;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    LL(){
        size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size = size + 1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    private class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }

        Node(int val , Node next){
            this.value = value;
            this.next = next;
        }
    }
}
