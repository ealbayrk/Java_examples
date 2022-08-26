package ödev;

 import java.util.Scanner;

public class MDate { 
    private static int d;
    private static int m;
    private static int y;
    private String timeZone;
    private int hour;
    private int minute;
public MDate (int d, int m, int y , String timeZone ,int hour , int minute  ) {
      
        this.d = d;
        this.m = m;
        this.y = y;
        this.timeZone = timeZone ;
        this.hour = hour;
        this.minute = minute ; 
}
public MDate (int d, int m, int y   ) {
      
        this.d = d;
        this.m = m;
        this.y = y;
       
}

    public static int getd() {
        return d;
    }

    public void setd(int d) {
        this.d = d;
    }

    public static int getMonth() {
        return m;
    }

    public void setMonth(int m) {
        this.m = m;
    }

    public static int getYear() {
        return y;
    }

    public void setYear(int y) {
        this.y = y;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
   
    
}
