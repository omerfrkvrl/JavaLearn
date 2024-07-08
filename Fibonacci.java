import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Eleman sayısı: ");
        int n = scan.nextInt();
        int s1 = 0;
        int s2 = 1;
        int toplam;

        System.out.print(n + " Sayısının Fibonacci serisi: ");

        for(int i = 1 ; i <= n; i++){
            System.out.print(s1 + ", ");
            toplam = s1 + s2;
            s1 = s2 ;
            s2 = toplam ;
        }
    }
}
