
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author admin
 */

/*
    Set.of() - which creates a set containing the student object.
*/

public class StudentComparator{
    String name;
    int age;
    
    public StudentComparator(String name,int age) {
        this.name = name;
        this.age = age;
    }
   
    @Override
    public String toString(){
        return "!Name : " + name 
                + "Age : " + age + "!";
    }
    
    public static void main(String args[]) {    
        
      Comparator<StudentComparator> comp = (StudentComparator x,StudentComparator j)->{
          if (x.age > j.age) {
              return 1;
          }
          return -1;
      };
      
        List<StudentComparator> stud = Arrays.asList(
                new StudentComparator("Ivan",12),
                new StudentComparator("Jake the Brogrammer",23),
                new StudentComparator("Killua",33),
                new StudentComparator("Shanks",3)
        );
        
        Collections.sort(stud,comp);
        System.out.println("Student Value ->\n" + stud);
        
    }
  
}
