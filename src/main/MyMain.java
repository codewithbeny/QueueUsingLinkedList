package main;

import implementation.MyQueue;

public class MyMain {
    public static void main(String[] args) {
        MyQueue <Integer> queue =new MyQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
       queue.enqueue(30);
        queue.traverse();
      //  System.out.println(queue.dequeue());
    }
}
