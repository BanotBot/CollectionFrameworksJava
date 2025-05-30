/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.besere.collection_interface.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

/*

 queue - is a linear data structure that follows the First In, First Out (FIFO) principle. 
    This means that elements are added at one end (the rear) and removed from the other end (the front), just like people standing in a line.
    
    
Key Operations of a Queue:
    enqueue(x) – Adds element x to the rear of the queue.
    dequeue() – Removes and returns the front element of the queue.
    front() or peek() – Returns the front element without removing it.
    isEmpty() – Checks if the queue is empty.
    size() – Returns the number of elements in the queue.
Types of Queues:
    Simple Queue – Basic FIFO queue.
    Circular Queue – The rear wraps around to the front when it reaches the end.
    Priority Queue – Elements are dequeued based on priority instead of order.
    Deque (Double-Ended Queue) – Elements can be added/removed from both ends.


Queue Interface Methods:

            Method                                Description
            add(E e)                Inserts an element at the end of the queue; throws an exception if full.
            offer(E e)              Inserts an element at the end of the queue; returns false if full (does not throw an exception).
            remove()                Removes and returns the front element; throws an exception if empty.
            poll()                  Removes and returns the front element; returns null if empty.
            element()               Retrieves (but does not remove) the front element; throws an exception if empty.
            peek()                  Retrieves (but does not remove) the front element; returns null if empty.


        LinkedList	Implements Queue using a doubly linked list.
        PriorityQueue	Implements a priority queue where elements are ordered based on priority instead of insertion order.
        ArrayDeque	A double-ended queue (Deque) that can be used as both a queue and a stack.



Explanation of Methods Used:
    Method                  Description
    add(E e)        Adds an element; throws exception if queue is full.
    offer(E e)      Adds an element; returns false if queue is full.
    peek()          Retrieves front element without removal; returns null if queue is empty.
    element()       Retrieves front element without removal; throws exception if queue is empty.
    remove()        Removes and returns front element; throws exception if queue is empty.
    poll()          Removes and returns front element; returns null if queue is empty.
    isEmpty()       Checks if the queue is empty.
    size()          Returns the number of elements in the queue.


    PriorityBlockingQueue - is one alternative implementation if the thread-safe implementation is needed.

    All Queues except the Deques supports insertion and removal at the tail and head of the queue respectively.
    The Deques support element insertion and removal at both ends. 


    Use PriorityQueue when you need a sorted queue (priority-based processing) in a single-threaded environment.
    ✅ Use LinkedList when you need a basic FIFO queue with fast insertions/removals.
    ✅ Use PriorityBlockingQueue when you need a priority queue in a multi-threaded environment.
*/

public class QueueDemo {
  
    public static void main(String args[]) {
        
        Queue<Integer> queue = new LinkedList<>();
        
        //adding element using add() and offer()
        queue.add(12);
        queue.add(2);
        queue.offer(23);
        queue.add(67);
        queue.offer(63);
        queue.add(23);
        
        System.out.println("queue value => " + queue);
        
        // Retrieving front element without removal using peek() and element()
        System.out.println("Front element using peek() : " + queue.peek());
        System.out.println("Front element using element() : " + queue.element());
        
         // Removing elements using remove() and poll()
         System.out.println("Removed element using remove() : " + queue.remove());
         System.out.println("Removed element using poll() : " + queue.poll());
         System.out.println("Queue after removals: " + queue);
         
         //Checking if the queue is empty?
         System.out.println("Is the queue is empty? : " + queue.isEmpty());
         
         //Checking the size of the queue
         System.out.println("Size of the queue : " + queue.size());
         
         // Emptying the queue
         queue.poll();
         
        // Demonstrating peek() and poll() when queue is empty
        System.out.println("Peek on empty queue: " + queue.peek()); // Returns null
        System.out.println("Poll on empty queue: " + queue.poll()); // Returns null
        
        //Queue exception when it does not have a value anymore
        try {
            System.out.println("Element on the empty queue : " + queue.element());
        } catch (Exception e) {
            System.out.println("Exception using the element() on the empty queue : " + e.getMessage());
        }
        
        try {
            System.out.println("Remove on empty queue: " + queue.remove());
        } catch (Exception e) {
            System.out.println("Exception using remove() on empty queue: " + e.getMessage());
        }
        
        
        
    }
}
