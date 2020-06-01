/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pctechnology;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author jitesh
 */
public class frequency {
            int[] arr= new int[10];
            int l;
       void getvalue() throws IOException{
        BufferedReader br;
        InputStreamReader isr;
        isr= new InputStreamReader(System.in);
        br=new BufferedReader(isr);
        System.out.println("Enter the array limit");
         l=Integer.parseInt(br.readLine());
        System.out.println("Enter the array elements");
        for(int i=0;i<l;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
    }
    
    void count(int n){
        int c=0;
        for(int i=0;i<l;i++){
            if(n==arr[i]){
                c++;
            }
            
            
        }if(c==0)
        {
            System.out.println("Number not present so frequency is zero");
        }
        else
        {
            System.out.println("Number present in an array and frequency of number is="+c);
         }
    }
    public static void main(String args[]) throws IOException{
        frequency obj= new frequency();
           obj.getvalue();
           System.out.println("Enter the number to get the frequency");
           Scanner sc= new Scanner(System.in);
           obj.count(sc.nextInt());           
              
    }
}
