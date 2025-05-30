
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.SetInterface.HashSet;

import java.util.HashSet;
import java.util.Set;
import java.io.*;

public class HashSetChallenge {
    Set<Integer> studID;
    
    public HashSetChallenge() {
        this.studID = new HashSet<>();
    }
    
    public void addID(int id ){
        studID.add(id);
    }
    
    public void displayData(){
        //System.out.println("Total Unique's ID : " + studID);
        System.out.println("\tUnique Student IDs: " + studID);
        System.out.println("\tTotal Unique IDs: " + studID.size());
    }
    
    public void searchStudents(int id){
        System.out.println("\tStudent ID : " + id + 
                    (studID.contains(id) ? " is registered!" : " is not yet registered!"));
    }
    
    public static void main(String args[]) throws IOException {
        
       BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       HashSetChallenge obj = new HashSetChallenge();
       
        System.out.print("Enter the number of Student's ID's : ");
        int id = Integer.parseInt(input.readLine());
        
        for (int i = 0; i < id; i++) {
            System.out.print("Enter Student ID : ");
            int studID = Integer.parseInt(input.readLine());
            obj.addID(studID);
        }
            obj.displayData();
            System.out.print("Enter Student's ID to Search : ");
            int search = Integer.parseInt(input.readLine());
            obj.searchStudents(search);
            
        }
}
