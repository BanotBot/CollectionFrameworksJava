
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    
    public static void main(String args[]) {
        Queue<Integer> linked = new LinkedList<>();
        
        linked.add(10);
        linked.add(30);
        linked.add(20);
        
        System.out.println("linked => " + linked); // sorted
        
    }
}
