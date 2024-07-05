import java.util.Scanner;

public class MaxMinProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz: ");
        int adet = scan.nextInt();
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;


        for (int i = 1; i <= adet; i++){
            System.out.print(i + ". Sayıyı giriniz: ");
            int n = scan.nextInt();
            System.out.println(n);

            if (n < max) {
                max = n;
            }

            if (n > min) {
                min = n;
            }

        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

    }
}
