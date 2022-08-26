package employee;


public class testofemployee {
    
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 1000);
        Employee e2 = new Employee("Micheal", 2000);

       Employee.raiseRate = 0.12;
       e1.Salary();
       e2.Salary();
        System.out.println("compare :" + e1.compareSalary(e2).Salary);
        e1.Salary();
       e2.Salary();
        System.out.println("compare :" + e1.compareSalary(e2).name);
        
       e1=e2 ;
        System.out.println("e1 salary :" + e1.Salary);
        System.out.println("e2 salary :" + e2.Salary);
       
        
       
       
        
        
        
        
        
        
        
        
}
}