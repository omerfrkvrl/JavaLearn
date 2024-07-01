import java.util.Scanner;
public class FourProcessApplication {
    public static void main(String[] args) {
        int n1, n2, select ;
        // kullanıcı girişi için nesne tanımlama
        Scanner input = new Scanner(System.in);
        // kullanıcı girişlerini alınız.
        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();

        System.out.println("1- Toplama\n2- Çıkartma\n3- Çarpma\n4- Bölme");
        System.out.print("İşlem seçiniz: ");
        select = input.nextInt();

        // Hesaplama işlemlerinin Tasarımı
        switch(select){
            case 1:
                System.out.println("Toplama sonucu : "+ (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkartma sonucu : "+ (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma sonucu : "+ (n1 * n2));
                break;
            case 4:
                System.out.println("Bölme sonucu : "+ (n1 / n2));
                break;
            default:
                System.out.println("Hatalı İşlem girişi. Lütfen tekrar deneyiniz.");
                break;

        }


    }
}
