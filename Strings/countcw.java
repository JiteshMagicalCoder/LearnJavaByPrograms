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
public class countcw {
    public static void main(String args[]){
        int cw=0,cs=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        
           int l=s.length();
      
           
              for(int i=0;i<s.length();i++){
                  
                  if((i>0) && (s.charAt(i)!=' ')&& (s.charAt(i-1)==' '))
                  { 
                      cw++;
                  }
                  else if((i==0)&&(s.charAt(0)!=' ')){
                      cw++;
                  }
                  else if(s.charAt(i)==' '){
                      cs++;
                  }
              
              }
            int r=l-cs;
            System.out.println("Number of words in a string="+cw);
            System.out.println("Number of characterS in a string="+r);
       
    }
    
}
