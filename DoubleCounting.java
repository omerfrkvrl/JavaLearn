import java.util.Scanner;

public class DoubleCounting {
    public static void main(String[] args) {
        int k, i ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        k = inp.nextInt();

        for(i = 0; i <= k; i +=2){
            System.out.println(i + ", ");
        }

    }
}
