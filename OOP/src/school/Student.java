
package school;


public class Student extends Person   {
    public String departmant ;
    public String status ;
    
 Student(String departmant , String status ){
     this.departmant=departmant ;
     this.status=status ;
 }

    public String getDepartmant() {
        return departmant;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String toString(){
       return "departmant:" + departmant +"status:"+status ;
       
}
    public boolean  equals( Object obj ){
        return departmant ;
    }
    

    }
    

