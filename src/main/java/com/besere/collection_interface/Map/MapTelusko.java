
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.besere.collection_interface.Map;

import java.util.HashMap;
import java.util.Map;

public class MapTelusko {

    public static void main(String args[]) {
        
      Map<String,Integer> map = new HashMap<>();
      Map<String,Integer> map2 = new HashMap<>();
      map.put("navin",23);
      map.put("Jake",21);
      map.put("Kiran",26);
      map.put("Shanks",237);
      map.put("Luffy",238);
      map.put("Mefj",236);
      
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 25) {
                //map2.put(entry.getKey(),entry.getValue());
                System.out.print(entry.getKey()+ "=" + entry.getValue() + ",");
            }
        }
        
        System.out.println();
        //System.out.println("List of User that has less than 25 value => " + map2);
        
        System.out.println("map => " + map);
        System.out.println("get() : " + map.get("Kiran"));
        System.out.println();
        
        System.out.println("List of Students that contains a 'J' in the key");
        for (String key : map.keySet()) {
            if (key.contains("J")) {
                System.out.println(key);
            }
        }
        
        
        
    }
}
