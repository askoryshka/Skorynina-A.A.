public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3);
        matrix.get();
        System.out.println("Транспонированная матрица: \n" + matrix.transposition());
    }
}