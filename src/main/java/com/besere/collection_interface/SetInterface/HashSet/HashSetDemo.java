/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.besere.collection_interface.SetInterface.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class HashSetDemo {

    public static void main(String args[]) {
      Set<String> name = new HashSet<>();
      
      name.add("Walter");
      name.add("Jessie");
      name.add("Skyler");
        System.out.println("name => " + name);
      name.remove("Walter");
      
        System.out.println("name => " + name);
        System.out.println("name size => " + name.size());
        //name.clear();
        System.out.println("name => " + name);
        name.forEach((x)->System.out.print(x));
        name.forEach(System.out::println);
        
      //Dumping List into the Set
      List<Integer> numberList = new ArrayList();
      numberList.add(12);
      numberList.add(12);
        System.out.println("numberList => " + numberList);
       
      Set<Integer> convert = new HashSet<>(numberList);
      //convert.addAll(numberList);
        System.out.println("convert Set => " + convert);

    }
}
