/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class methodarray {
    Scanner sc= new Scanner(System.in);
    int[] arr= new int[10];
    void getarray(int n){
          System.out.println("Enter the values arrays");
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         System.out.println("Display original array");
           
                for(int i=0;i<n;i++)
                {           
                   System.out.println(arr[i]);   
                }
    }
    
    void getsorted(int n){
         int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n-1;j++){
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }}
             
           System.out.println("Display sorted array");
               for(int i=0;i<n;i++)
                {           
                   System.out.println(arr[i]);   
                }
        }
    
    public static void main(String args[])
     {  Scanner sc= new Scanner(System.in);
        methodarray ob= new methodarray();
         System.out.println("Enter the number of array do you want to enter");
         int n= sc.nextInt();
         ob.getarray(n);
         ob.getsorted(n);
    }
}
