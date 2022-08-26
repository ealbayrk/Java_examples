  import java.util.*;

public class Digits{

    static int digitZero(int n){
        return n%10 ;
    }
    static int digitAt(int n , int i){
        while ( i > 0 ){
            n = n /10;
            i--;
        }
        return n%10;
    }
    static int digitSumLargerThan(int n , int limit){
        int sum = 0 ;
        while ( n>0 ){
            if(n%10 > limit )
                sum += n%10;
            n =n/10;
        }
        return sum;
    }
    static int digitCount(int n , int digit){
        int count = 0 ;
        while ( n>0 ){
            if(n%10 == digit )
               count++;
            n =n/10;
        }
        return count;
    }
    static int digitRemoveAt(int n , int i){
        int count =1 ;
        int sum =0;
        while ( n > 0 && i>0 ){
            sum += (n%10) * count;
            count= count*10;
            n = n /10 ;
            i--;
        }
        n=n/10;
        while(n>0){
            sum += (n%10)* count;
            n=n/10;
            count = count *10;
        }

        return  sum ;
    }
    static int digitRemoveAll(int n , int digit){
        int count =1 ;
        int sum =0;
        while ( n > 0  ){
            if( n%10 != digit ){
                sum += (n%10) * count;
                count = count*10;
            }
            n = n /10 ;
        }

        return  sum ;
    }
    static int randomNumber(int k ){
        int count = 1 ;
        int sum =0 ;
        Random r = new Random();
        while ( k > 0 ){
            if(sum == 0  ){
                sum += r.nextInt(9) * count  ;
                count = count *10;
                k--;
            }
            else{
                int number = r.nextInt(9);
                if(digitCount(sum ,number ) == 0){
                    sum += number*count;
                    count = count * 10;
                    k--;
                }
            }
        }
        return sum;
    }
    static int reverse(int n ){
        int sum =0 ;
        while(n != 0) {
            sum = (sum * 10) + (n%10);
            n =n/10;
        }
        return sum;
    }
    static boolean isPalindrome(int n ){
        boolean result =false ;
        int remain =0;
        int reversed =0;
        int copy_n = n;
        while (copy_n>0){
            remain = copy_n%10;
            reversed = reversed *10 + remain;
            copy_n=copy_n/10;
        }
        if(reversed == n)
             result =true;
        return  result;
    }
    static int charDigitSum(String n ){
        int sum =0 ;
        for(int i =0 ; i < n.length() ; i++){
            sum += (int)(n.charAt(i));
        }
        return sum;
    }
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int n =0;
        while(n!= 11){
            System.out.println("Digits Library Menu:");
            System.out.println("1. Least significant digit");
            System.out.println("2. ith digit");
            System.out.println("3. Sum of digits\n4. Count digits\n5. Remove digitK\n6. Remove digit with value");
            System.out.println("7. Generate random number");
            System.out.println("8. Reverse digits\n" +
                    "9. Check palindrome\n" +
                    "10. CharDigitSum\n" +
                    "11. Quit\n");
            System.out.println("Choose action to perform:");
            n = scanner.nextInt();
            int number , i;
            switch (n){
                case 1:
                    System.out.println("Enter the number to find least significant digit : ");
                    number = scanner.nextInt();
                    System.out.println("Least significant Digit is:"+ digitZero(number));
                    break;
                case 2 :
                    System.out.println("Enter the number to find ith digit : ");
                    number = scanner.nextInt();
                    System.out.println("Enter i : ");
                    i=scanner.nextInt();
                    System.out.println("ith Digit is:"+ digitAt(number,i));
                    break;
                case 3:
                    System.out.println("Enter the number to find digit sum:");
                    number = scanner.nextInt();
                    System.out.println("Enter a limit:");
                    i=scanner.nextInt();
                    System.out.println("The limit digit sum is calculated\n" +
                            "as:"+ digitSumLargerThan(number,i));
                    break;
                case 4 :
                    System.out.println("Enter the number to count digits:");
                    number = scanner.nextInt();
                    System.out.println("Enter a digit to find count of it :");
                    i=scanner.nextInt();
                    System.out.println("The count of digit in number is :"+ digitCount(number,i));
                    break;
                case 5:
                    System.out.println("Enter the number to remove digit at index:");
                    number = scanner.nextInt();
                    System.out.println("Which digit to remove?");
                    i=scanner.nextInt();
                    System.out.println("Removed digit:"+ digitRemoveAt(number,i));
                    break;
                case 6:
                    System.out.println("Enter the number to remove specific digits :");
                    number = scanner.nextInt();
                    System.out.println("Enter a digit to remove:");
                    i=scanner.nextInt();
                    System.out.println("Number after removing digits:"+ digitRemoveAll(number,i));
                    break;
                case 7:
                    System.out.println("Enter the digit number to generate random number :");
                    number = scanner.nextInt();
                    System.out.println("Random number :"+ randomNumber(number));
                    break;
                case 8:
                    System.out.println(" Enter the number to invert:");
                    number = scanner.nextInt();
                    System.out.println("Reverse is found as: "+ reverse(number));
                    break;
                case 9:
                    System.out.println("Enter the number to check:");
                    number = scanner.nextInt();
                    if(isPalindrome(number))
                        System.out.println("This number is a palindrome");
                    else
                        System.out.println("This number is not a palindrome");
                    break;
                case 10:
                    System.out.println("Enter the string to sum ASCII:");
                    String x = scanner.next();
                    int sum =charDigitSum(x);
                    System.out.println("Digit sum :" + sum);
                    break;
                case 11 :
                    break;
            }
            System.out.println("\n\n————————————————————————————");

        }
        System.out.println("Ok, good bye.");


    }
}
