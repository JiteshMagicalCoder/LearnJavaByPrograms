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
public class countvc {
      public static void main(String args[]){
        int cv=0,cc=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
         char ch[]= new char[s.length()];
           
        for(int i=0;i<s.length();i++){
            ch[i]=s.charAt(i);
                   
            }
        
    for(int i=0;i<s.length();i++){
        if(ch[i]=='a'||ch[i]=='A'||ch[i]=='e'||ch[i]=='E'||ch[i]=='i'||ch[i]=='I'||ch[i]=='o'||ch[i]=='O'||ch[i]=='u'||ch[i]=='U'){
            cv++;
        }
       else
        {
            cc++;
        }
    }
    System.out.println("Number of vowels in string="+cv);
    System.out.println("Number of constant in string="+cc);        
}}
