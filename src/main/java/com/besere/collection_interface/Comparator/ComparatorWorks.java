
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWorks {
    
    public static int getFirstDigit(int num){
        while (num >= 10) {            
            num/=10;
        }
        return num;
    }
        
    public static void main(String args[]) {
        
    Comparator<Integer> comp = (Integer x, Integer j) -> {
        if (x % 10 > j %10)
            return 1;
        return -1;            
    };
    
        List<Integer> list = new ArrayList<>();
        list.add(102);
        list.add(10);
        list.add(201);
        list.add(113);
        list.add(90);
        list.add(1);
        
        Collections.sort(list,comp);
        System.out.println("Sorted using Last Digit => " + list);
        
        
     Comparator<Integer> comp2 = (x ,j)-> Integer.compare(getFirstDigit(x),getFirstDigit(j));
        List<Integer> list2 = new ArrayList<>();
        list2.add(102);
        list2.add(30);
        list2.add(801);
        list2.add(613);
        list2.add(90);
        list2.add(1);
        
        Collections.sort(list2,comp2);
        System.out.println("Sorted using first digit => " + list2);
    }
}
