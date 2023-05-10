import java.util.*;

public class MaxZnachenie {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 1, 6, 8, 6, 9};
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        int[] leftArray = Arrays.copyOfRange(arr, 0, maxIndex);
        int[] rightArray = Arrays.copyOfRange(arr, maxIndex + 1, arr.length);

        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Максимальное значение: " + arr[maxIndex]);
        System.out.println("Слева от максимального: " + Arrays.toString(leftArray));
        System.out.println("Справа от максимального: " + Arrays.toString(rightArray));
    }
}
