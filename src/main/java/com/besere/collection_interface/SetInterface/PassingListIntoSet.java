
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.SetInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PassingListIntoSet {

    public static void main(String args[]) {
        
       List<Integer> list = new ArrayList<>();
       list.add(12);
       list.add(4);
       list.add(4);
       list.add(50);
       list.add(3);
       
        System.out.println("List Data => " + list);
        
        Set<Integer> sets = new HashSet<>(list); // This will automatically add the list in the set
   
        Iterator iterate = sets.iterator();
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + " ");
        }
       
        
        
    }
}
