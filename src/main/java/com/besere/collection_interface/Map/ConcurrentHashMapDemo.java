
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
    - ConcurrentHashMap is a thread-safe implementation of a hash table in Java. It belongs to the java.util.concurrent package and allows multiple threads to read and write without the need for explicit synchronization.
    Key Features:
        - Thread-Safety – Multiple threads can operate on the map concurrently without blocking each other.
        - Better Performance than Synchronized HashMap – It uses a segmented locking mechanism (internally using a form of bucket-level locking) to allow multiple threads to modify different parts of the map simultaneously.
        - No Null Keys or Values – Unlike HashMap, it does not allow null keys or values.
        - Atomic Operations – Provides atomic methods like putIfAbsent(), compute(), replace(), and remove() to handle concurrent updates safely.
*/

public class ConcurrentHashMapDemo {

    public static void main(String args[]) {
        
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        
        map.put("Ivan Dave",1);
        map.put("Jala",2);
        map.put("Killer",3);
        
        //Using atomic operations
        map.putIfAbsent("Killua",4);
        map.computeIfPresent("Jala",(key,val) -> val + 3);
        
        System.out.println("map => " + map);
        
        // converting Hashmap into concurrent
        Map<String,Integer> hs = new HashMap<>();
        
        hs.put("Shanks",1);
        hs.put("Buggy",2);
        hs.put("Mihawk",3);
        hs.put("Joyboy",4);

        System.out.println("hs => " + hs );
        
        ConcurrentHashMap<String,Integer> cr = new ConcurrentHashMap<>(hs);
        cr.forEach((x,y)->System.out.print(x + " => " + y + " , "));
        
        
    }
}
