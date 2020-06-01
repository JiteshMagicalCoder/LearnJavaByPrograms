/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pctechnology;
import java.io.*;

/**
 *
 * @author jitesh
 */
public class search {
    int[] arr = new int[]{23 ,25, 26 , 28 , 11, 40, 2, 4, 5, 8};
    
    void searchn(int n){
         int i;
        for( i=0;i< arr.length;i++){
                    if(n==arr[i])
                    {
                        System.out.println("Number found="+n);
                        break;
                    }
                    
        }  
        
         if( i==arr.length)
                    {
                        System.out.println("Number not found");
                    }
       
    }
        public static void main(String args[]) throws IOException{
           BufferedReader br;
           InputStreamReader isr;
           isr= new InputStreamReader(System.in);
           br=new BufferedReader(isr);
           System.out.println("Enter the number to find");
           int n= Integer.parseInt(br.readLine());
           search obj= new search();
            obj.searchn(n);
           
        }
    }
    
    
    

