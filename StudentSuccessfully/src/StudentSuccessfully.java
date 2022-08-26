import java.util.Scanner;

public class StudentSuccessfully {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter your midterm result : ");
        int midterm = scn.nextInt();
        System.out.print("Enter your final result : ");
        int fınal = scn.nextInt();
        
        double grade = (midterm * 0.4) + (fınal * 0.6);
        
        System.out.println("Average of your grades: " + grade);
        
        if(grade>=50) {
            System.out.println("Congratulations ! You passed the class.");
        }
        else {
            System.out.println("You did not pass the class .");
        }
            
    }
}