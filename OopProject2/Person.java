package ödev ;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {
  Scanner scn = new Scanner (System.in) ;


    private String name ;
    private String id; 
    private  ArrayList<Meeting> myMeetings;
    private ArrayList<Meeting> iOrganize;
    
public  Person (String name  ) {
    this.name = name;
    iOrganize=new ArrayList<Meeting>();
    myMeetings=new ArrayList<Meeting>();
    }
public String getName() {
       return name;
   }
public void setName(String name) {
       this.name = name;
   }
public String getId() {
       return id;
   }
public void setId(String id) {
       this.id = id;
   }
public ArrayList<Meeting> getiOrganize() {
       return iOrganize;
   }
public void setiOrganize(ArrayList<Meeting> iOrganize) {
       this.iOrganize = iOrganize;
   }
public ArrayList<Meeting> getMyMeetings() {
       return myMeetings;
   }
public void setMyMeetings(ArrayList<Meeting> myMeetings) {
       this.myMeetings = myMeetings;
   }
@Override
public boolean equals(Object a ) { //I'm checking your credentials .
    if(this.name == ((Person)a).name && this.id == ((Person)a).id) {
        return true;
        }
    else {
        return false;
        }
    }
public boolean addMeeting(Meeting m) { // The meeting date is checked from the myMeeting list. If appropriate, the date is added to the list.
    for(int i=0; i<myMeetings.size(); i++) { //For looping to check dates in myListing.
        if(m .getd() == myMeetings.get(i).getd()) { //If there is another meeting on that date. It returns false.
        return false;
            }
        }
    
    myMeetings.add(m);// If there is no matching date, it returns true and is added to the myMeetings.
        return true;
    
    }
    public void removeMeeting(Meeting m) {
        for(int i=0; i<myMeetings.size(); i++) { //For looping to check dates in myListing.
        if(m .getd() == myMeetings.get(i).getd()) { //If there is another meeting on that date. It returns false.
      
        this.myMeetings.remove(m);
    }
        }
    }
    public void organizeMeeting(Meeting m) {
        this.iOrganize.add(m);
    }
    public void cancelMeeting(Meeting m) { //to cancel the meeting.I need to remove this meeting from both lists.
        //Because it should also be deleted from the list of meeting participants.
        myMeetings.remove(m); 
        iOrganize.remove(m) ;
        }   
    public void displayMyMeetings() { 
        for(int i=0; i<myMeetings.size(); i++) {
            System.out.println(myMeetings.get(i)); 
        }
    }
    public void displayMyOrganizations() {
        for(int i=0; i<iOrganize.size(); i++) {
            System.out.println(iOrganize.get(i));
        }
    }
   @Override
    public String toString() { //Prints the desired in the project.
        return "user " + name + " with ID " + id + " has " + myMeetings + " and " +  iOrganize + " meetings organized .";
    }

}
