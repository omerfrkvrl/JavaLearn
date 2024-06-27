import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner ile kullanıcıdan değer alacağımız yapı kuruldu
        int mat, fiz, kim, tur, tar, mzk; // Tanımlamalar yapıldı

        System.out.print("Matematik Notunuzu Giriniz:");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz:");
        fiz = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz:");
        kim = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz:");
        tur = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz:");
        tar = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz:");
        mzk = input.nextInt();

        int toplam = (mat + fiz + kim + tur + tar + mzk);
        double sonuc = toplam/6;
        boolean deger = sonuc >= 50;
        String durum = deger ? "Geçtiniz" : "Kaldınız";
        System.out.println("ortalama: " + sonuc);
        System.out.println("Dönem başarı durumunuz: "+ durum);

    }
}
