
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
    - A Map cannot contain duplicate keys: Each key can map to at most one value. It models the mathematical function abstraction.
    - Each key at most must be associated with one value.
    - Each key-value pairs of the map are stored as Map.Entry objects. Map.Entry is an inner interface of Map interface.
    - The Java platform contains three general-purpose Map interface implementations: HashMap, TreeMap, and LinkedHashMap.


    - Order of elements in a map is implementation dependent. 
    - HashMap doesn’t maintain any order of elements. 
    - LinkedHashMap maintains insertion order of elements. Where as TreeMap places the elements according to the supplied Comparator.
    - The Map interface provides three methods, which allows map’s contents to be viewed as a set of keys (keySet() method), a collection of values (values() method), or set of key-value mappings (entrySet() method).


      Method                                          Description
    V put(K key, V value)               Associates the specified value with the specified key. If the key already exists, the value is updated.
    V get(Object key)                   Returns the value associated with the specified key, or null if the key is not found.
    V remove(Object key)                Removes the mapping for the specified key and returns the associated value.
    boolean containsKey(Object key)	Returns true if the map contains the specified key.
    boolean containsValue(Object value)	Returns true if the map contains one or more keys mapping to the specified value.
    int size()                          Returns the number of key-value pairs in the map.
    boolean isEmpty()                   Returns true if the map is empty.
    void clear()                        Removes all key-value mappings from the map.
    void putAll(Map<? extends K, ? extends V> m)	Copies all mappings from the specified map into this map.
    Set<K> keySet()                     Returns a Set view of all the keys in the map.
    Collection<V> values()              Returns a Collection view of all the values in the map.
    Set<Map.Entry<K, V>> entrySet()	Returns a Set of key-value pairs (Map.Entry<K, V>).
    default V getOrDefault(Object key, V defaultValue)          Returns the value associated with the key, or defaultValue if the key is not found.
    default V putIfAbsent(K key, V value)                       If the key is not already mapped, associates it with the given value.
    default boolean remove(Object key, Object value)            Removes the entry if the key maps to the specified value.
    default V replace(K key, V value)                           Replaces the value for a given key if it is currently mapped.
    default boolean replace(K key, V oldValue, V newValue)	Replaces the old value with a new value only if the current value matches oldValue.
    default void replaceAll(BiFunction<? super K, ? super V, ? extends V> function)	Replaces each entry's value with the result of applying the given function.
    default void forEach(BiConsumer<? super K, ? super V> action)                       Performs the given action for each entry in the map.
    K getKey()                                                  Returns the key of the entry.
    V getValue()                                                Returns the value of the entry.
    V setValue(V value)                                         Updates the value for this entry.
    boolean equals(Object o)                                    Checks if two entries are equal (key-value pairs must match).
    int hashCode()                                              Returns the hash code of the entry.


    entrySet() method in the Map interface returns a Set<Map.Entry<K, V>>, which represents a collection of all key-value pairs (entries) in the map. This is useful when you need both the key and value while iterating through the map.

*/

public class MapDemo {

    public static void main(String args[]) {
        Map<String,Integer> map = new HashMap<>();
        
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        
        
        Map<String,Integer> map2 = new HashMap<>();
        
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        
        System.out.println("map => " + map);
        
        map.putIfAbsent("Five",5);
        
        System.out.println("map => " + map);
        
        map.forEach((x,y)->System.out.println(x + y));
        System.out.println("get() : " + map.get("Five"));
        System.out.println("remove() : " + map.remove("String"));
        System.out.println("contains() : " + map.containsKey("Four"));
        System.out.println("containsKeyValue() : " + map.containsValue(4));
        System.out.println("size() : " + map.size());
        System.out.println("isEmpty() : " + map.isEmpty());
        System.out.println("keySet() : " + map.keySet());
        System.out.println("getOrDefault() : " + map.getOrDefault("One",2));
        System.out.println("putIfAbsent() : " + map.putIfAbsent("Six",6));
        System.out.println("remove() : " + map.remove("Six",6));
        Collection<Integer> values = map.values();
        System.out.println("Collection values : " + values);
        
        map.putAll(map2);
        System.out.println("putAll() : " + map);
        map.clear();
        System.out.println("clear() : " + map);
        
        
        {
            
            //Using an  Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
            Map<Integer,String> map3 = new HashMap<>();
            // Adding elements to the map
                map3.put(1, "Java");
                map3.put(2, "Python");
                map3.put(3, "C++");
                map3.put(4, "JavaScript");
                
              
                System.out.println("Iterating using the for-each loop : ");
                for (Map.Entry<Integer, String> entry : map3.entrySet()) {
                    System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
                }
                
                // Iterating using Streams (Java 8+)
                System.out.println("\nIterating using streams:");
                map3.entrySet().stream().forEach(entry -> 
                        System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue()
                ));
                
                 // Modifying a value using entrySet
                 for (Map.Entry<Integer, String> entry : map3.entrySet()) {
                     if (entry.getKey() == 2) {
                        entry.setValue("Golang");
                     }
                }
                 
                 System.out.println("\nUpdated Map3 => " + map3);
        }
        
        
        
    }
}
