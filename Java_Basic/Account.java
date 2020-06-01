
package student;

import java.util.Scanner;


public class Account {
    Scanner sc= new Scanner(System.in);
    double bal=0.0;
    Account(){
        System.out.println("Enter initial balance");
        double nbal=sc.nextDouble();
        if(nbal>0)
        {
        bal=nbal;
        }
        else{
         bal=0.0;
         System.out.println("Error: Initial balance is invalid");
    }}
    
    double credit(){
        System.out.println("Enter the amount for deposit");
        double crdt=sc.nextDouble();
        bal=bal+crdt;
        return(crdt);
    }
    
    double debit(){
        System.out.println("Enter the amount for withdrawal");
        double dbt=sc.nextDouble();
         
        if(dbt<bal)
            bal=bal-dbt;
        
       else
            System.out.println("Debit amount does not exceed than amount");
        return(dbt);
    }
    
    double getbalance()
    {
      System.out.println("Balance="+bal);
      return( bal);
    }
}

class savingAccount extends Account{
    double ir;
    private double irt;
    private double r;

    public savingAccount(int nbal) {
        
    }
   public savingAccount(){
        
       double bl;
       double ir;
       System.out.println("Enter initial balance");
       bl=sc.nextDouble();
       System.out.println("Enter initial rate of interest");
       ir=sc.nextDouble();      
        
        
              
    } 
    void calinterest(){
        double si;
        si=(bal*ir/100);
        System.out.println("Simple interest is="+si);
        
    }
    
}

class checkingAccount extends savingAccount{
    double fe=100,b;
    checkingAccount(){
        b=getbalance();
       bal=b;
       
        
    }
     void credit(double crdt){
        crdt=credit();
        bal=bal+crdt;
        bal=bal-fe;
        System.out.println("New balance after transcation="+bal);
        
    }
      void debit(double dbt){
          dbt=debit();
        if(dbt<bal){
            bal=bal-dbt;
            bal=bal-fe;
      }
            else{
            System.out.println("Debit amount does not exceed than amount");
    }
      System.out.println("New balance after transcation="+bal);
}
}

class c {
    public static void main(String args[]){
        
        Account obj1= new Account();
                obj1.credit();
                obj1.debit();
        savingAccount obj2=new savingAccount();
               obj2.calinterest();
        checkingAccount obj3=new checkingAccount();
               obj3.credit();
               obj3.debit();
        
    }
}