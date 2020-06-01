/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author jitesh
 */
public class firstlast {
   
    Boolean show(){
   
     Scanner sc= new Scanner(System.in);
    System.out.println("ENTER ARRAY LIMIT");
    int n=sc.nextInt();
     int[] arr= new int[n];
    System.out.println("ENTER the arrays number");
        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
        
          
        for(int i=0;i<arr.length;i++){
        if(arr[0]==arr[arr.length-1])
        {
            
            return(true);
        }
        else{
            return(false);
        }
    }
        return null;
       }       
    

    public static void main(String args[]){
      firstlast obj= new firstlast();
           
           System.out.println("RESULT= "+obj.show());
       
}}

    

