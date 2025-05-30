
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/*

    - As the name suggests, Deque is a queue in which we can insert and remove elements from both ends. It means you can perform operations at the front as well as at the rear. 
    - Deque supports the insertion of elements at both ends. The methods addFirst(E e), addLast(E e), offerFirst(E e), and offerLast(E e) are used for this purpose. Similarly, to remove elements, we use removeFirst(), removeLast(), pollFirst(), and pollLast(). 
    
    - Deque interface can also function as a stack (LIFO). The Deque implementations have methods for push, pop, and peek operations when used as a stack. 
    - Deques generally do not have any capacity constraints and they can grow as needed based on the usage, but ArrayDeque has an exception, as it is array-based. 
    - Deque interface provides an iterator that can iterate in both directions - regular order via iterator() and reverse order via descendingIterator().
*/
public class DqueDemo {

    public static void main(String args[]) {
      Deque<String> dq = new ArrayDeque<>();
      
      dq.offer("Element1");
      dq.offer("Element2");
      dq.add("Element3");
      dq.add("Element4");
      
      dq.pollLast();
        System.out.println("Elements after pollLast() : " + dq);
        
      Iterator iteration = dq.descendingIterator();
        while (iteration.hasNext()) {
            Object next = iteration.next();
            System.out.println(next);
        }
        
        
        
    }
}
