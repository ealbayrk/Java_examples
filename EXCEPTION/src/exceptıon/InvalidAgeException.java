/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptıon;

    
import java.io.IOException;


public class InvalidAgeException extends  IOException {
    
    public InvalidAgeException(String message) {
        
        super(message);
        
    }
    @Override
    public void printStackTrace() {
        System.out.println("Bu bir invalid age hatasıdır...");
    }
    
    
    
}
