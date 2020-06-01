/** To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author jitesh
 */
public class check {
  
   
   int[] arr= new int[20];
    void enter(){
     Scanner sc= new Scanner(System.in);
    System.out.println("ENTER ARRAY LIMIT");
    int n=sc.nextInt();
    System.out.println("ENTER the arrays number");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    }
    
       Boolean show(){
        for(int i=0;i<arr.length;i++){
        if(arr[0]==6)
        {
            return(true);
        }
        else if(arr[arr.length-1]==6)
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
      check obj= new check();
            obj.enter();
           System.out.println("RESULT="+obj.show());
       
}}
