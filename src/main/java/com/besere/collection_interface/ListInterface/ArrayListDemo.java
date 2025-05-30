
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.ListInterface;

import java.util.ArrayList;

/*

Key Points of Java ArrayList Class
1. Resizability
    Unlike traditional arrays in Java, ArrayLists are dynamic and can grow or shrink as needed. This makes ArrayList a popular choice when working with an unknown number of objects.
2. Implements List Interface
    ArrayList is part of the Java Collections Framework and implements the List interface, providing all the functionalities of a typical list data structure.
3. Supports Duplicate Elements;
    Unlike Set, ArrayList allows duplicate elements, meaning you can have any number of the same element in an ArrayList.
4. Maintains Insertion Order
    ArrayList maintains the order of object insertion. The element added first will be the first element of the ArrayList and so on.
5. Random Access
    ArrayList supports random access via index, just like an array. This makes getting elements from an ArrayList faster compared to other List implementations like LinkedList.
6. Manipulation Overhead
    ArrayLists are slower when it comes to manipulation, such as the addition or removal of elements because it requires shifting of elements.
7. Not Synchronized
    ArrayList is not synchronized, i.e., it is not thread-safe. If you need a thread-safe implementation, consider using Vector or Collections.synchronizedList().
8. Null Elements
    ArrayList supports null elements. You can add null to an ArrayList.
9. Methods
ArrayList provides numerous methods for different operations like adding elements, removing elements, getting the size, checking if the list is empty, etc.
10. Iteration
    ArrayList elements can be traversed using Iterator, ListIterator, loops, and enhanced for-loops.
11. Initial Capacity
    While ArrayList can grow dynamically, it's beneficial to create it with an initial capacity if you have an estimate of the number of elements that will be added. This can help reduce the number of resizing operations.
12. Fail-Fast
    The iterators returned by ArrayList's iterator and list iterator methods are fail-fast: if the ArrayList is structurally modified at any time after the iterator is created, except through the iterator's own remove or add methods, the iterator will throw a ConcurrentModificationException.

*/
public class ArrayListDemo {

    public static void main(String args[]) {
      ArrayList<String> alist = new ArrayList<>();
      alist.add("X");
      alist.add("J");
      alist.add("Y");
      
        System.out.println("alist => " + alist);
        
      // insert an element at index 1
      alist.add(1,"L");
        System.out.println("after adding => " + alist);
        System.out.println("get() : " + alist.get(0));
        System.out.println("get() : " + alist.get(1));
        
      // Change or update the value
      alist.set(0,"Apricorn");
      alist.set(1,"Challenge");

        System.out.println("Updated ArrayList : " + alist);
        
        //removing using the index positioning
      alist.remove(3);
        System.out.println("after removing => " + alist);
        
     ArrayList<String> alist2 = new ArrayList<>();
      alist2.add("X");
      alist2.add("J");

      alist.removeAll(alist2);
        System.out.println("after removing =>  " + alist);
        
        
    }
}
