import java.util.Scanner;

public class FindingHoroscope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day ;

        System.out.print("Doğduğunuz ayı yazınız: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz Günü yazınız: ");
        day = input.nextInt();

        if(month == 1 ){
            if ((day > 0) && (day <= 21)){
                System.out.println("Burcunuz: Oğlak");
            }else if((day >= 22)&& (day<=31)){
                System.out.println("Burcunuz: Kova");
            }
        }else if(month == 2){
            if((day>0) && (day <=19)){
                System.out.println("Burcunuz: Kova");
            }else if((day >= 20) && (day<=29)){
                System.out.println("Burcunuz: Balık");
            }
        }else if(month == 3){
            if((day>0) && (day <= 20)){
                System.out.println("Burcunuz: Balık");
            }else if((day >= 21) && (day<=31)){
                System.out.println("Burcunuz: Koç");
            }
        }else if(month == 4){
            if((day>0) && (day <= 20)){
                System.out.println("Burcunuz: Koç");
            }else if((day >= 21) && (day<=30)){
                System.out.println("Burcunuz: Boğa");
            }
        }else if(month == 5){
            if((day>0) && (day <= 21)){
                System.out.println("Burcunuz: Boğa");
            }else if((day >= 22) && (day<=31)){
                System.out.println("Burcunuz: İkizler");
            }
        }else if(month == 6){
            if((day>0) && (day <= 22)){
                System.out.println("Burcunuz: İkizler");
            }else if((day >= 23) && (day<=30)){
                System.out.println("Burcunuz: Yengeç");
            }
        }else if(month == 7){
            if((day>0) && (day <= 22)){
                System.out.println("Burcunuz: Yengeç");
            }else if((day >= 23) && (day<=30)){
                System.out.println("Burcunuz: Aslan");
            }
        }else if(month == 8){
            if((day>0) && (day <= 22)){
                System.out.println("Burcunuz: Aslan");
            }else if((day >= 23) && (day<=31)){
                System.out.println("Burcunuz: Başak");
            }
        }else if(month == 9){
            if((day>0) && (day <= 22)){
                System.out.println("Burcunuz: Başak");
            }else if((day >= 23) && (day<=30)){
                System.out.println("Burcunuz: Terazi");
            }
        }else if(month == 10){
            if((day>0) && (day <= 22)){
                System.out.println("Burcunuz: Terazi ");
            }else if((day >= 23) && (day<=31)){
                System.out.println("Burcunuz: Akrep ");
            }
        }else if(month == 11){
            if((day>0) && (day <= 21)){
                System.out.println("Burcunuz: Akrep");
            }else if((day >= 22) && (day<=30)){
                System.out.println("Burcunuz: Yay");
            }
        }else if(month == 12){
            if((day>0) && (day <= 21)){
                System.out.println("Burcunuz: Yay");
            }else if((day >= 22) && (day<=31)){
                System.out.println("Burcunuz: Oğlak");
            }
        }

    }
}
