import java.util.Scanner;

public class MethodPattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı: ");
        int n = inp.nextInt();
        inp.close();
        pattern(n, n, false);
    }

    public static void pattern(int n, int original, boolean increase) {
        // Sayıyı ekrana yazdır
        System.out.print(n + ", ");

        // Eğer sayı orijinal değere ulaştıysa dur
        if (n == original && increase) {
            return;
        }

        // Eğer sayı negatif veya sıfırsa artırma moduna geç
        if (n <= 0) {
            increase = true;
        }

        // Eğer artırma modundaysak 5 ekle
        if (increase) {
            pattern(n + 5, original, increase);
        } else { // Değilse 5 çıkar
            pattern(n - 5, original, increase);
        }
    }
}
