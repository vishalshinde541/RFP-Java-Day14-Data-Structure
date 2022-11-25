package com.bridgelabz.stacksandqueues;

import com.bridgelabz.linkedlist.LinkedList;

import javax.swing.*;
import java.util.Date;

public class Deque<K> {
    LinkedList<K> linkedList;
    public Deque() {
        linkedList=new LinkedList<>();
    }
    public void add(K key){
        linkedList.append(key);
    }

    public void remove(){
        linkedList.pop();
    }
    public void removeLast(){
        linkedList.popLast();
    }
    public void print(){
        linkedList.print();
    }

    public static void main(String[] args) {
        Deque deque=new Deque();
        deque.add(56);
        deque.print();
        deque.add(30);
        deque.print();
        deque.add(70);
        deque.print();

        deque.remove();
        deque.print();

        deque.removeLast();
        deque.print();
    }
}