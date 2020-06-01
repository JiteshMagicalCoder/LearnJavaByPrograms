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
public class stringinitials {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s= sc.nextLine();
        s=s.toUpperCase();
        s=s.trim();
        System.out.println("Initials are below");
        System.out.print(s.charAt(0));
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
            System.out.print("."+s.charAt(i+1));
            }
        }
        
    }

