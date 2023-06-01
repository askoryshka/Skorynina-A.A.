public class Main {
    public static void main(String[] args) {
        int[] nums = {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        String formatted = RangeFormatter.formatRange(nums);
        System.out.println(formatted);
    }
}