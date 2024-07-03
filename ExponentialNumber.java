import java.util.Scanner;
public class ExponentialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, k, total = 1 ;

        System.out.print("Sayı: ");
        n = scan.nextInt();

        System.out.print("Üstü: ");
        k = scan.nextInt();

        for(int i = 1; i <= k; i++){
            total *= n;
        }
        System.out.println("İfadenin Sonucu: " + total);


    }
}
