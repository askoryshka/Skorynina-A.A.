import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] l = {50, 55, 57, 58, 60};
        int maxDist = 175;
        int numCities = 3;

        ArrayList<int[]> combinations = Combinations(l, numCities);
        int maxSumma = -1;
        for (int[] combo : combinations) {
            int sum = Arrays.stream(combo).sum();
            if (sum <= maxDist && sum > maxSumma) {
                maxSumma = sum;
            }
        }
        System.out.println(maxSumma);
    }

    private static ArrayList<int[]> Combinations(int[] arr, int n) {
        ArrayList<int[]> res = new ArrayList<>();
        int[] combo = new int[n];
        Helper(res, arr, combo, 0, 0);
        return res;
    }

    private static void Helper(ArrayList<int[]> res, int[] arr, int[] combo, int index, int start) {
        if (index == combo.length) {
            res.add(Arrays.copyOf(combo, combo.length));
        } else {
            for (int i = start; i < arr.length; i++) {
                combo[index] = arr[i];
                Helper(res, arr, combo, index + 1, i + 1);
            }
        }
    }
}