/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;
import java.io.*;
/**
 *
 * @author jitesh
 */
public class printsub {
    public static void main(String args[]) throws IOException{
        BufferedReader br;
        InputStreamReader isr;
        isr=new InputStreamReader(System.in);
        br=new BufferedReader(isr);
        System.out.println("Enter the string");
        String s=br.readLine();
        System.out.println("Enter the starting and last index for printing sub-string");
        int i=Integer.parseInt(br.readLine());
        int l=Integer.parseInt(br.readLine());
        System.out.println("Sub-string is below :");
        for(int j=i;j<=l;j++){
            System.out.print(s.charAt(j));
        }
        
        
    }
    
}
