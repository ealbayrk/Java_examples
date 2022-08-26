package loanKapsülleme ;
import java.util.Scanner;
import java.util.Date ;

public class TestOfLoanKapsülleme {
public static void main(String[] args) {  
  Scanner scn= new Scanner (System.in) ;
    System.out.println("Enter the annual interest  rate for double ");
    double annualInterestRate  = scn.nextDouble() ;
    System.out.println("Enter the numbers for years  for int ");
    int numberOfYears   = scn.nextInt() ;
     System.out.println("Enter the numbers for loan Amount  for double ");
    double loanAmount   = scn.nextDouble() ;
    LoanKapsülleme loan = new LoanKapsülleme ( annualInterestRate , numberOfYears , loanAmount ) ;
    System.out.println(loan.getloanDate().toString()  + loan.getMonthlyPayment()+ loan.getTotalPayment());
    
      
     
 }  
}
  
     
    
     
     
     
     
     
     
  
