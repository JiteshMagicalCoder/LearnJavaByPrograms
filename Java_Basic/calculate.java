/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class calculate {
       Scanner sc1= new Scanner(System.in);
       Scanner sc2= new Scanner(System.in);
        

    float s=0;
    void add() throws IOException{
            System.out.println("*****ENTER TWO NUMBER FOR OPERATION");
            System.out.println("*****ENTER FIRST NUMBER*****");
            float a=sc1.nextInt();
            System.out.println("*****ENTER SECOND NUMBER*****");
            float b=sc2.nextInt();
             s=a+b;
            System.out.println("SUM OF TWO NUMBER IS="+s);
                    
    }
    
    void sub() throws IOException{
          System.out.println("*****ENTER TWO NUMBER FOR OPERATION");
            System.out.println("*****ENTER FIRST NUMBER*****");
            float a=sc1.nextInt();
            System.out.println("*****ENTER SECOND NUMBER*****");
            float b=sc2.nextInt();
              s=a-b;
            System.out.println("SUBTRACTION TWO NUMBER IS="+s);
    }
    
    void mult() throws IOException{
        System.out.println("*****ENTER TWO NUMBER FOR OPERATION");
            System.out.println("*****ENTER FIRST NUMBER*****");
            float a=sc1.nextInt() ;
            System.out.println("*****ENTER SECOND NUMBER*****");
            float b=sc2.nextInt() ;
            s=a*b;
            System.out.println("MULTIPLICATION OF TWO NUMBER IS="+s);
    }
    
    void div() throws IOException{
            
            System.out.println("*****ENTER TWO NUMBER FOR OPERATION");
            System.out.println("*****ENTER FIRST NUMBER*****");
            float a=sc1.nextInt();
            System.out.println("*****ENTER SECOND NUMBER*****");
            float b=sc2.nextInt();
             s=a/b;
            System.out.println("DIVISION OF TWO NUMBER IS="+s);
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br;
        InputStreamReader isr;
        isr= new InputStreamReader(System.in);
        br=new BufferedReader(isr);
        System.out.println("***********************Calculator******************************");
        System.out.println("   ");
        int c;
        
       calculate ob= new calculate();
    
           do {
            System.out.println("PLEASE SELECT YOUR CHOICE ");
            System.out.println("  ");
            System.out.println("*****1. ADD *****");
            System.out.println("*****2. SUBTRACT *****");
            System.out.println("*****3. MULTIPLY *****");
            System.out.println("*****4. DIVISION *****");
            System.out.println("*****5. EXIT *****");
             c=Integer.parseInt(br.readLine());
                
                    
            switch(c){
            
            case 1:  ob.add();
                      break;
            case 2: ob.sub();
                      break;
            case 3: ob.mult();
                      break;
            case 4: ob.div();
                      break;
            default: System.out.println("*****PLEASE ENTER IN THE ABOVE GIVEN OPTIONS *****");
                     
            }  
        }while(c!=5);
        
    }
    
}
