import java.util.Arrays;

public class ElementFrequencyArray {

    public static void main(String[] args) {
        int n = 0;
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        boolean[] checked = new boolean[list.length];

        for (int i = 0; i < list.length; i++) {
            if (!checked[i]) {
                for (int j = 0; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        n++;
                        checked[j] = true;

                    }
                }
                System.out.println(list[i] + " sayısı " + n + " kere tekrar edildi.");
                n = 0;



            }

        }
    }
}
