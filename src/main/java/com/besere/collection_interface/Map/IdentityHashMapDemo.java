
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.Map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    
    public static void main(String args[]) {
        
       Map<String,String> map = new IdentityHashMap<>();  
       
       //This part will create a new memory object
       String key1 = new String("hello");
       String key2 = new String("hello");
       
       map.put(key1,"World");
       map.put(key2,"Java");
       
        System.out.println("size() : " + map.size()); // Output : 2 , this will treat as different.

        Map<String,String> hashmap = new java.util.HashMap<>();
        hashmap.put(key1,"world");
        hashmap.put(key2,"Java");

        System.out.println("size() : " + hashmap.size()); // Output 1 , This will treat as one. Because of the key.
         
            
    }
}
