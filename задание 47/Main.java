import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{9, 4, 7}, {3, 5, 1}, {6, 2, 0}};
        List<Integer> sorted = SnailArraySort.snail(array);
        System.out.println(sorted);
    }
}