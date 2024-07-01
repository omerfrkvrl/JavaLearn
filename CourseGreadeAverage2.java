import java.util.Scanner; // KULLANICIDAN GİRİŞ ALMA KÜTÜPHANESİ

public class CourseGreadeAverage2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fiz, kim, tur, mzk;
        double average;

//NOT GİRİŞLERİ
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fiz = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kim = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        tur = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        mzk = input.nextInt();

//ORTALAMA HESAPLAMA
        average = (mat + fiz + kim + tur + mzk)/ 5 ;
        System.out.println("Ortalamanız: "+ average);
        if(average >= 55){

            System.out.println("Geçtiniz. Başarılarınızın devamınıdileriz.");
        }else {

            System.out.println("Kaldınız denemeye devam et.");
        }

    }
}
