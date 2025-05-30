
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.SetInterface;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/*
    CopyOnWriteArraySetSample - is a thread-safe implementation of the Set interface in Java.
                It is part of the java.util.concurrent package and is backed by a CopyOnWriteArrayList.

Key Features:
    Thread-Safe – It allows concurrent access without external synchronization.
    Copy-On-Write Mechanism – Every modification (add, remove, etc.) creates a new copy of the underlying array.
Performance Trade-off:
    Fast Read Operations – Since no locking is required for reads, multiple threads can read without blocking.
    Slow Write Operations – Since a new copy is created on each modification, frequent updates can be expensive.
    No null Elements – CopyOnWriteArraySetSample does not allow null values.
    Iterators are Weakly Consistent – Iterators reflect the state of the set at the time they were created and do not throw ConcurrentModificationException.

*/

public class CopyOnWriteArraySetSample {
    
    public static void main(String args[]) {
        
        Set<Integer> set = new CopyOnWriteArraySet<>();
        
        //Adding elements
        set.add(12);
        set.add(90);
        set.add(100);
        
        System.out.println("set => " + set);
        
        System.out.println("Using Loop :");
        for (Integer integer : set) {
            System.out.println(integer);
        }
        
        set.remove(12);
        System.out.println("set => " + set);
        
        
    }
}
