import java.util.Scanner;

public class ArmstrongScoring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();
        int tempNumber = number ;
        int basNumber = 0;
        int basValue ;
        int result = 0;
        int basPow;

        while (tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;

        if(basNumber <= 3){
            for(int i = 1; i <= basNumber; i++ ){
                basValue = tempNumber % 10;
                basPow =1;
                for (int k = 1; k <= basNumber; k++ ){
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;
            }
            if(result == number){
                System.out.println("Sonuç: " + result);
                System.out.println(number + " Sayısı " + basNumber + " bir Armstrong sayıdır.");

            }else {
                System.out.println("Sonuç: " + result);
                System.out.println(number + " Sayısı " + basNumber + " bir Armstrong sayı değildir.");

            }

        } else {
            System.out.println(number + " Üç basamaktan büyüktür bu yüzden Armstrong olması sorgulanmaz.");

        }




        /*
        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();
        int basNumber = 0 ; // basamak sayısı
        int tempNumber = number; // girilen numaranın geçici taşındı değişken
        int basValue; // her basamağı bulma
        int result = 0; // üstleri alınmış basPow değikenlerinin toplamı
        int basPow; // her basamağın basamak sayısı kadar üstlerinin alınmış hali
        while (tempNumber != 0){
            tempNumber /= 10 ; // tempNumber = tempNumber / 10 ile aynı
            basNumber++;
        }

        tempNumber = number ; // tempNumber 0'a eşit olduğu için tekrar numbera aeşitlendi

        while (tempNumber != 0){
            basValue = tempNumber % 10 ;
            basPow = 1;
            for(int i = 1; i <= basNumber; i++){
                basPow *= basValue;
            }
            result += basPow;

            tempNumber/= 10;
        }

        if(result == number){
            System.out.println(number + " Sayı bir Armstrong bir sayıdır.");
        }else {
            System.out.println(number + " Sayı bir Armstrong bir sayı değildir.");

        }

         */
    }
}
