import java.util.Scanner;
public class CalculateFlightTicket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tripType, age, distance;
        double farePerDistance, normalAmount, ageDiscount,
                discountedAmount, R_T_Ticket_Discount,
                ageDiscountRate_10, ageDiscountRate_50, ageDiscountRate_30,
                doubleWayDiscount, totalAmount  ;

        System.out.print("Yolculuk Mesafenizi Giriniz: ");
        distance = input.nextInt();

        System.out.print("Yaşınızı Giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk Tipinizi Giriniz: ");
        tripType = input.nextInt();

        //Mesafe Başı Fİyat
        farePerDistance = 0.50;
        // yaş İndirimleri sabit değişken tanımlama
        ageDiscountRate_10 = 0.10;
        ageDiscountRate_30 = 0.30;
        ageDiscountRate_50 = 0.50;
        // gidiş-geliş bilet indirimi
        doubleWayDiscount = 0.80;

        normalAmount = distance * farePerDistance; // Normal fiyatı bulma (Mesafe * mesafe_başı_fiyat)



        switch (tripType){
            case 1:
                if(age <= 12){
                    ageDiscount = normalAmount * ageDiscountRate_50;
                    discountedAmount = normalAmount - ageDiscount; // İndirimli fiyat bulma ( Normal fiyat - yaş indirimi)
                    totalAmount = discountedAmount*2;
                    System.out.println("Çocuk tarifesi gerçekleşti Toplam Turtar: " + totalAmount );
                }else if((age > 12) && (age <= 24)){
                    ageDiscount = normalAmount * ageDiscountRate_10;
                    discountedAmount = normalAmount - ageDiscount; // İndirimli fiyat bulma ( Normal fiyat - yaş indirimi)
                    totalAmount = discountedAmount*2;
                    System.out.println("Genç tarifesi gerçekleşti Toplam Turtar: " + totalAmount );
                }else if((age > 24) && (age < 65)){
                    totalAmount = normalAmount * 2 ;
                    System.out.println("Tarife gerçekleşti Toplam Tutar: " + totalAmount);
                }else if( (age >= 65) && (age <= 100)){
                    ageDiscount = normalAmount * ageDiscountRate_30;
                    discountedAmount = normalAmount - ageDiscount; // İndirimli fiyat bulma ( Normal fiyat - yaş indirimi)
                    totalAmount = discountedAmount*2;
                    System.out.println("Büyük tarifesi gerçekleşti Toplam Turtar: " + totalAmount );
                }else{
                    System.out.println("Hatalı giriş");
                }
                break;

            case 2:
                if(age <= 12){
                    ageDiscount = normalAmount * ageDiscountRate_50;
                    discountedAmount = normalAmount - ageDiscount; // İndirimli fiyat bulma ( Normal fiyat - yaş indirimi)
                    R_T_Ticket_Discount = discountedAmount * doubleWayDiscount;
                    totalAmount = R_T_Ticket_Discount * 2;

                    System.out.println("Çocuk tarifesi gerçekleşti Toplam Turtar: " + totalAmount );
                }else if((age > 12) && (age <= 24)){
                    ageDiscount = normalAmount * ageDiscountRate_10;
                    discountedAmount = normalAmount - ageDiscount; // İndirimli fiyat bulma ( Normal fiyat - yaş indirimi)
                    R_T_Ticket_Discount = discountedAmount * doubleWayDiscount;
                    totalAmount = R_T_Ticket_Discount * 2;
                    System.out.println("Genç tarifesi gerçekleşti Toplam Turtar: " + totalAmount );
                }else if((age > 24) && (age < 65)){
                    R_T_Ticket_Discount = normalAmount * doubleWayDiscount;
                    totalAmount = R_T_Ticket_Discount * 2 ;
                    System.out.println("Tarife gerçekleşti Toplam Tutar: " + totalAmount);
                }else if( (age >= 65) && (age <= 100)){
                    ageDiscount = normalAmount * ageDiscountRate_30;
                    discountedAmount = normalAmount - ageDiscount; // İndirimli fiyat bulma ( Normal fiyat - yaş indirimi)
                    R_T_Ticket_Discount = discountedAmount * doubleWayDiscount;
                    totalAmount = R_T_Ticket_Discount * 2;
                    System.out.println("Büyük tarifesi gerçekleşti Toplam Turtar: " + totalAmount );
                }else{
                    System.out.println("Hatalı giriş");
                }

                break;
            default:
                System.out.println("Hatalı Yolculuk Türü girildi.");
                break;
        }










    }
}
