import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int birthday, remainder;

        System.out.print("Doğum Yılıızı Giriniz: ");
        birthday = inp.nextInt();
        remainder = birthday%12;

        if(remainder == 0){
            System.out.println("Çin Zodyağı Burcunuz: MAYMUN");
        }else if(remainder == 1){
            System.out.println("Çin Zodyağı Burcunuz: HOROZ");
        }else if (remainder == 2){
            System.out.println("Çin Zodyağı Burcunuz: KÖPEK");
        }else if(remainder == 3 ){
            System.out.println("Çin Zodyağı Burcunuz: DOMUZ");
        }else if (remainder == 4) {
            System.out.println("Çin Zodyağı Burcunuz: FARE");
        }else if (remainder == 5){
            System.out.println("Çin Zodyağı Burcunuz: ÖKÜZ");
        }else if (remainder == 6){
            System.out.println("Çin Zodyağı Burcunuz: KAPLAN");
        }else if(remainder == 7){
            System.out.println("Çin Zodyağı Burcunuz: TAVŞAN");
        }else if (remainder == 8){
            System.out.println("Çin Zodyağı Burcunuz: EJDERHA");
        }else if(remainder == 9){
            System.out.println("Çin Zodyağı Burcunuz: YILAN");
        } else if (remainder == 10) {
            System.out.println("Çin Zodyağı Burcunuz: AT");
        }else if (remainder == 11){
            System.out.println("Çin Zodyağı Burcunuz: KOYUN");
        }


    }
}
