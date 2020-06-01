/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author jitesh
 */
public class stringequals {
    public static void main(String args[]){
         int c=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1=sc.nextLine();
        System.out.println("Enter the second string");
        String s2=sc.nextLine();
        
        if(s1.length()==s2.length()){
                    
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
            c++;
             }
        }
         if(c==s1.length())
           System.out.println(" Strings are equal");
        }
        else
        System.out.println("Strings are not equals");
        } 
    }      
    
       

