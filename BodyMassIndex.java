import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        // Değişken tanımlamaları
        double kg, m, bodyMassIndex ;
        // Kullanıcı istek oluşturacak nesne yapısı
        Scanner input = new Scanner(System.in);

        // Kullanıcı Değer Girişi
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        m = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kg = input.nextDouble();

        // Vücut Kitle Endeksi Hesaplanması

        bodyMassIndex = kg / (m *m);

        // Ekrana yazdır
        System.out.println("Vücut Kitle Endeksiniz: " + bodyMassIndex);

    }
}
