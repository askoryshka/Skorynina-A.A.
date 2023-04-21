import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private final int Size;
    private final int[][] matrix;

    public Matrix(final int Size) {
        this.Size = Size;
        matrix = new int[Size][Size];
        Random random = new Random();
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(9) + 1;
            }

        }
    }
    public void get() {
        System.out.println(Arrays.deepToString(matrix)
                .replace("[[", "[")
                .replace("], ", "]\n")
                .replace("]]", "]"));
    }

    public String transposition() {
        int[][] transposition = new int[Size][Size];
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposition[j][i] = matrix[i][j];
            }
        }
        return Arrays.deepToString(transposition)
                .replace("[[", "[")
                .replace("], ", "]\n")
                .replace("]]", "]");
    }
}