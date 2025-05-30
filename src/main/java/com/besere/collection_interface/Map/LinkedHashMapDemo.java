
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.Map;

import java.util.LinkedHashMap;
import java.util.Map;

/*
    - Unlike HashMap, the iteration order of the elements in a LinkedHashMap is predictable.
    - Similar to HashMap, LinkedHashMap allows one null key and multiple null values. 
    - LinkedHashMap is not synchronized, which means it's not thread-safe. 
    - The performance of LinkedHashMap can be slightly lower than HashMap due to the overhead of maintaining the linked list.
    - LinkedHashMap is useful in situations where you need a Map that also maintains its elements in order.

    LinkedHashMap<String, Integer> dayNumberMapping = new LinkedHashMap<>();

*/
public class LinkedHashMapDemo {

    public static void main(String args[]) {
       
        Map<String,Integer> dayNumbering = new LinkedHashMap<>();

        dayNumbering.put("Monday",1);
        dayNumbering.put("Tuesday",2);
        dayNumbering.put("Wednesday",3);
        dayNumbering.put("Thursday",4);
        dayNumbering.put("Friday",5);
        dayNumbering.put("Saturday",6);
        dayNumbering.put("Sunday",7);

        System.out.println(dayNumbering);
        
        //Accessing elements
        System.out.println("get() : " + dayNumbering.get("Monday"));
        //Remove elements
        System.out.println("remove() : " + dayNumbering.remove("Sunday"));
        System.out.println("containsKey() : " + dayNumbering.containsKey("Friday"));
        System.out.println("containsValue() : " + dayNumbering.containsValue(2));
        
        //Using foreach
        System.out.println("\nUsing a forEach Value : ");
        dayNumbering.forEach((key,value) -> System.out.println("Key : " + key + ", Value : " + value));
        
    }
}
