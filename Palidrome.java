import java.io.FilterOutputStream;

public class Palidrome {
    static boolean isPalidrome(String str){
        int i = 0;
        int j = str.length() -1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                System.out.println(str + " Palidrom Değil");
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    static boolean isPalidrome2(String str){
        String reverse = "";
        for (int i = str.length() - 1; i >=0; i--){
            reverse += str.charAt(i);
        }

        return str.equals(reverse);
    }
    public static void main(String[] args) {
        System.out.println(isPalidrome2("ey edip adanada pide ye"));

    }
}
