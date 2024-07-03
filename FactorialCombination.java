import java.util.Scanner;

public class FactorialCombination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r, x = 1, y = 1, z =1, total ;

        System.out.print("N Faktoriyel sayı: ");
        n = scan.nextInt();

        System.out.print("R Faktoriyel sayı: ");
        r = scan.nextInt();


        for(int i = 1; i <= n; i++){
            x *= i;
        }

        for(int i = 1; i <= r; i++){
            y *= i;
        }
        for(int i = 1; i <= (n -r); i++){
            z *= i;
        }

        total = x / (y*z);
        System.out.println(n + ". N Faktöriyel: " + x + "\n" + r + "'ci R Faktöriyel: " + y  );

        System.out.println("Kombinasyon Sonucunuz: " + total);

    }
}
