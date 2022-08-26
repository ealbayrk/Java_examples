
public class PrimateDataTypesVSobhectiveDataTypes {
    public static void main (String[]args) {
        int i = 1 ;
        int j = 2 ;
        System.out.println("after i:"+ i + " after  j:" + j);
        i=j;
        System.out.println("before i:"+ i + " before j:" + j);
        
     TV myTV  = new TV () ;
     TV yourTV  = new TV () ;
        System.out.println("after :" + myTV );
        System.out.println("after :" + yourTV );
        System.out.println("after :" + myTV.channel );
        System.out.println("after :" + yourTV.channel );
     myTV=yourTV ;
        System.out.println("BEFORE :" + myTV );
        System.out.println("BEFORE :" + yourTV );
        System.out.println("BEFORE :" + myTV.channel );
        System.out.println("BEFORE :" + yourTV.channel );
    }
    }

//Buradan göreceğim üzere ilkel veri tipinde birbirine eşitlediğimde ( kopyalama işlemi yapınca ) değişiklikler orjianle yansımaz .
//Fakat referans türü değişkenlerde yapılan değişikler orjinal değişkeni de etkiler .

    

