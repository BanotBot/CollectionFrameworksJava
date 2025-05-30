
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Ordered Collection: 
    The List interface extends the Collection interface and represents an ordered collection (also known as a sequence). The elements in a List can be inserted or accessed at any position based on the index
    The List allows duplicates. It means you can insert duplicate elements in the List. 
Null Elements:
    The List allows any number of null elements. You can have a List with all elements as null. 
Methods: 
    In addition to the methods inherited from the Collection interface, the List interface includes methods for position (index-based) access, search operations, and list iteration. 
Subinterfaces and Implementations: 
    The commonly used classes that implement the List interface are ArrayList, LinkedList, Vector, and Stack.
ListIterator: 
    The List interface provides a special iterator, called ListIterator, that allows element insertion and replacement, and bidirectional access in addition to the normal operations that the Iterator interface provides. 
Mutability: 
    The List interface supports elements insertion and removal, and it is typically more flexible than arrays.
Use-cases: 
    The List is a good choice if you need to maintain the insertion order, allow duplicates and nulls, and frequently access elements with the index. 

*/
public class ListDemo {

    public static void main(String args[]) {
        List<String> demo = new ArrayList<>();
        demo.add("e1");
        demo.add("e2");
        demo.add("e3");
        demo.add("e4");
        
        System.out.println("list => " + demo);
        
        demo.add(null);
        demo.add(null);
        
        System.out.println("list => " + demo);

        //Insertion order
        demo.add("e1");
        demo.add("e2");
        demo.add("e3");
        demo.add("e4");
        
        System.out.println("list => " + demo);
        
        //access from list
        System.out.println(demo.get(0));
        System.out.println(demo.get(2));

        //Implementing a LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.addFirst("Apple");
        fruits.addFirst("Apple1");
        
        System.out.println("fruits => " + fruits);

        fruits.add(0,"Strawberry");
        System.out.println("fruits => " + fruits);
        
        
        List<String> moreFruits = new ArrayList<>();
        moreFruits.add("Grapes");
        moreFruits.add("Pyrus");
        
        fruits.addAll(moreFruits);
        System.out.println("fruits => " + fruits);
        
    }
}
