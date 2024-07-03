import java.util.Scanner;

public class CollectOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, total = 0;

        do {

            System.out.println("Sayı Giriniz: ");
            n = scan.nextInt();

            if(n % 2 == 1){
                total += n;
            }

        }while( n > 0);

        System.out.println("Toplam: " + total);


    }
}
