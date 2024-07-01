import java.util.Scanner;
public class LogIn {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName, password;


       // Kullanıcı girişleri
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = inp.nextLine();

        System.out.print("Şifre: ");
        password = inp.nextLine();
        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız.");
        }else{
            System.out.println("Gİrdiğiniz şifre veya kullanıcı adı yanlış !");

        }

    }
}
