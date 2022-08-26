import java.util.Scanner;
public class Dart {
public static void main(String[] args) {
    double a=0,b=0,c=0,d=0,e=0,f=0,undecided=0;
    
    Scanner scn = new Scanner(System.in);
    
    System.out.println("Enter the number of darts to be thrown: ");
    double dartCount = scn . nextDouble() ;

    for (int i = 1; i <= dartCount; i++) {
      String area="DARTAREA";
      System.out.println("Dart: "+i);
      double x_coord = (Math.random()*2)-1;
      double y_coord = (Math.random()*2)-1;
      double x = (double) Math.round(x_coord * 10) / 10;
      double y = (double) Math.round(y_coord * 10) / 10;
      System.out.println("Coordinates : ("+x+","+y+")");

      
      if (x<0 && y>0) {
        area="C";
        System.out.println("Region: C ");
      }else if (y<0 && x>0){
        area="F";
        System.out.println("Region: F ");
      }else if (y>0 && x>0 && x+y<1){
        area="A";
        System.out.println("Region: A ");
      }else if (y>0 && x>0 && x+y>1){
        area="B";
        System.out.println("Region: B ");
      }else if (y<0 && x<0 && x<y){
        area="D";
        System.out.println("Region: D ");
      }else if (y<0 && x<0 && x>y){
        area="E";
        System.out.println("Region: E ");
      }

        switch(area) {
          case "A":
            a++;
            break;
          case "B":
            b++;
            break;
          case "C":
            c++;
            break;
          case "D":
            d++;
            break;
          case "E":
            e++;
            break;
          case "F":
            f++;
            break;
          default:
            undecided++;
        }
      }
    
    System.out.println("A: "+a+" darts ("+(100*a)/dartCount+"%)" );
    System.out.println("B: "+b+" darts ("+(100*b)/dartCount+"%)");
    System.out.println("C: "+c+" darts ("+(100*c)/dartCount+"%)");
    System.out.println("D: "+d+" darts ("+(100*d)/dartCount+"%)");
    System.out.println("E: "+e+" darts ("+(100*e)/dartCount+"%)");
    System.out.println("F: "+f+" darts ("+(100*f)/dartCount+"%)");
    System.out.println("Undecided: "+undecided+" darts ("+(100*undecided)/dartCount+"%)");

  }
}