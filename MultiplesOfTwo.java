import java.util.Scanner;
public class MultiplesOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, n, four, five;
        System.out.print("Sayı Giriniz: ");
        n = scan.nextInt();

        System.out.print("4'ün katlartı: ");
        for(i = 1; i < n;){
            four = i *= 4;
            if(i > n){
                break;
            }
            System.out.print(four + ", ");
        }
        System.out.println();

        System.out.print("5'ün katlartı: ");
        for(i = 1; i < n;){
            five = i *= 5;
            if(i > n){// bu if yapısı i n sayısından büyük olduğunda duracak ve aşağıdaki işlem devam edecek.
                break;
            }
            System.out.print(five + ", ");

        }
    }
}
