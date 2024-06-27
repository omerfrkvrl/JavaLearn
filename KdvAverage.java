import java.util.Scanner;

public class KdvAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // kullanıcı giriş sistemi kuruldu
       double kdvli, kdvsiz, kdvsi ;
        System.out.print("Fiyat Giriniz: "); // fiyat girdisi alınacak
        int fiyat = input.nextInt();

        kdvli = (fiyat + fiyat * 0.18);
        kdvsiz = fiyat ;
        kdvsi = kdvli - kdvsiz ;

        System.out.println("KDV Dahil fiyat tutarınız: " + kdvli);
        System.out.println("Normal Fiyat: " + kdvsiz);
        System.out.println("KDV Tutarınız: " + kdvsi);


    }




}
