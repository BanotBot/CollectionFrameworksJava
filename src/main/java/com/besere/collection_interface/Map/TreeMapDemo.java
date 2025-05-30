

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.Map;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

/*
    - TreeMap class in Java is a Red-Black tree-based implementation of the Map interface, which provides a guaranteed log(n) time complexity for the put, get, and remove operations. It stores its elements in a tree and they are automatically arranged in a natural ascending order. 
    - HashMap and LinkedHashMap, a TreeMap in Java does not allow null keys but it can have null values. If you try to insert a null key, it will throw a NullPointerException. 
    - TreeMap is not synchronized, which means it is not suitable for thread-safe operations unless synchronized explicitly. 
    - We can construct an empty TreeMap that will be sorted by using the natural order of its keys or by a custom Comparator at the time of creation.
    - TreeMap offers a performance of O(log(n)) for most operations like add, remove, and contains tasks. 
    -  iterator provided by TreeMap is fail-fast, which means if the map is structurally modified at any time after the iterator is created, the iterator will throw a ConcurrentModificationException. 
    - TreeMap is the only class that implements the NavigableMap interface, which means it supports a number of navigation methods. For example, it can be used to return the greatest key less than or equal to the given key, or the first or last key in the map.
    - Java 8 introduced new methods in TreeMap like newKeySet(), descendingKeySet(), etc. These methods provide more functionality and make it easier to use TreeMap.
    - TreeMap is an excellent choice when you need to keep your entries sorted according to natural ordering or custom ordering.

     entrySet() - Returns a Set view of the mappings contained in this map.

*/

public class TreeMapDemo {
    
    public static void main(String args[]) {
        
        TreeMap<String,Integer> tmap = new TreeMap<>(); //Collections.reverseOrder()
        tmap.put("Shanks",1);
        tmap.put("Buggy",2);
        tmap.put("Rayleigh",3);
        tmap.put("Kizaru",4);
        
        System.out.println("lastEntry() : " + tmap.lastEntry());
        System.out.println("firstEntry() : " + tmap.firstEntry());
        System.out.println(tmap);
        
        for (Map.Entry<String, Integer> entry : tmap.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("Key : " + key + ", Value : " + val);
        }
        
        Stream<Map.Entry<String,Integer>> stream = tmap.entrySet().stream();
        stream.forEach((entry) -> System.out.print(entry.getKey() + "=>"+ entry.getValue() + " "));
        
    }
}
