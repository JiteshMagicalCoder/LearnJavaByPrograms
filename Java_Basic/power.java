/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author PC
 */
public class power {
    
    int method(int n, int p)
    {
        int s=1;
        while(p>0)
        {
            s=s*n;
            p--;
        }
        return(s);
    }
    
    power(int n, int p)
    {
        int s=1;
        while(p>0)
        {
            s=s*n;
            p--;
        }
        System.out.println("Result through constructor, power of provided no"+s);
    }
    public static void main(String args[])
    {
        power obj= new power(2,3);
       System.out.println("Result through method, power of provided no"+obj.method(3,2));
        
    }
}

