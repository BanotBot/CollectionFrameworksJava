
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.Map;

import java.util.HashMap;
import java.util.Map;

/*
    - HashMap stores data in key-value pairs. The key is used as an index to store data. The value is the actual object that the key is mapped to.
    - HashMap allows one null key and multiple null values in a collection.
    - HashMap is not synchronized, which means it is not thread-safe. If it is used in a multi-threaded environment, then it must be synchronized externally.
    - The order in which keys or values are inserted into a HashMap is not necessarily the order in which they are iterated.
    - HashMap does not guarantee any specific order of entries.
    - The keys of HashMap are objects. Hence, these objects must implement the equals method and the hashCode method in order to follow the contract of the Map interface.
    - HashMap offers constant time performance for the basic operations get and put, assuming the hash function disperses the elements properly among the buckets.
    - capacity is the number of buckets in the hash table, and the initial capacity is simply the capacity at the time the hash table is created. Load factor is a measure of how full the hash table is allowed to get before its capacity is automatically increased.
    - HashMap implements the Map interface and extends the AbstractMap class in Java.
    - iterator of HashMap is fail-fast, meaning any structural modification (insertion or removal) after the creation of the iterator, will throw ConcurrentModificationException.
    - Creating a HashMap in Java is straightforward.

    - keySet() method is used to retrieve all the keys from a Map.

        HashMap<String, Integer> map = new HashMap<>();
*/


public class HashMapDemo {

    public static void main(String args[]) {
        
       Map<String,Integer> hs = new HashMap<>();
       hs.put("Shanks",1);
       hs.put("Buggy",2);
       hs.put("Luffy",3);
       hs.put("BlackBeard",4);
       hs.put(null,null);
       hs.put("Rayleigh",null);
       hs.put("Usopp",null);

        System.out.println("hs => " + hs);
        
        System.out.println("\nPrinting using the key!");
        for (String string : hs.keySet()) {
            System.out.println("Key : " + string);
        }
        
        
        
    }
}
