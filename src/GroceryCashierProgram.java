import java.util.Scanner;
public class GroceryCashierProgram {
    public static void main(String[] args) {
        // Kullanıcı istek oluşturacak nesne yapısı
        Scanner input = new Scanner(System.in);

       // Değişken Tanımlamaları
        double pear, apple, banana, tomato, eggplant, tutar;
        int p, a, b, t, e ;

        // Sabit Değişken değerleri
        pear = 2.14;
        apple = 3.67;
        banana = 0.95;
        tomato = 1.11;
        eggplant = 5;

        // Kullanıcı girişi
        System.out.print("Armut Kaç Kilo ? : ");
        p = input.nextInt();

        System.out.print("Elma Kaç Kilo ? : ");
        a = input.nextInt();

        System.out.print("Domates Kaç Kilo ? : ");
        t = input.nextInt();

        System.out.print("Muz Kaç Kilo ? : ");
        b = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        e = input.nextInt();

        // Toplam Tutar Hesaplama
        tutar = (pear * p) + (apple * a) + ( tomato * t ) + (banana * b) + (eggplant * e);
        System.out.println("Toplam Tutar: " + tutar);



    }
}
