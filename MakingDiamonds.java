import java.util.Scanner;

public class MakingDiamonds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Sayı giriniz: ");
        n = scan.nextInt();


        for (int i = (n - 2); i <= n ; i++) {
            for (int j = 0; j < 2*(n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
//-------------------------------------------
        for (int i = n; i >= 0 ; i--){
            for (int j = 0; j < 2*(n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i +1) ; k++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }



    }
}
