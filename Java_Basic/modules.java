/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pctechnology2;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class modules {
    String [] str = new String[10];
    int n;
     void add(){
         System.out.println("Enter the number of students to add");
           Scanner sc = new Scanner(System.in);
           Scanner sd = new Scanner(System.in);
           int n= sc.nextInt();
           for(int i=0;i<n;i++){
               System.out.println("Enter the name of student");
               str[i]=sd.next();
           }
     }

     void delete(){
           String a; 
         Scanner sn = new Scanner(System.in);
         System.out.println("Enter the name of students to delete");
           a=sn.next();
           for(int i=0;i<n;i++){
             if(a==str[i]){
                 str[i]="\0";
             }     
           }
           
     }
     void search(){
         String a; 
         Scanner sn = new Scanner(System.in);
         System.out.println("Enter the name of students to delete");
           a=sn.next();
           for(int i=0;i<n;i++){
             if(a==str[i]){
                System.out.println(" Nmae is found"+ a);
             }     
     }
     } 
     
    public static void main(String args[]) throws IOException{
         int x;
        BufferedReader br;
        InputStreamReader isr;
        isr= new InputStreamReader(System.in);
        br= new BufferedReader(isr);
        modules obj= new modules();
            
         System.out.println(" Enter your choice");
         System.out.println("1.ADDING NEW STUDENT");
         System.out.println("2.DELETE  STUDENT");
         System.out.println("3.SEARCH THE STUDENT NAME");
         System.out.println("4.UPDATE THE STUDENT NAME");
         System.out.println("please select in above given option");
         x=Integer.parseInt(br.readLine());
        switch (x) {
            case 1: 
                    obj.add();
                    break;
            case 2: 
                    obj.delete();
                    break;
            case 3:
                    obj.search();
                    break;
           // case 4: 
             //       obj.update();
               //     break;                 
            default:
                    break;   
        }             
                  
      
    }
    
}
