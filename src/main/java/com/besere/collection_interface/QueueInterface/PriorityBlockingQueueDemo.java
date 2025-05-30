
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.besere.collection_interface.QueueInterface;

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {

    public static void main(String args[]) {
      Queue<Integer> blocking = new PriorityBlockingQueue<>();
      
       // Adding items to the blocking
        // using add()
        blocking.add(20);
        blocking.add(10);
        blocking.add(15);

        // Printing the top element of
        // the PriorityBlockingQueue
        System.out.println(blocking.peek());

        // Printing the top element and
        // removing it from the
        // PriorityBlockingQueue
        System.out.println(blocking.poll());
        
        // Printing the top element again
        System.out.println(blocking.peek());
        
    }
}
