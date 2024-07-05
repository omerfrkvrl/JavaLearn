import java.util.Scanner;

public class PrimeNumberBetween {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = scan.nextInt();
        int k;
        int process;
        boolean isPrime = true;

        for ( k =2; k < n; k++){
            process = n % k;

            if (process == 0){
                isPrime = false;
                continue;
            }

        }
        if(isPrime){
            System.out.println(n + " Sayısı Asal sayıdır.");
        }else {
            System.out.println(n + " Asal sayı değildir.");
        }
    }
}
