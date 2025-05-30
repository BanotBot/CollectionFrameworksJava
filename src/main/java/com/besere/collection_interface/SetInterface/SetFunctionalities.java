
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.besere.collection_interface.SetInterface;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author admin
 * 
 * Operations 1: Adding Elements
 * - In order to add an element to the Set, we can use the add() method. However, the insertion order is not retained in the Set. Internally, for every element, a hash is generated and the values are stored with respect to the generated hash.
 * 
 * Operation 2: Accessing the Elements
 *  - After adding the elements, if we wish to access the elements, we can use inbuilt methods like contains().
 * 
 * Operation 3: Removing the Values
 * - The values can be removed from the Set using the remove() method.
 * 
 * Operation 4: Iterating through the Set
 * - There are various ways to iterate through the Set. The most famous one is to use the enhanced for loop.
 */

public class SetFunctionalities {
    
    static public void main(String...x){
        
        // Adding elements on a Set
        Set<String> setData = new HashSet<>();
        setData.add("B");
        setData.add("C");
        setData.add("A");
        setData.add("B");
        setData.add(null);
        
        System.out.println("Set is = " + setData);
        System.out.println("Check the set if has value = " + setData.contains("B"));
        System.out.println("remove() methods = " + setData.remove("B"));
        System.out.println("After removing = " + setData);
        System.out.println("Iterating through the Set using the enhanced for loop");
        for (String string : setData) {
            System.out.println(string);
        }
        System.out.println();
        
        
    }
}
