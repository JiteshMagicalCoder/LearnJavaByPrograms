/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pctechnology;

/**
 *
 * @author PC
 */
public class inheritence {
    void disp(){
        System.out.println("Hello i m super class");
    }
 } 
    class sub extends inheritence{
        void show(){
            System.out.println("Hello i m sub class");
        }
    }
 class c {
     
    public static void main(String args[]){
        sub obj = new sub();
        obj.disp();
        obj.show();
    }
    
}
