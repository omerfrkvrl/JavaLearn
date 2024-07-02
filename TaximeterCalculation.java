import java.util.Scanner;
public class TaximeterCalculation {
    public static void main(String[] args) {
        // Değişken tanımları
        int km, minTutar, startPrice ;
        double  kmB, tutar ;

        // Sabit değer atamaları
        kmB = 18 ;
        minTutar = 90;
        startPrice = 25;

        // Kullanıcı giriş yası
        Scanner input = new Scanner(System.in);

      // Kilometre girişini alınır
        System.out.print("Gidilen Kilometre: ");
        km = input.nextInt();

        tutar = startPrice + (km * kmB); // Tutar hesaplaması.
        tutar = (tutar < 90) ? 90 : tutar; // tutar minimum  değeri belirleme

        //Sonuç Taxi Meter Tutarı
        System.out.println("Taximetre Tutarı: " + tutar);


    }
}
