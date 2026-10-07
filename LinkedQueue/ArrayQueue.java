/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedQueue;

import data.Computer;

/**
 *
 * @author User
 */
public class ArrayQueue {
    private Computer[] queue;
    private int front, rear,size, capacity;
    
    public ArrayQueue(int cap) {
        capacity = cap;
        queue = new Computer[capacity];
        front = 0;
        rear = 1;
        size = 0;
        
    }
    public void enqueue(Computer item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = ( rear + 1) % capacity; 
        queue[rear] = item;
        size++;
    }
    public Computer dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        Computer removed = queue [front];
        front = (front + 1) % capacity;
        size--;
        return removed;
    }
    public Computer peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        return queue[front];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() { 
        return size == capacity ;
        
    }
    public void displayContents() {
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return;
        }
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % capacity;
            System.out.println(queue[idx].toString());
        }
    }

    
            
}
