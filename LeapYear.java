import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, times, dividing;
        // 4' tam bölünecek
        // 100'ün katlarından 400'ün katları

        System.out.print("Yıl Sorgula: ");
        year = input.nextInt();

        dividing = year % 4;
        times = year % 400;


                if((dividing == 0 && year % 100 != 0) || (times == 0 ) ){
                    System.out.println( year + " " + "Artık yıldır");
                }else{
                    System.out.println("Artık Yıl Değildir");
                }

        }




    }

