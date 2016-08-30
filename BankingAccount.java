import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingAccount {


    public static void main(String[] args) {
                
                
        Scanner accNumber = new Scanner(System.in);
        // Reading from System.in
        System.out.println("Enter a number: ");
        int n = 0;
        
        try{
         n = accNumber.nextInt();
        
        String accNumberString = Integer.toString(n);
        if(accNumberString.length() == 10){
            
             Scanner accType = new Scanner(System.in);
        System.out.println("Enter 'C' for Checkings or 'S' for Savings");
        
        String type= accType.nextLine();
        
        if("S".equals(type)|| "s".equals(type)){
            System.out.println("Account Number: "+ n +" is Savings Account" );
            System.out.println("The money in a savings account, however, is not intended for daily use, but is instead meant to stay in the account ");
        }
        else if("C".equals(type)|| "c".equals(type)){
            System.out.println("Account Number: "+ n +" is Checkings Account" );
            System.out.println("A checking account is a type of bank deposit account that is designed for everyday money transactions.");
    }
            
        }
        
        
        
        else{
            System.out.println("Account number has to be 10 digits");

       
    }
        }catch(InputMismatchException e)
        {
             System.out.println("Integers only, please.");
        
        
        
    }    
    }
    
}
