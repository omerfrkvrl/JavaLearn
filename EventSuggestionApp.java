import java.util.Scanner;
public class EventSuggestionApp {
    public static void main(String[] args) {
        double heat;
        Scanner inp = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        heat = inp.nextDouble();

        if(heat <= 5){
            System.out.println("Kayak yapmaya gidebilir siniz.");
        }else if(heat <= 25){
            if(heat <= 15){
                System.out.println("Sinemaya gidebilir siniz.");
            }
            if(heat >= 10){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }else{
            System.out.println("Hava çok sıcak yüzmeye gidebilirsin.");
        }
    }
}
