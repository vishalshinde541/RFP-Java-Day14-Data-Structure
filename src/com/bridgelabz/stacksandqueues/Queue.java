package com.bridgelabz.stacksandqueues;

import com.bridgelabz.linkedlist.LinkedList;

public class Queue<K> {
    LinkedList<K> linkedList;
    public Queue() {
        linkedList=new LinkedList<>();
    }

    public void add(K key){
        linkedList.append(key);
    }

    public void remove(){
        linkedList.pop();
    }
    public void print(){
        linkedList.print();
    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.add(56);
        queue.print();
        queue.add(30);
        queue.print();
        queue.add(70);
        queue.print();

        queue.remove();
        queue.print();
        queue.remove();
        queue.print();
        queue.remove();
    }
}