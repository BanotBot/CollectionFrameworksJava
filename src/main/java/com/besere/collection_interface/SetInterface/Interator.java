
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.SetInterface;

/*
Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping.
        - To use an Iterator, you must import it from the java.util package.
        - iterator() method can be used to get an Iterator for any collection:

    Looping Through a Collection
        - To loop through a collection, use the hasNext() and next() methods of the Iterator:

Removing Items from a Collection:
    - Iterators are designed to easily change the collections that they loop through. 
    - The remove() method can remove items from a collection while looping.

*/

import java.util.HashSet;
import java.util.Iterator;

public class Interator {
    
    public static void main(String args[]) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Java");
        hs.add("Python");
        hs.add("C++");
        
        Iterator iterate = hs.iterator();
        //System.out.println(iterate.next()); // This will only print the first item
        
        //Looping using through the HashSet
        while (iterate.hasNext()) {
            Object next = iterate.next();
            System.out.println(next);
        }
        
        System.out.println();
        
        Iterator<String> iterator2 = hs.iterator();
        while (iterator2.hasNext()) {
             String it = iterator2.next();
             if (it.equals("Java")) {
               iterator2.remove();
                 System.out.println("Done Removing");
            }
        }
        
        System.out.println("Final Data iterator2 => " + hs);
        System.out.println("***********************************************");
                
    }
}
