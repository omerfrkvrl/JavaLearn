import java.util.Scanner;

public class FindingTheHypotenuse {
    public static void main(String[] args) {
        double a, b, c, u, cevre, alan;
      Scanner inp = new Scanner(System.in);
       /*
       // Dik Üçgende Alan hesabı
        System.out.print("Karşı Keranı giriniz: ");
          a = inp.nextDouble();

        System.out.print("Komşu Keranı giriniz: ");
        b = inp.nextDouble();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: " + c);
        */


        //üçgenin tümkenarlarını kullanıcan aldık
        System.out.print("Birinci Kenarı giriniz: ");
        a = inp.nextDouble();

        System.out.print(" İkinci Kenarı giriniz: ");
        b = inp.nextDouble();

        System.out.print(" Üçüncü Kenarı giriniz: ");
        c = inp.nextDouble();

        // Üçgenin çevresini ve alanının formülünü hesaplayacak aşağıdaki kod.

        u = (a + b + c)/2; // Üçgen Çevresinin yarısını hesapla
        cevre = 2*u;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c)); // Math.sqrt() -> Math sınıfına aittir ve karekök almaya yarar.

        // Sonuç Çıktıları Alındı
        System.out.println("Üçgenin Çevresi: " + cevre);
        System.out.println("Üçgenin Alanı: "+ alan);









    }
}
