import java.util.Arrays;

public class RepeatingDoubleNumberArray {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {17,42,91, 59, 36, 82, 93, 6, 24, 10, 36, 42, 73, 8, 45, 97,73, 52, 67, 38, 91, 28, 4,6, 5};
       int[] duplicate = new int[list.length];
       int strIndex = 0;

       for (int i =0; i < list.length; i++){

            for (int j = 0; j < list.length; j++ ){

                if ((i != j) && (list[i] == list[j]) && (list[i]%2 ==0)){
                    if (!isFind(duplicate,list[i])){
                        duplicate[strIndex++] = list[i];
                        break;
                    }

                }
            }
        }

        for (int value: duplicate){
            if(value != 0){
                System.out.print(value + ", ");
            }
        }
    }
}
