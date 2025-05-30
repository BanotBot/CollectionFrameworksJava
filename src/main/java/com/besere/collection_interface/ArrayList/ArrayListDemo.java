/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.besere.collection_interface.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

/*
    ArrayListDemo in Java is a dynamic array implementation that belongs to the Java Collections Framework.
    - This is a big array that grows on its own as more elements are added to it.

    * Maintains Insertion Order
    * Non-Synchronized:
    * Supports Random Access:
    * Slower Manipulation compared to LinkedList:
    * Requires Wrapper Classes for Primitive Types:
    * Dynamic Resizing
    * Capacity
    * Iterable
    * Dynamic Initialization

 ArrayList<String> list = new ArrayList<>(4);
    - This means the internal array starts with space for 4 elements.
    - If you add more than 10 elements, the array automatically resizes to accommodate more.

*/

//REMOVE RANGE
class RemoveRangeDemo<E> extends ArrayList<E>{
    
    public void removeRangePublic(int fromIndex , int toIndex){
        super.removeRange(fromIndex,toIndex);
    }
}


public class ArrayListDemo implements Cloneable {

    private final ArrayList<String> list;
    
    public ArrayListDemo(ArrayList<String> list) {
        this.list = list;
    }
    
    @Override
    public ArrayListDemo clone() throws CloneNotSupportedException{
        return (ArrayListDemo) super.clone();
    }

    public static void main(String args[]) throws CloneNotSupportedException {
        ArrayList<String> list = new ArrayList<>(4);
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Kotlin");
        list.add("C#");
       
        System.out.println(list);
        System.out.println("getFirst() : " + list.getFirst());
        System.out.println("getLast() : " + list.getLast());
        System.out.println("get() : " + list.get(1));
        System.out.println("isEmpty() : " + list.isEmpty());
        
        ListIterator<String> iterator = list.listIterator(0);
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("\t"+ next);
        }
        
        int foundIndex = list.lastIndexOf("Java");
        int notfoundIndex = list.lastIndexOf("JS");
        System.out.println("lastIndexOf() found : " + foundIndex);
        System.out.println("lastIndexOf() not found : " + notfoundIndex);
        System.out.println("contains() : " + list.contains("C#"));
        //System.out.println("removeif() : " + list.removeIf((x)-> x.endsWith("n")));
        
        RemoveRangeDemo removeobj = new RemoveRangeDemo();
        removeobj.removeRangePublic(2,3);
        
        //Implementing shallow copy
        ArrayListDemo obj = new ArrayListDemo(list);
        System.out.println("original -> " + obj.list);
        
        ArrayListDemo clone = (ArrayListDemo) obj.clone();
        System.out.println("clone -> " + clone.list);
        
        
    }
}
