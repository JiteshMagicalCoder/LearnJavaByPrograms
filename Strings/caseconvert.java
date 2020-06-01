/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jitesh
 */
public class caseconvert {
    public static void main(String args[]){
      
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the string ");
        String s=sc.nextLine();
       try{
        for(int i=0;i<=s.length();i++){
            int ch=s.charAt(i);
           if((s.charAt(i) >65) && (s.charAt(i)<91)){
                ch=ch+32;
              System.out.print((char)ch);
            }
           else if( ch >96 && ch<123){
               ch=ch-32;
               System.out.print((char)ch);
           }
         if(ch==32)  
         {
             System.out.print(" ");
               
       }  
    }}
       catch(IndexOutOfBoundsException ae){
           System.out.println(ae);
       }
       }
}