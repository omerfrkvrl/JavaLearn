import java.util.Scanner;
public class SortNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("1. Sayıyı giriniz: ");
        a = input.nextInt();

        System.out.println("2. Sayıyı giriniz: ");
        b = input.nextInt();

        System.out.println("3. Sayıyı giriniz: ");
        c = input.nextInt();

        // if else yapısı ile sıralama algoritması

        if((a > b) && (a > c)){
            if(b > c){
                System.out.println("Sıralamanız: "+ a +">"+ b +">"+ c);
            }else {
                System.out.println("Sıralamanız: "+ a +">"+ c +">"+ b);
            }
        }else if ((b > a) && (b > c)){
            if(a > c){
                System.out.println("Sıralamanız: " + b + ">" + a + ">" + c);
            }else {
                System.out.println("Sıralamanız: " + b + ">" + c + ">" + a );
            }

        }else if((c > a) && (c > b)){
            if(a > b){
                System.out.println("Sıralamanız: "+c+">"+a+">"+b);
            }else{
                System.out.println("Sıralamanız: "+c+">"+b+">"+a);
            }
        }
    }
}
