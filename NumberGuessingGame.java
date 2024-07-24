import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100); // Rastgele sayı oluşturan değişken

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Sayı Tahminini Gir: ");
            selected = input.nextInt();
            if (selected <0 || selected >99 ){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if(isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                }else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");

                }
                continue;
            }
            if(selected == number){
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğiniz sayı : "+ number);
                isWin = true;
                break;
            }else {
                System.out.println("Hatalı giriş yaptınız. !!");
                if (selected > number){
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür.");
                }else {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür.");

                }
            }
            wrong[right++] = selected;
            System.out.println("Kalan Hak: " + (5 - right));

        }
        if (!isWin){
            System.out.println("=========================");
            System.out.println("Kaybettiniz !");
            if (!isWrong){
                System.out.println("Gizli Sayı: " + number);
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }

    }
}