package com.bridgelabz.stacksandqueues;

import com.bridgelabz.linkedlist.LinkedList;

public class Stack<K> {
    LinkedList<K> linkedList;
    public Stack() {
        this.linkedList=new LinkedList<>();
    }

    void push(K key){
        linkedList.add(key);
    }
    void print(){
        linkedList.print();
    }
    K pop(){
        return linkedList.pop();
    }

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(70);
        stack.print();
        stack.push(30);
        stack.print();
        stack.push(56);
        stack.print();
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.pop());

    }
}