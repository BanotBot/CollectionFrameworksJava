
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.Map;

import java.util.WeakHashMap;

/*
    gc() - Runs the garbage collector in the Java Virtual Machine.
           Calling the gc method suggests that the Java Virtual Machine expend effort toward recycling unused objects in order to make the memory they currently occupy available for reuse by the Java Virtual Machine.

        Use WeakHashMap when you want automatic memory cleanup for keys.
        Use HashMap when you need to store permanent key-value mappings.
*/

public class WeakHashMapDemo {

    public static void main(String args[]) {
        
      WeakHashMap<Integer,String> weakMap = new WeakHashMap<>();
      
       Object key1 = new Object(); // Strong reference
       Object key2 = new Object(); // Strong reference

      weakMap.put(1,"Val1");
      weakMap.put(2,"Val2");
      weakMap.put(3,"Val3");
      weakMap.put(4,"Val4");
      
       System.out.println("Before GC : " + weakMap);
       
       //Implementation of the weak hash map
       key2 = null; // removing strong reference
       
       System.gc(); // forcing a garbage collection
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error : " + e.getMessage());
        }
        System.out.println("After the GC : " + weakMap);
        
        //Ambigous pani sya saakoang mind
        
    }
}
