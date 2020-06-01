/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.io.*;

/**
 *
 * @author PC
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
       System.out.println("******** Student Information System************");
       System.out.println(" ");
       System.out.println("Enter the number of student data to be entered");
       BufferedReader br;
       InputStreamReader isr;
       isr= new InputStreamReader(System.in);
       br= new BufferedReader(isr);
        int n=Integer.parseInt(br.readLine());
        String[] name= new String[n];
        int[] roll= new int[n];
        int[] age= new int[n];
        String[] classn= new String[n];
        String[] uni= new String[n];        
        
        for(int i=0;i<n;i++){
            System.out.println("Enter Student Name");
             name[i]=br.readLine();
             System.out.println("Enter Student Roll No");
             roll[i]=Integer.parseInt(br.readLine());
             System.out.println("Enter Student Age");
             age[i]=Integer.parseInt(br.readLine());
             System.out.println("Enter Student Class");
              classn[i]=br.readLine();
              System.out.println("Enter Student University");
              uni[i]=br.readLine();
        }
        
        System.out.println("*************** DISLAY*******************************");
        for(int i=0;i<n;i++){
            System.out.println("Name="+name[i]);
            System.out.println("Roll No="+roll[i]);
            System.out.println("Age="+age[i]);
            System.out.println("Class="+classn[i]);
            System.out.println("University="+uni[i]);
            System.out.println("******************************************************");
        }
    }
    
}
