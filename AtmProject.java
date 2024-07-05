import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 0;
        int price;
        int select;
        while(right > 0){
            System.out.print("Kullanıcı Adı: ");
            userName = input.nextLine();
            System.out.print("Parola: ");
            password = input.nextLine();

            if((userName.equals("omerfrk")) && (password.equals("dev123"))){

                System.out.println("Merhaba, LORAV bankasına hoşgeldiniz!");

                do {
                    System.out.println("1- Para Yatırma \n 2- Para Çekme \n 3- Bakiye Sorgulama \n 4- Çıkış Yap");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz:");
                    select = input.nextInt();

                    switch (select){

                        case 1:
                            System.out.print("Para Miktarı: ");
                            price = input.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.print("Para Miktarı:");
                            price = input.nextInt();
                            balance -= price;
                            break;

                        case 3:
                            System.out.println("Güncel Bakiye: " + balance + "TL");
                            break;

                        case 4:
                            System.out.println("Görüşmek Üzere Tekrar Bekleriz.");
                            break;
                        default:
                            System.out.println("Yanlış numara tuşladınız Lütfen tekrar deneyiniz.");
                            break;
                    }
                }while (select < 4);
                break;
            }else {
                right--;

                if(right == 0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else{
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    System.out.println("Kalan hakkınız: " + right);

                }
            }
        }

    }
}
