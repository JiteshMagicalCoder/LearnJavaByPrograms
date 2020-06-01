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
public class fixedarray {
    int[] arr= new int[]{0,0,0,0,0,0,0,0,0,0};
      Scanner sc= new Scanner(System.in);
    fixedarray(int n)
    {
    
    for(int i=0;i<n;i++){
       
      System.out.println("Enter which place of array you want to initialize ");
      int j=sc.nextInt();
      System.out.println("Enter the initialize value");
      
      arr[j]=sc.nextInt();
      
      
    }}
    void show(){
        System.out.println(" Initialize");
        for(int j=0;j<10;j++){
             
             System.out.println(arr[j]);
            
        }
    }

    public static void main(String args[]){
        System.out.println("Enter the number of array those who you want to initialize ");
            Scanner sc= new Scanner(System.in);
           int n= sc.nextInt();
        fixedarray obj= new fixedarray(n);
                obj.show();
    }
   
}