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
public class reversestring {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the string");
        String s=sc.nextLine();
        int l=s.length();
        System.out.println("String in reverse order");
        for(int i=l-1;i>=0;i--){
            System.out.print(s.charAt(i));
            
        }
    }
    
}
