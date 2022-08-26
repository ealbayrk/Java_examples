package ödev;

import java.util.ArrayList;
import java.util.Scanner;
 public class TestClass { 
      
   private static  ArrayList<Meeting> allMeetings = new ArrayList<>();
   private static ArrayList<Person> host = new ArrayList<>();
    private  String UserName;
    private static  Person Person;
    public static Person p;
   // public static MDate d;
 public static void main(String[] args) {
   // Person p1 = new Person ();
    Scanner scn = new Scanner(System.in);
    System.out.print("Please select the action you want to take\n"+"1. Create and host a new meeting \n" +"2. Cancel a meeting\n" + "3. Attend an existing meeting\n" + "4. Leave a meeting\n" +"5. Display My Meetings\n" + 
            "6. Display Meetings organized by me\n" + "7. Logout\n" + "8. Exit\n" );
            int menu = scn.nextInt();          
if(menu==1) {
     createMeeting(p);
   /* MDate date = new  MDate (3,4,5);
    System.out.println("New meeting created and added to your program.");*/

    createMeeting(p);
    System.out.println("What is your name ?");
    p.setName(scn.next());
    System.out.println("Day:");
    int day = scn.nextInt();
    System.out.println("Month:");
    int month = scn.nextInt();
    System.out.println("Year");
    int year = scn.nextInt();
    System.out.println("New meeting created and added to your program.");
    MDate d1 = new MDate(day,month,year);
    }
    
else if(menu==2) {
    /*System.out.println("What is the name of the meeting to be canceled?");
    String Mname = scn.next();
    p1.cancelMeeting(Mname);*/
    
    System.out.println("What is the name of the meeting to be canceled?");
    String Mname = scn.next();
    Person.displayMyOrganizations();    
    Meeting MeetingCancel = new Meeting(  ,"ali" , "veli"); 
        for(int i=0; i<allMeetings.size(); i++) {
            if(allMeetings.get(i).getName().equals(Mname)) {
                MeetingCancel = allMeetings.get(i);
                p.cancelMeeting(MeetingCancel);
    System.out.println("The meeting has been canceled and removed from your schedule .");
    }
        }
}
else if(menu==3) {
    attendMeeting();
    System.out.println("You have attended the current meeting and it has been added to your schedule .");
}
else if(menu==4) {
    leaveMeeting();
    System.out.println("You left the meeting");
}
 else if(menu==5) {  
   System.out.println("Here are the meetings you have attended :");
    p.displayMyMeetings();
}
else if(menu==6) {
   System.out.println(" Here are the meetings you organized:");
   p.displayMyOrganizations();
}
else if (menu==7){         
  //I'm returning it to the main menu by not adding "break".
}  
 else if (menu==8) {
  System.out.println(" Exiting the system..." );
 break;
 }
 }
   public static void createMeeting(Person p){
          Scanner scn = new Scanner(System.in);
        System.out.println("Enter name of the meeting");
        String hName = scn.next();
        
        System.out.println("Enter the date of the meeting \n in order enter day/month/year");
        int d = scn .nextInt();
        int m = scn .nextInt();
        int y = scn .nextInt();
        
    }
   public void cancelMeeting(String mname) { 
        
//to cancel the meeting.I need to remove this meeting from both lists.
        //Because it should also be deleted from the list of meeting participants.
        myMeetings.remove(mname);
        iOrganize.remove(mname) ;
        }
        
 public static void attendMeeting() {
      Scanner scn = new Scanner(System.in);
        for(int i=0; i<allMeetings.size(); i++) {   
        System.out.println("What is the name of the attendee you will attend?");
        String Aname = scn.next();
        if(allMeetings.get(i).getName().equals(Aname)) {
                allMeetings.get(i).addAttendee(Person);
            }
        }
    }
public static void leaveMeeting(){
    Scanner scn = new Scanner(System.in);
        for(int i=0; i<allMeetings.size(); i++) {   
        System.out.println("What is the name of the attendee you will leave?");
        String Lname = scn.next();
        if(allMeetings.get(i).getName().equals(Lname)) {
                allMeetings.get(i).removeAttendee(Person);
            }
    

 }
}
 }