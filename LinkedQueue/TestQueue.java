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
public class TestQueue {
    public static void main(String[] args) {
   
        
        LinkedQueue queue = new LinkedQueue ();
        queue.enqueue(new Computer("Dell", "8", 100));
         queue.enqueue(new Computer("HP", "16", 1000));
          queue.enqueue(new Computer("lenovo", "32", 3000));
          System.out.println("Front of the queue: " + queue.peekFront());
          System.out.println("\nQueue Contents: ");
          queue.displayContents();
          System.out.println("\nDequeue: " + queue.dequeue());
          System.out.println("\nQueue Contents after Dequeue: ");
          queue.displayContents();
    }
        
    

 }
