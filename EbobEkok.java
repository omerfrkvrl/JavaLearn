import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N1 Sayısını giriniz: ");
        int n1 = input.nextInt();
        int ebob = 1;

        System.out.print("N2 Sayısını giriniz: ");
        int n2 = input.nextInt();

        if ( n1 > n2){
            for(int i = n2; i >= 1; i--){
                if((n1%i==0) && (n2%i==0)){
                    ebob = i;
                    System.out.println(n1 + ", " + n2 + " Ebobu:" + ebob);
                    break;
                }
            }
        }else{
            for(int i = n1; i >= 1; i--){
                if((n1%i==0) && (n2%i==0)){
                    ebob = i;
                    System.out.println(n2 + ", " + n1 + " Ebobu:" + ebob);
                    break;
                }
            }
        }

        int ekok ;
        ekok = (n1*n2)/ebob;
        System.out.println("Ekok: " + ekok);


    }
}
