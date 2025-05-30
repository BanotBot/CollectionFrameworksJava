
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.SetInterface.HashSet;

/*
    Key Points About HashSets Class
        Unordered and Unsorted
            The elements in a HashSets are not ordered or sorted. There is no guarantee that the order will remain constant over time.
        Unique Elements
            HashSets does not allow duplicate values. If you try to add the same value again, it will not replace the old value.
    Null Elements

        HashSets allows one null value.
            Non-Synchronized
                HashSets is non-synchronized, meaning it is not thread-safe and multiple threads can access it simultaneously.
        Underlying Data Structure
                HashSets is implemented in terms of a hash table and internally uses HashMap to store the elements.
        Performance
                The add, remove, and contains methods have constant time complexity O(1).
        Implements Set Interface
                HashSets implements the Set interface, inheriting all its methods.
        Initial Capacity and Load Factor
                The default initial capacity of HashSets is 16, and the default load factor is 0.75.
        Create HashSets
                Here is the syntax to create a HashSets class object:
        //Creating a HashSets
        HashSets<String> set = new HashSets<>();

  - HashSet does not allow duplicate values and allows only one null value.
    Note! - HashSet is backed by a HashMap – It uses hashing to store elements, meaning their positions depend on the hash codes of the elements.


   Exception in HashSet:
        - ConcurrentModificationException - Modifying a HashSet while iterating using an iterator (except when using iterator.remove()).
        
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets {
    
    public static void main(String args[]) {
        
        HashSet<String> hs = new HashSet<>();
        
        //Adding elements to the HashSets
        hs.add("Java");
        hs.add("Python");
        hs.add("JavaScript");
        
        //duplicate values
        hs.add("Java");
        hs.add("Python");
        
        //adding null values will always be at the top.
        hs.add(null);
        hs.add(null);
        
        System.out.println("Data HashSet = " + hs);
        
        // using addAll() - from another collection of hashData
        HashSet<String> hs2 = new HashSet<>();
        hs2.add("Golang");
        hs2.add("C++");
        hs2.add("C#");
        
        //addAll
        hs.addAll(hs2);
        System.out.println("addAll() => " + hs);
        
        {
            // using the remove types
            /*
                remove(Object o): This method removes a single specified element from the set.
                removeAll(Collection c): This method removes all elements from the set that are contained in the specified collection.
                removeIf(Predicate<? super E> filter): This method removes all elements from the set that satisfy the given predicate.
            */
            
            HashSet<Integer> hashset = new HashSet<>();
            hashset.addAll(Arrays.asList(1,2,3,4,5,6,6));
            
            hashset.removeIf(x -> x < 3); // this will automatically iterate the hashset
            System.out.println("Done removing value less than 3");
            System.out.println("hashset newly data => " + hashset);
            
            hashset.removeIf(x -> x >= 4);// this will automatically iterate the hashset
            System.out.println("hashset newly data 2 => " + hashset);
            
        }
        
        {
            // foreachRemaining(iterator) - this will be use if there is an iterator.
            // foreach(collection) - will be use if there will be a collection instead of iterator.
            HashSet<String> str = new HashSet<>();
            str.add("Volvo");
            str.add("Juice");
            str.add("Exception");
            
            System.out.println("ForEach");
            str.forEach(x ->System.out.println(x)); // using lambda expression
            System.out.println();
            str.forEach(System.out::println); // using the method reference
            
            System.out.println("ForeachRemaining");
            Iterator et = str.iterator();
            et.forEachRemaining(System.out::println);
        }
        
        {
            /*
                Make HashSet Thread-Safe
                - In Java, HashSet is not thread-safe, which means if it is used in a multi-threaded environment, then multiple threads can access and modify it simultaneously leading to data inconsistency.
                - However, you can make a HashSet thread-safe by using the Collections.synchronizedSet() method.
            */
            Set<String> str = new HashSet<>();
            str.add("Apple");
            str.add("Orange");
            str.add("Mango");
            
            Set<String> sychronizeSet = Collections.synchronizedSet(str); // use must synchronized it based in the type variable. 
            System.out.println(sychronizeSet);
        }

        
    }
}
