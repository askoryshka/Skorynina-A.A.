public class IntervalCounter {
    public int count(int[][] intervals) {
        int count = 0;
        for (int[] interval : intervals) {
            int end = interval[1];
            int start = interval[0];
            count += end - start;
        }
        return count;
    }
}

}