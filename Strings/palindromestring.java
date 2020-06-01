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
public class palindromestring {
     public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the string");
        String s=sc.nextLine();
        int l=s.length();
        int f=0;
        for(int i=0,j=l-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j))
                f=1;
            
        }
       if(f==0){
           System.out.println("String is Pallindrome");
       }
       else
       {
           System.out.println("String is Not-Pallindrome");
       }
    
}
}