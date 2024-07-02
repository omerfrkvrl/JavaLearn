import java.util.Scanner;

public class CalculateAreaPerimeter {
    public static void main(String[] args) {
        // Kullanıcı giriş yapısı
        Scanner input = new Scanner(System.in);

        // Değişken tanımlamaları
        double pi, area, perimeter, circleSlice, alpha ;
        int r ;

        //Sabit değişken ataması
        pi = 3.14;

        //Kullanıcıdan veri alma
        System.out.print("Yarı Çap giriniz: ");
        r = input.nextInt();

        System.out.print("Daire Diliminin Açısı: ");
        alpha = input.nextDouble();

        // Değer tanımlama
        area = pi * r * r ;
        perimeter = 2 * pi * r ;
        circleSlice = (pi * (r * r) * alpha ) / 360 ;

        System.out.println("Çemberin Alanı: " + area);
        System.out.println("Çemberin Çevresi: " + perimeter);
        System.out.println("Çember Diliminin Alanı: " + circleSlice);


    }
}
