/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.besere.collection_interface.SetInterface;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author admin
 */


/*
    AbstractSet class - is part of the Java Collections Framework. It provides a Skeleton implementation of the set interface, which is a collection that does not allow duplicate elements.

    AbstractSet implements the set interface but does not provide a full implementation of all set methods.
    It provides implementations for methods like size(), isEmpty() and contains()
    It requires subclasses to implement the iterator() method to define how elements are iterated over

 protected AbstractSet()
    - This Constructor is used to prevent direct instantiation of the AbstractSet class, allowing only its subclasses to be instantiated.

*/

abstract class AbstractSet{
    public abstract void insert(int element);
    public abstract void display();
     
}

public class AbstractSetClass extends AbstractSet{
    
    private final Set<Integer> elements;
    
    protected AbstractSetClass() {
        this.elements = new HashSet<>();
    }
    
    @Override
    public void insert(int element) {
        elements.add(element);
    }

    @Override
    public void display() {
        for (Integer element : elements) {
            System.out.print(element + " ");
        }
    }
    
    public static void main(String args[]) {
      AbstractSetClass obj = new AbstractSetClass();
      
      obj.insert(16);
      obj.insert(90);
      obj.insert(120);
      obj.insert(30);
      
        System.out.println("Elements in the Set => ");
        obj.display();
    }

    
}
