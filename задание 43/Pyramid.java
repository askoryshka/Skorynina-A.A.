public class Pyramid {
    public static int findMaxSlideSum(int[][] pyramid) {
        int rows = pyramid.length;
        int[][] maxSum = new int[rows][rows];
        maxSum[0][0] = pyramid[0][0];

        for (int i = 1; i < rows; i++) {
            maxSum[i][0] = maxSum[i - 1][0] + pyramid[i][0];
            maxSum[i][i] = maxSum[i - 1][i - 1] + pyramid[i][i];
            for (int j = 1; j < i; j++) {
                maxSum[i][j] = Math.max(maxSum[i - 1][j - 1], maxSum[i - 1][j]) + pyramid[i][j];
            }
        }

        int maxSlideSum = 0;
        for (int i = 0; i < rows; i++) {
            maxSlideSum = Math.max(maxSlideSum, maxSum[rows - 1][i]);
        }

        return maxSlideSum;
    }
}