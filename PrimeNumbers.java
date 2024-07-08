import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = scanner.nextInt();

        System.out.print("Çıktı: ");

        if (n >= 2) {
            System.out.print(2); // İlk asal sayı 2'dir
        }

        for (int i = 3; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print("," + i);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
