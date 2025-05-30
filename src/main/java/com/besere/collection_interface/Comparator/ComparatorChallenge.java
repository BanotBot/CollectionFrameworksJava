
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package com.besere.collection_interface.Comparator;

import java.util.Date;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorChallenge {
    int price;
    Date date;
    String productName;
    
   public ComparatorChallenge(int price, Date date, String productName) {
        this.price = price;
        this.date = date;
        this.productName = productName;
    }
   
    public Comparator<ComparatorChallenge> userChoices(int userChoice){
        
        return switch(userChoice){
            case 1 -> (x,j) -> Integer.compare(x.price, j.price);
            case 2 -> (x,j) -> x.date.compareTo(j.date);
            case 3 -> (x,j) -> x.productName.compareToIgnoreCase(j.productName);
            default -> throw new IllegalArgumentException();
        };
   
    }
    
    protected int getPrice(){
        return price;
    }
    public Date getDate(){
        return date;
    }
    public String getProductName(){
        return productName;
    }
    
    @Override
    public String toString(){
        return "ProductName : " + productName
                +"Date : " + date
                +"Price : " + price;
    }   
           
    public static void main(String args[]) {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
       
        Date date1 = new Date(2024,12,12);
        Date date2 = new Date(2023,01,14);
        Date date3 = new Date(2021,10,7);
        
        List<ComparatorChallenge> dataValue = Arrays.asList(
            new ComparatorChallenge(2000,date1,"Katol"),
            new ComparatorChallenge(3000,date2,"Baoma"),
            new ComparatorChallenge(4000,date3,"Lion Tiger")
        );
         
        String[] choices = {
            "1.Price",
            "2.Date",
            "3.Product Name"
        };
        
        try {
            
            int updatedChoices;
            
            do {
                
                for (int i = 0; i < choices.length; i++) {
                    System.out.print(choices[i] + "\t");
                }
                
                System.out.println();
                
                System.out.print("Enter choices : ");
                int userChoices = Integer.parseInt(input.readLine());
                
                if (userChoices >= 1 && userChoices <=3) {
                    
                    ComparatorChallenge instance  = new ComparatorChallenge(0, new Date(2024,02,02),"");
                    Comparator<ComparatorChallenge> comparator = instance.userChoices(userChoices);
                    Collections.sort(dataValue,comparator);
                    dataValue.forEach((x)->System.out.println(x));
                }
            
                updatedChoices = userChoices;
                
            } while (updatedChoices != 4);
        
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error : " + e.getMessage());
        }
        
    }
    
}