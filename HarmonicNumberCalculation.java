import java.util.Scanner;

public class HarmonicNumberCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        double total = 0;

        for(int i = 1; i <= number; i++){
            total += (1.0 / i);
        }


        System.out.println(total);

    }
}
