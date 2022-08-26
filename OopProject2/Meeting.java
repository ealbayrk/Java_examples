package proje ;
import java.util.ArrayList;
import java.util.Scanner;


public class Meeting    {
        Scanner scn = new Scanner(System.in);

    private MDate d ;
    private ArrayList<Person> attendees = new ArrayList<Person>();
    private Person host;
    private boolean isOnline;
    private String url;
    private String location;
    private String name ;
   
     
public Meeting( MDate d , Person p , Person host) {
   this.d = d;
   this.attendees.add(p);
   this.host = host;
   this.isOnline = isOnline;
   
 
   if (!this.isOnline) {
       this.location = location ;
   }
   else if (this.isOnline) {
       this.url= url ;
   }
}

    Meeting() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public boolean equals(Object m2) {
        if( ((Meeting)m2).d == this.d &&  ((Meeting)m2).attendees == this.attendees &&((Meeting)m2).host == this.host ) {
            return true;
        }
        else {
            return false;
        }
    }
  
  
    public void  addAttendee(Person p) {
   if(attendees.contains(p)) {
       this.attendees.add(p); 
       
       }
   }
     
 
   public boolean removeAttendee(Person p) {
       if(attendees.contains(p)){
       attendees.remove(p);
       int index;
       for(int i = 0 ; i< attendees.size() ;i++){
           if(p.equals(attendees.get(i))){
               index = i;
           }
           attendees.remove(i);
       }
              return true;

     
   }
   return false;
}
   public void removeAllAttendees () {
        for(int i = 0 ; i< attendees.size() ;i++){
             attendees.remove(i);
        }
       
   }
   public void createMeeting(Person p){
        System.out.println("Enter name of the meeting");
        String hName = scn.next();
        
        System.out.println("Enter the date of the meeting \n in order enter day/month/year");
        int d = scn .nextInt();
        int m = scn .nextInt();
        int y = scn .nextInt();
        
    }
   public String toString(){
        return this.name + "date"+ MDate.getd() + MDate.getMonth() + MDate.getYear() + "it is " + isOnline +    "location" + location ;

               
               
   }
   public MDate getd() {
       return d;
   }
  public String name() {
       return name;
   }
}
    
    
   
   
   
