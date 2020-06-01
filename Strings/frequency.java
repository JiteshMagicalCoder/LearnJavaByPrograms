/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author jitesh
 */
public class frequency {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
         s=s.toLowerCase();
        int c=0;
       for(char i='a';i<='z';i++){
           c=0;
           for(int j=0;j<s.length();j++ ){
               if(s.charAt(j)==i){
                   c++;
               }
           }
           if(c!=0){
               System.out.print("Frequency of "+" "+i+"="+c);
               System.out.print("  ");
           }
       }
        
       // Coding for word count
       System.out.println("  ");
       s=s.replaceAll("\\W", " ");
       s=s.replaceAll("\\s+"," ");
       String[] tokens=s.split(" ");
       ArrayList<String> items=new ArrayList<String>();
       items.addAll(Arrays.asList(tokens));
       int count=0;
       
       for(int i=0;i<items.size();i++){
           System.out.printf( "%s:=", items.get( i ) );
           for(int j=0;j<items.size();j++){
               if(items.get(i).equals(items.get(j)))
                   count++;
               if(items.get(i).equals(items.get(j)) && count>1)
                   items.remove(j);
           }
            System.out.printf( "%d\n", count );
             count = 0;
       }
       
        }
        
    }
    

