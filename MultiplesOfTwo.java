import java.util.Scanner;
public class MultiplesOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, n, select;
        System.out.print("Sayı Giriniz: ");
        n = scan.nextInt();

        for(i = 1; i < n;){
            System.out.println(i + ", ");
            i *= 2;

        }
    }
}
