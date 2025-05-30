
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.QueueInterface;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/*
1. PriorityQueue:

PriorityQueue class - which is implemented in the collection framework provides us a way to process the objects based on the priority. 
    It is known that a queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority, 
    that’s when the PriorityQueue comes into play. 

*/

public class PriorityQueueDemo {

    public static void main(String args[]) {
        
       Queue<Integer> priority = new PriorityQueue<>();
       
       priority.add(12);
       priority.add(45);
       priority.add(5);
       
        System.out.println("priority queue => " + priority);
        
        //Printing the top element of the PriorityQueue
         System.out.println(priority.peek());
         
        //Removing the top element of the priorityqueue
        System.out.println(priority.poll());
        
        //printing again the top of the priorityqueue
        System.out.println(priority.peek());
        
        Queue<Integer> priority2 = new PriorityQueue<>();
        priority2.add(30);
        priority2.add(20);
        priority2.add(10);
        
        System.out.println("priority2 => " + priority2);
        
        
        System.out.println();
        Queue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(90.4);
        pq.offer(88.4);
        pq.offer(93.4);
        pq.offer(93.4);

        System.out.println("pq => " + pq);
        

    }
}
