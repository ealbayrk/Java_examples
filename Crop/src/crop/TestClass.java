  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crop;

/**
 *
 * @author Excalibur
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class TestClass {
    public static void main(String[] args) throws IOException {
        ArrayList<Crop> crops = new ArrayList<>();
        ArrayList<Store> stores = new ArrayList<>();
        ArrayList<Supplier> suppliers = new ArrayList<>();
        
        
        //dosya oluşturuyoruz .
        //3 farklı dosya için 3 tane fileReader 
        //3 farklı reader için 3 arklı bufferedReader kullanıyoruz 
        //fileReader veBufferReader kullanmamızın sebebi txt dosyaların çok daha efektif biçimde okunduğunu düşünüyorum .

        FileReader cropFile = new FileReader("Crops.txt"); 
        FileReader storeFile = new FileReader("Stores.txt");
        FileReader supplierFile = new FileReader("Suppliers.txt");
        //dosyalarımızı direk okuyamıyoruz .Filereader dosyayı okumak yerine bir karakter okuyup geri geliyor .
        //Bu yüzden performans kaybı oluyor  biz bunu engellemek için bufferreader kullandık. 
        //BufferReader endi içinde bir küme oluşturup oraya atıyor . 
        //Bunu aynı şekilde Scanner ile yazabilirdik .
        /*Scanner scanner = new Scanner(new BufferedReader(new FileReader("crops.txt")))) {
            
            while (scanner.hasNextLine()) {
                
                String cropBr = scanner.nextLine();
                
                String[] array = cropBr.split(",");
                
                if (array[1].equals("fruit")) {
                   
                    
                }
*/

        BufferedReader cropBr = new BufferedReader(cropFile);
        BufferedReader storeBr = new BufferedReader(storeFile);
        BufferedReader supplierBr = new BufferedReader(supplierFile);

        String entry = storeBr.readLine();
        while(entry != null){
            String [] token = entry.split(", "); // dizeyi bölmek için yapıyoruz .

            Store s = new Store(token[0], Integer.parseInt(token[1]), Double.parseDouble(token[2]), Double.parseDouble(token[3]));
            stores.add(s);
            //parseInt ondalıklı olarak verdiğiniz değerin ondalık kısmını siler ve tam sayı ortaya çıkarır . Arraydeki string 
            //şeklindeyken int şeklinde alıyoruz çünkü store metodunda consturctor (String name, int ID, double maxCapacityArea, double usedCapacityArea)
            //parseDouble  arraydeki stringi doubble şeklinde alıyoruz .

            entry = storeBr.readLine(); //yeni satırı okuyoruz .
        }

        entry = supplierBr.readLine(); // yeni satırı okuyoruz .
        while(entry != null){
            String [] token = entry.split(", "); //dizeyi bölmek için kullanıyoruz virgüle göre ayırıyoruz ve bunları string arraya yazıyoruz.
            
            Supplier s = new Supplier(token[0], Integer.parseInt(token[1]), Integer.parseInt(token[2]));
            suppliers.add(s);
            
            entry = supplierBr.readLine();//satırımızı tekrar okuyoruz .
        }

        entry = cropBr.readLine();
        while(entry != null){
            String [] token = entry.split(", ");
            Crop c;
            int ID;                
            
            if(token[1].equals("fruit")){ //eğer okuan veri meyve ise oluşturuyoruz . eğer arrayimizin 1. indexi fruit ise..
                c = new Fruit(token[0], Double.parseDouble(token[2]), token[3], token[4], Double.parseDouble(token[5]));
                ID = Integer.parseInt(token[6]);
                if(ID/1000 == 5){//burada ıd ye bakıyoruz çünkü ıd ye göre dorğu yere ekliyoruz .
                    //suppliera mı yoksa store mı ekleyeceğmize karar veriyor .
                    for(Store s: stores)
                        if(s.ID == ID) { 
                            try { // try catch yaptık çünkü import ederken eğer o meyve yoksa hata alıyoruz .
                                s.importCrop((Fruit) c);
                            } catch (CapacityNotEnoughException e) {
                                e.printStackTrace();
                            }
                        }
                }else if(ID/1000 == 1)
                    for(Supplier s: suppliers)
                        if(s.ID == ID)
                            s.cropList.add(c);            
            }else{
                c = new Vegetable(token[0], Double.parseDouble(token[2]), "unknown", token[3]);
                ID = Integer.parseInt(token[4]);
                if(ID/1000 == 1)
                    for(Supplier s: suppliers)
                        if(s.ID == ID) 
                            s.cropList.add(c);
            }
            crops.add(c);
            
            entry = cropBr.readLine();
        }
        
        
        Scanner scn = new Scanner(System.in);
         
        String menu = "0.Quit\n" + 
                        "1.Display all suppliers and their crop list\n"+
                        "2.Display all stores and their fruit list\n" +
                        "3.Buy a fruit crop for a Supplier and add it\n"+
                        "4.Sell a fruit crop of a Supplier and remove it\n"+
                        "5.Remove a fruit from a store\n"+
                        "6.Remove a crop from a supplier\n"+
                        "7.Add crop\n"+
                        "8.Show remaining budget\n"+
                        "9.Show remaining capacity.\n";
                
        while(true){ 
            System.out.println("---------------------------------------------");
            System.out.println(menu);
            System.out.println("---------------------------------------------");
            System.out.println("Please choose (0-9)...");
            String choice = scn.nextLine();
            
            
            if(choice.equals("0")) {
                System.out.println("Quit...");
                break; // 0 yaparsak  uygulamadan çıkış yapılıyor .
            }else if(choice.equals("1")){
                for(Supplier s: suppliers){
                    s.showCrops(); ///show crop metodumuz ile .
                    System.out.println();
                    //tüm mağzaların listesini gösteriyoruz .
                }
            }else if (choice.equals("2")) {
                for(Store s: stores){
                    s.showCrops();
                    s.howToStore();
                    System.out.println();
                    //"Tüm mağazaları ve meyve listesini göster nasıl depolandıklarını gösteriyoruz .
                }
            }else if(choice.equals("3")){
                //Bir Tedarikçi için meyve mahsulü satın alıyoruz  ve ekliyoruz
                System.out.print("Enter fruit name: ");
                String fruitName = scn.nextLine();
                System.out.print("Enter store name: ");
                String storeName = scn.nextLine();
                System.out.print("Enter a supplier name");
                String suppName = scn.nextLine();
                
                Fruit f = null;
                for(Store s: stores){ 
                    boolean find = false; //listede var mı yok mu diye kontrol ediyoruz yoksa listeye ekliyoruz .
                    if(s.getName().equals(storeName))
                    for(int i = 0;i<s.fruitList.size();i++){
                        if(s.fruitList.get(i).name.equals(fruitName)){
                            f = s.fruitList.get(i);
                            try {
                                s.exportCrop(f);
                            } catch (FruitNotFoundException e) {
                                e.printStackTrace();
                            }
                            find = true;
                            break;
                        }
                    }
                    if(find)
                        break;
                }

                for(Supplier s:suppliers){ //aynı şekilde denetliyoruz ve satın alma işlemini yapıyoruz . try catch yaptık çünkü 
                    //eğer yeterli para ve fruit not avalable hatası olabileceği için .
                    if(s.getName().equals(suppName))
                    try{
                        s.buyCrop(f);
                    }catch (SupplierHasNotEnougMoneyException | FruitNotAvailableException e) {
                        System.out.println(e.getMessage());

                    }
                }
            }else if(choice.equals("4")){
                //Bir Tedarikçinin meyve mahsulünü satar ve onu kaldırır
                System.out.print("Enter fruit name: ");
                String fruitName = scn.nextLine();
                System.out.print("Enter store name: ");
                String storeName = scn.nextLine();
                System.out.print("Enter a supplier name");
                String suppName = scn.nextLine();

                Fruit f = null;
                for(Supplier s:suppliers){
                    boolean find = false; //eğer bulamazsak supplierın içinde
                    if(s.getName().equals(suppName))
                        for(int i = 0;i<s.cropList.size();i++){ //listeyi kontrol ediyor ve listeden çıkarıyoruz .
                            if(s.cropList.get(i).name.equals(fruitName)){
                                f = (Fruit) s.cropList.get(i);
                                try{
                                    s.sellCrop(f); //satmak için meyve listede bulunamayınca bu hatayı veriyor .
                                }catch (FruitNotFoundException e) {
                                    System.out.println(e.getMessage());

                                }
                                find = true;//suppliearın içinde arama yaparken eğer bulursak true 
                                break;
                            }
                        }
                    if(find)//eğer bulduysak diyip döngüyü bitiryoruz ...
                        break;
                }
                
                for(Store s: stores){
                    if(s.getName().equals(storeName)) {
                        try {
                            s.importCrop(f); //Yeterli yer olmayınca storeda bu hatayı alacağız .
                        } catch (CapacityNotEnoughException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } else if (choice.equals("5")){//Mağazadan bir meyve kaldırıyoruz
                System.out.print("Enter the name of fruit you want to remove: ");
                String fruitName = scn.nextLine();
                System.out.print("Enter the name of store: ");
                String storeName = scn.nextLine();
                for(int i = 0;i<stores.size();i++){ //mağzamızı denetlyoruz 
                    if(stores.get(i).getName().equals(storeName)){ //kaldırmak istediğimiz meyveyi belirliyoruz , buluyoruz .
                        for(int j = 0;j<stores.get(i).fruitList.size();j++){ //hem mağzadan hem de fruiylisten akldırıyoruz .
                            if(stores.get(i).fruitList.get(j).name.equals(fruitName)) {
                                stores.get(i).fruitList.remove(j);
                                break;
                            }
                        }
                    }
                }
            }else if (choice.equals("6")){ //Tedarikçiden bir ürünü kaldır
                System.out.print("Enter the name of crop you want to remove: ");
                String cropName = scn.nextLine();
                System.out.print("Enter the name of supplier: ");
                String supplierName = scn.nextLine();
                for(int i = 0;i<suppliers.size();i++){
                    if(suppliers.get(i).getName().equals(supplierName)){
                        for(int j = 0;j<suppliers.get(i).cropList.size();j++){
                            if(suppliers.get(i).cropList.get(j).name.equals(cropName)) {
                                suppliers.get(i).cropList.remove(j);
                                break;
                            }
                        }
                    }
                }
            }else if (choice.equals("7")){ //crop ekle
                System.out.print("Which one do you want to create [(f)ruit/(v)egetable]:");
                char type = scn.nextLine().charAt(0); //anlamadım??
                Crop c = null;
                if(type == 'f'){ //ne oluşturduğumuzu belirlemek için.
                    System.out.print("Enter fruit name: ");
                    String fruitName = scn.nextLine();
                    System.out.print("Enter weight: ");
                    double weight = scn.nextDouble(); scn.nextLine();
                    System.out.print("Enter season: ");
                    String season = scn.nextLine();
                    System.out.print("Enter taste: ");
                    String taste = scn.nextLine();
                    System.out.print("Enter price: ");
                    double price = scn.nextDouble(); scn.nextLine();
                    c = new Fruit(fruitName, weight, season, taste, price);
                }else if(type == 'v'){
                    System.out.print("Enter veg name: ");
                    String vegName = scn.nextLine();
                    System.out.print("Enter weight: ");
                    double weight = scn.nextDouble(); scn.nextLine();
                    System.out.print("Enter season: ");
                    String cultivatedSeason = scn.nextLine();
                    System.out.print("Enter region: ");
                    String cultivatedRegion = scn.nextLine();
                    c = new Vegetable(vegName, weight, cultivatedSeason, cultivatedRegion);
                }
                if(c == null){
                    System.out.println("Crop couldn't be generated!");
                    continue; //crop oluşturulamaığı zaman oluyor .
                }
                
                System.out.print("Enter where do you want to add (store/supplier)");
                String input = scn.nextLine();
                if(input.equals("store")){  //girilen store ise ...
                    System.out.print("Enter the store name: ");
                    String name = scn.nextLine();
                    for(Store s: stores){
                        if(s.getName().equals(name)) {
                            try {
                                s.importCrop((Fruit) c); //meyvenin tamamını mağzaya ekler.
                            } catch (CapacityNotEnoughException e) { //yeterince kapasite olmadığı için exception verebilir .
                                e.printStackTrace();
                            }
                        }
                    }
                }else if(input.equals("supplier")){
                    System.out.print("Enter the supplier name: ");
                    String name = scn.nextLine();
                    for(Supplier s: suppliers){
                        if(s.getName().equals(name)){
                            s.cropList.add(c); //
                        }
                    }
                }
            }
            else if (choice.equals("8")){ //Kalan bütçeyi göster
                System.out.println("Enter supplier name: ");
                String supplierName = scn.nextLine();
                for(Supplier s: suppliers){
                    if(s.getName().equals(supplierName)){
                        System.out.println("Remaining budget is: " + s.getBudget());
                    }
                }
            } else if (choice.equals("9")){//Kalan kapasiteyi göster
                System.out.println("Enter store name: ");
                String storeName = scn.nextLine();
                for(Store s: stores){
                    if(s.getName().equals(storeName)){
                        System.out.println("Remaining capacity is: " + s.availabeCapacity());
                    }
                }
            } else {
                System.out.println("Invalid action ... Select the action you want to perform in the menu.(0-9)");
            }
        }
    }
}