/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.besere.collection_interface.ListInterface;

import java.util.Vector;

/*

    Vector<E> v = new Vector<E>(Collection c);


    Thread-Safe: All methods are synchronized, making it suitable for multi-threaded environments. However, this can lead to performance overhead in single-threaded scenarios.
    Allows Nulls: Can store null elements.
    Enumeration Support: Provides backward compatibility with Enumeration, a legacy way of iterating over elements.

*/

public class VictorDemo {

    public static void main(String args[]) {
        
        Vector<Integer> vic = new Vector<>(3,2);
        vic.addElement(12); 
        vic.addElement(34);
        
        
        //Inserting element in the specified index
        vic.insertElementAt(0,1);
        
        // removing element in the specified index
        // vic.removeElementAt(0);
        
        System.out.println("vic => " + vic);
        
    }
}
