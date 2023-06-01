public class Main {
    public static void main(String[] args) {
        IntervalCounter interval = new IntervalCounter();
        int [][] intervals = {{1, 2}, {6, 10}, {11, 15}};
        System.out.println(interval.count(intervals));
    }
}