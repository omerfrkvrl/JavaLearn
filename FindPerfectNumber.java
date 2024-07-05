import java.util.Scanner;

public class FindPerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int n = scan.nextInt();
        int total = 0;

        for (int i = 1; i < n ; i++){
            if (n%i == 0){
                System.out.println("Tam bölen sayı: " + i);
                total += i;

            }
        }
        if (total == n){

            System.out.println(n + " Sayısı Mükemmel sayıdır.");
        }else{
            System.out.println(n + " Sayısı Mükemmel sayı değildir.");
        }
    }

}
