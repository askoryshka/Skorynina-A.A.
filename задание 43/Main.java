public class Main {
    public static void main(String[] args) {
        int[][] pyramid = {
                {3},
                {7, 4},
                {2, 4, 6},
                {8, 5, 9, 3}
        };

        int maxSlideSum = Pyramid.findMaxSlideSum(pyramid);
        System.out.println("Максимальная сумма скольжения: " + maxSlideSum);
    }
}