import java.util.Arrays;
public class HarmonicMeanArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        double sum = 0.0;
        double avarage = 0.0;

        for (int i = 0; i < num.length; i++){
            sum += (1/num[i]);
        }
        avarage = num.length / sum;
        System.out.println(sum);
        System.out.println("Harmonik Ortalama: " + avarage);

    }
}
