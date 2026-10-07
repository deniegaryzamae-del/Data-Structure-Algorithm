
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
public class LinkedQueue {
    private Node front;
    private Node rear;
    
   private class Node {
        Computer data;
        Node next;
        public Node (Computer c) {
            data = c;
            next = null;
    }
  }
   public LinkedQueue() {
       front = null;
       rear = null;
       
   }
 public void enqueue (Computer c) {
     Node newNode = new Node (c);
      if (isEmpty()) {
         front =newNode;
         rear = newNode;
     }else  {
          rear.next = newNode;
          rear = newNode;
      }
 }
 public Computer dequeue() {
     if (isEmpty()) {
         System.out.println("Queue is Empty");
         return null;
         
     }
      Computer val = front.data;
        front = front.next;
        if (front == null) rear = null;
        return val;
    }
     public Object peekFront() {
        if (isEmpty()){
            System.out.println("Queue is Empthy");
            return null;
        }
        return front.data;
 }
       public boolean isEmpty() {
        return front == null;
    }
    public void displayContents() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return;
        }
        Node curr = front;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
        
    }
}

    
