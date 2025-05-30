/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.besere.collection_interface.SetInterface;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;


/*

    import java.util.*; - all the collections can be imported by this method

*/
class Student{
    
    private final String name;
    private final int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "Name : " + name + " I.D : " + id;
    }
    
}

public class CopyOnWriteArraySetSample2 {

    public static void main(String args[]) {
        
        //Registering Students
        Set<Student> registeredStud = new CopyOnWriteArraySet<>();
        registeredStud.add(new Student("IvanDave",21));
        registeredStud.add(new Student("Jake the brogrammer",21));
        registeredStud.add(new Student("Bro Code's",34));
        registeredStud.add(new Student("Java Guides",43));
        
        System.out.println("Registered Students");
        System.out.println(registeredStud);
        
        System.out.println("******************************************************");
        
        for (Student student : registeredStud) {
            System.out.println(student);
            if (student.toString().contains("Java Guides")) {
                registeredStud.add(new Student("The Mask",66));
            }
        }
        
        System.out.println("******************************************************");
        
        for (Student student : registeredStud) {
            System.out.println(student);
        }
        

    }
}
