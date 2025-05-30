
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.ListInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*

    A stack is an ordered list in which insertion and deletion are done at one end, called a top.

    - The Stack class represents a last-in-first-out (LIFO) stack of objects. 
    - It extends class Vector with five operations that allow a vector to be treated as a stack.
    

- Stack class is not part of the List interface. Instead, it is a subclass of Vector, which indirectly implements the List interface through AbstractList.
- It follows the Last-In-First-Out (LIFO) principle.


Key Methods of Stack
    Method                              Description
        push(E item)            Adds an element to the top of the stack.
        pop()                   Removes and returns the top element of the stack.
        peek()                  Returns the top element without removing it.
        isEmpty()               Checks if the stack is empty.
        search(Object o)	Returns the 1-based position of an element, or -1 if not found.

*/


public class StackDemo {
    
    private static void searchMethod(){
        
        Stack<String> stack = new Stack<>();
        
        stack.push("C++");
        stack.push("Java");
        stack.push("C#");
        stack.push("JavaScript");
        
        System.out.println("Searching 'Java' in the Stack : " + stack.search("Java"));
        
    }
    
    private static void pushMethod(){
        
        Stack < String > stack = new Stack < > ();
        stack.push("C++");
        stack.push("Java");
        stack.push("C#");
        stack.push("JavaScript");
        stack.push("Hibernate");
        
        System.out.println("Elements in the stack : " + stack);
    }
    
    private static void popMethod(){
        
        Stack < String > stack = new Stack < > ();
        stack.push("C++");
        stack.push("Java");
        stack.push("C#");
        stack.push("JavaScript");
        stack.push("Hibernate");
        
        //removing object in the stack
        stack.pop();
        
        System.out.println("Elements after remove : " + stack);
    }
    
    private static void peekMethod(){
        
        // creating stack
        Stack < String > stack = new Stack < > ();

        // populating stack
        stack.push("Java");
        stack.push("JEE");
        stack.push("C");
        stack.push("C++");
        stack.push("Spring");
        stack.push("Hibernate");

        // checking the top object
        System.out.println("Top object is: " + stack.peek());
    }
    
    private static void emptyMethod(){
          // creating stack
        Stack < String > stack = new Stack < > ();

        // populating stack
        stack.push("Java");
        stack.push("JEE");
        stack.push("C");
        stack.push("C++");
        stack.push("Spring");
        stack.push("Hibernate");

        // checking the top object
        System.out.println("Is stack is empty : " + stack.empty());
    }
     
    private static void convertArraytoStack(){
        String[]strArr = {
        
            "C++",
            "Java",
            "Kotlin",
            "Angular"
        };
        Stack<String> stack = new Stack<>();
        
        for (String string : strArr) {
            stack.push(string);
        }
        System.out.println("Array to Stack => " + stack);
    }
    
    
    private static void convertListtoStack(){
        List<String> list = new ArrayList<>();
        list.add("C++");
        list.add("C#");
        list.add("Kotlin");
        list.add("CSS");
        
        Stack<String> stack = new Stack<>();
        stack.addAll(list);
        System.out.println("List to Stack => " + stack);
    }
    
    private static void stacktoList(){
        Stack < String > stack = new Stack < > ();

        // populating stack
        stack.push("Java");
        stack.push("JEE");
        stack.push("C");
        stack.push("C++");
        stack.push("Spring");
        stack.push("Hibernate");
        
        List<String> list = new ArrayList<>();
        list.addAll(stack);
        System.out.println("Stack to List value => " + list);

    }
    
    
    public static void main(String args[]) {
        
        searchMethod();
        pushMethod();
        popMethod();
        peekMethod();
        emptyMethod();
        convertArraytoStack();
        convertListtoStack();
        stacktoList();
      
    }
}
