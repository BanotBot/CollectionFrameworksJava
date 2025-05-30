
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.Map;

import java.util.HashMap;
import java.util.Map;


class Employee{
    
    private final int id;
    private final String name,department;
    private final double salary;
    public Employee(int id, String name, String department,double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return department;
    }
    public double getSalary(){
        return salary;
    }
}

public class UserDefinedHashMapC {

    public static void main(String args[]) {
   
       
       Employee[] emp = {
            new Employee(0,"IvanDave","Programmer",3000.00),
            new Employee(1,"Jake","Network Engineer",4000.00),
            new Employee(2,"Kira","Technician",6000.00),
            new Employee(3,"L","Cybersecurity",7000.00),
       };
       
        Map<Integer,Employee> data = new HashMap<>();
       
        //Inserting data into the map using key id and specified the index
        for (Employee employee : emp) {
            data.put(employee.getID(),employee);
        }
        
        // tiwasonon pani sya.
        
        
    }
}
