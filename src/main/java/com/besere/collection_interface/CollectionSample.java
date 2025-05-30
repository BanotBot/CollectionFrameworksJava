
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;


/**
 * Collection is a interface present in java.util package. 
 * It is used to represent a group of individual objects as a single unit.
 * It is similar to the container in the C++ language. 
 * The collection is considered as the root interface of the collection framework.
 * It provides several classes and interfaces to represent a group of individual objects as a single unit. 
 * 
 * 
 * List, Set, and Queue are the main sub-interfaces of the collection interface. 
 * The map interface is also part of the java collection framework, but it doesn’t inherit the collection of the interface.
 * The add(), remove(), clear(), size(), and contains() are the important methods of the Collection interface.
 * 
 * 
 * add() - Adds a specific element to the collection. Returns true if the collection is modified, false otherwise.
 * addAll() - Adds all elements from a specified collection to the current collection. Returns true if the collection is modified, false otherwise.
 * remove() - removes the single instance of the specified element from the collection,if present. Returns true if the collection is modified false otherwise.
 * iterator() - Returns an iterator over the elements in this collection. There are no guarantees concerning the order in which the elements are returned (unless this collection is an instance of some class that provides a guarantee).
 * hasNext() - Returns true if the iteration has more elements. (In other words, returns true if next would return an element rather than throwing an exception.
 * next() - Returns the next element in the iteration.
 * 
 * 
 *  parallelStream() - Returns a possibly parallel Stream with the collection as its source.
 * 
 *  removeAll(Collection<?> c) - Removes all elements in the collection that are also contained in the specified collection. Returns true if the collection is modified, false otherwise.
 *  retainAll() - removes the value that are not common in both collection.
 *  size() - returns the length or the number of the array.
 * 
 * 
 * spliterator() -  Returns a Spliterator over the elements in the collection.
 * 
 * 
 */

public class CollectionSample {

    public static void main(String args[]) {
        
       Collection<String> collection = new ArrayList<>();
        collection.add("Honda");
        collection.add("Rusi");
        collection.add("Suzuki");
        System.out.println(collection);
        
        collection.remove("Rusi");
        System.out.print("After the remove() method. : ");
        System.out.println(collection);
        
        System.out.println(".contains() : " + collection.contains("Suzuki"));
        
        System.out.println("Using the foreach looping");
        collection.forEach((datalist)->{
            System.out.print(datalist + " ");
        });
        
        System.out.println();

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Hello!");
        collection2.add("World!");
        boolean isAddAll = collection.addAll(collection2);
        System.out.println(isAddAll);
        System.out.println("Latest Update of the collection : " + collection);
        
        collection.clear();
        
        System.out.println("collection length : " + collection.size());
        System.out.println("containsAll() : " + collection.containsAll(collection2));
        System.out.println("isEmpty() : " + collection.isEmpty());
        System.out.println("removeAll() : " + collection.removeAll(collection2));
        System.out.println("\nUsing an Iterator");
        
        collection.add("Hello");
        collection.add("Keyboard");
        
        Iterator<String> iterator = collection.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
            
      collection.parallelStream().forEach(System.out::println); // this will only read the first elements
      
       Collection<String> d1 = new ArrayList<>();
        d1.add("Hello");
        d1.add("Jake");
       Collection<String> d2 = new ArrayList<>();
        d2.add("Jake");
        
        d1.retainAll(d2);
        System.out.println(d1);
        
        System.out.println("Using an Spliterator ");
        Spliterator<String> split = collection.spliterator();
        split.forEachRemaining(System.out::println);
        
        System.out.println("Using an Stream stream()");
        Stream<String> stream = collection.stream();
        stream.forEach(System.out::println);
    } 
}

//LIST INTERFACE