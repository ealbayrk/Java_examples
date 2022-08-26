
package employee;

import java.util.Date;


public class Employee {

int eNumber = 1000;
static int count ;
String name ;
double Salary ;
Date LastRaiseDate;
static double raiseRate ;

Employee( String eName , double eSalary ) {
        name = eName;
        Salary = eSalary;
      
        eNumber += count; 
        count++;
    
}
public double raiseSalary () {
    if(LastRaiseDate == null){
    Salary = Salary + (Salary * raiseRate);
   
    LastRaiseDate = new Date();
}
    else {
        int diff = (int) (new Date().getTime()- LastRaiseDate.getTime()) ;
            
            }
    

    
    
    
    
    return Salary;
    
}
public Employee compareSalary ( Employee e ) {
    if (this.Salary > e.Salary){
        return this ;

    
}
    return e;
    
}

    void Salary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
