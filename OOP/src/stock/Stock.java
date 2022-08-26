package stock ;

import java.util.Random;

public class   Stock {
    String symbol ;
    String name ;
    double perviousClosingPrice ;
    double currentPrice ;
    
    Stock (double pcp , String n , String s){
      name = n ;
      perviousClosingPrice= pcp ;
      symbol = s ;
      Random rnd = new Random ();
      double change = rnd.nextDouble(); //[0,1)
        boolean plusOrMinus = rnd.nextBoolean(); //true, false
        if(plusOrMinus)
            currentPrice = perviousClosingPrice + change*perviousClosingPrice;
        else
            currentPrice = perviousClosingPrice - change*perviousClosingPrice;

      
    }
    public double getChangePercent () {
    return (currentPrice - perviousClosingPrice)/100;
  
       
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
