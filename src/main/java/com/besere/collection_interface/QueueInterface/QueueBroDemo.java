/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.besere.collection_interface.QueueInterface;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class QueueBroDemo {

    public static void main(String args[]) {
       Queue<String> queue = new LinkedList<>();
       queue.offer("Karen");
       queue.offer("Chad");
       queue.offer("Steve");
       queue.offer("Harold");

        System.out.println("queue=> " + queue);
        
        queue.peek();
        System.out.println("peek() : " + queue);
        
        
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println("poll() =>" + queue);
        
        
    }
}
