package loanKapsülleme ;
import java.util.Date;
public class LoanKapsülleme {
    private double annualInterestRate ;
    private int numberOfYears ;
    private double loanAmount ;
    private double MonthlyPayment;
    private double TotalPayment;
    private Date loanDate;
    
    LoanKapsülleme () {
    }
    LoanKapsülleme (double annualInterestRate ,int numberOfYears , double loanAmount   ){   
        this.loanAmount=loanAmount ;
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears ;
        this.loanDate = new Date();
    }
public double  getannualInterestRate (){ 
     return annualInterestRate ;
 }
public int getnumberOfYears () {
     return numberOfYears ;
}
public double getloanAmount () {
    return loanAmount ;
}
public java.util.Date getloanDate () {
    return loanDate ;
}
public static void setannualInterestRate (double annualInterestRate ) {   
    
}
public static void setnumberOfYears (int numberOfYears ) {
    
}
public static void  setloanAmount (double loanAmount ) {
    
}
public double getMonthlyPayment () {
    
   return MonthlyPayment ; 
}
public double getTotalPayment () {
    double TotalPayment = MonthlyPayment * numberOfYears *12 ;
        return TotalPayment;
    
}

  
    
    
    
    
    
    
    
    
    
}
