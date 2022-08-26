
package student;
public class ArrayOfObject {
public static void main (String[]args) {                                                                        
   student[] studentList = new student[10];
         System.out.println("studentList[0]:"+ studentList[7]);
   
         
   /*  ilk seçenek tek tek yazmak :
    studentList[0] = new student () ;
    studentList[1]=new student () ;
    */
     
for ( int i = 0 ; i<10 ; i ++ ) {
    studentList[i]=new student (i);
}
    studentList[5].name = " ayşe" ;
    studentList[6].name = " ebrar";
    
            

for ( int i = 0 ; i<10 ; i ++ ) {
    System.out.println("age of student"+ studentList[i].id+ " is " + studentList[i].age+"and the name is " + 
            studentList[i].name);
}

  
}
}        