
import java.util.Scanner;

public class ExponentialNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz: ");
        int a = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int b = input.nextInt();

        System.out.println("Sonuç: " + exponential(a,b));

    }
    public static int exponential(int base, int exp){
        int result = 1;

        for (int i = 1; i <= exp ; i++){
            result *= base;
        }
        return result;
    }
}
