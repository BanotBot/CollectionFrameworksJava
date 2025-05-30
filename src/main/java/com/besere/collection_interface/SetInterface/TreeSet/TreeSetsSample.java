
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.besere.collection_interface.SetInterface.TreeSet;

/*
    Important Key Points About Java TreeSetsSample Class
        Ordering: 
            TreeSetsSample stores elements in a sorted manner, either in natural order (for objects that implement Comparable) or by a Comparator provided at set creation. 
        Uniqueness: 
            TreeSetsSample cannot contain duplicate elements.
        Null Elements: 
            TreeSetsSample cannot contain a null value.
        Performance: 
            TreeSetsSample operations like add, remove, and contains methods take O(log(n)) time. 
        Not Synchronized: 
            TreeSetsSample is not synchronized, which means it is not suitable for threaded environments unless externally synchronized. 
        Traversal: 
            The iterator provided by TreeSetsSample is fail-fast, which means any concurrent modification of the set while iterating over it will result in a ConcurrentModificationException. 
        Implements NavigableSet: 
            TreeSetsSample implements the NavigableSet interface, providing methods for navigation (lower, floor, ceiling, higher), and for retrieval and removal of the first and last element. 
        Storage:
            TreeSetsSample internally uses a TreeMap to store elements.

        Create TreeSetsSample 
        Here is the syntax to create an object of TreeSetsSample class:

        // Creating a TreeSetsSample
        TreeSetsSample<String> fruits = new TreeSetsSample<>();

        - String.CASE_INSENSITIVE_ORDER - means that the "banana and Banana are not the same."
        - Collections.sort(List<T> list, Comparator<? super T> c) is a static method from java.util.Collections that sorts a list using the provided Comparator.


    
*/
import java.util.Set;
import java.util.TreeSet;

public class TreeSetsSample{

    public static void main(String args[]) {
        
        // TODO code application logic here
        TreeSet<String> tset = new TreeSet<>();
        tset.add("Shanks");
        tset.add("Luffy");
        
        System.out.println("tset original => " + tset);
        
        // adding or updating a value in an array.
        tset.add("Franky");
        tset.add("Zoro");
        tset.add("Luffy"); // this will be not accepted because it has a duty.
        System.out.println("tset value after updating => " + tset);
        
        {
            
         //TreeSet with a custom comparator (Case Insensitive Order) 
            Set<String> tset2 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
            tset2.add("Akainu");
            tset2.add("Kizaru");
            tset2.add("Rayleigh");
            System.out.println("tset2 => " + tset2);
            tset2.add("Sanji");
            
            System.out.println("Updated modify tset2 => " + tset2);
        }
        
    }
}
