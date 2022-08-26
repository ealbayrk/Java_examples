import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) {
 
        // Tanımlı olarak verilen sayı dizisi
        int[] sayiDizisi = {1, 5, 2, 8, 3};
 
        // Dizinin kaç değerden oluştuğunu bul
        int dizininUzunlugu = sayiDizisi.length;
 
        // Ortanca sayıyı (medyan) bulmada öncelikle sıralama işlemi gerekli
        Arrays.sort(sayiDizisi);
 
        /* I. Durum
             Sayı adedi tek ise medyan (n+1/2) formülüyle bulunur
             Örn. 1,2,3 dizisi 3 adet sayıdan oluşur. (3+1)/2 sonucunda 2. sıradaki sayı [2] medyandır.
            */
        if ((dizininUzunlugu % 2 == 1)) {
            int tekliSira = (dizininUzunlugu + 1) / 2;
            System.out.println(sayiDizisi[tekliSira - 1]);
        }
        /* II. Durum
             Sayı adedi çift ise medyan ((n/2) + (n/2+1)) hesabında çıkan sonuç 2'ye bölünür
             Örn. 1,2,3,4 dizisi 4 adet sayıdan oluşur. (4/2) sonucunda 2 elde edilir.
             Ardından 2. ve 3. sayılar toplanıp 2'ye bölünür ((2+3)/2) ve [2.5] sayısı medyandır
            */
        else {
            double ikiliSira = dizininUzunlugu / 2.0;
            double ortaSayi = (sayiDizisi[(int) ikiliSira - 1] + sayiDizisi[(int) ikiliSira]) / 2.0;
            System.out.println(ortaSayi);
        }
    }
}
   