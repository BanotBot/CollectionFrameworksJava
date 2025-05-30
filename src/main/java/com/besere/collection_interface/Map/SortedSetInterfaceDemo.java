
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.Map;

import java.util.SortedMap;
import java.util.TreeMap;

/*
      - SortedMap interface in Java is a subtype of the Map interface that maintains its keys in sorted order. It is part of the java.util package and extends the Map<K, V> interface. The sorting order is determined either by the natural ordering of the keys (if they implement Comparable) or by a custom Comparator provided at the time of creation.
      
        Key Features of SortedMap:
            - Sorted Keys – The keys are always sorted in ascending order.
            - Navigation Methods – Provides methods to retrieve specific key-value mappings based on order.
            - Range Views – Supports retrieval of portions of the map based on key ranges.
            

        Important Methods:
            - K firstKey() – Returns the first (lowest) key in the map.
            - K lastKey() – Returns the last (highest) key in the map.
            - SortedMap<K,V> headMap(K toKey) – Returns a view of the portion of the map with keys strictly less than toKey.
            - SortedMap<K,V> tailMap(K fromKey) – Returns a view of the portion of the map with keys greater than or equal to fromKey.
            - SortedMap<K,V> subMap(K fromKey, K toKey) – Returns a view of the portion of the map with keys from fromKey (inclusive) to toKey (exclusive).
            - Comparator<? super K> comparator() – Returns the comparator used for ordering or null if natural ordering is used.


            SortedMap maintains keys in sorted order.
            TreeMap is the most common implementation.
            Provides useful methods for range-based queries.
            Sorting is based on natural order or a custom Comparator.

*/

public class SortedSetInterfaceDemo {
    
    public static void main(String args[]) {
        
        SortedMap<Integer,String> sorted = new TreeMap<>();
        
        sorted.put(1,"One");
        sorted.put(2,"Two");
        sorted.put(4,"Four");
        sorted.put(5,"Five");
        sorted.put(9,"Nine");
        sorted.put(12,"Twelve");
        sorted.put(3,"Three");
        sorted.put(13,"Thirteen");
        
        System.out.println("Sorted => " + sorted);
        System.out.println("firstkey() : " + sorted.firstKey());
        System.out.println("lastkey() : " + sorted.lastKey());
        System.out.println("headMap() (key < 3) : " + sorted.headMap(3)); // less than
        System.out.println("tailMap() (key >= 3) : " + sorted.tailMap(3)); // greater than
        System.out.println("subMap() (key 2 to 4) : " + sorted.subMap(2,4));
        
        
    }
}
