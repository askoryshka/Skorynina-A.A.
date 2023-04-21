import static java.lang.Math.pow;

public class Square {
    private final int Size;
    private final int Step;
    public Square(int Size, int Step) {
        this.Size = Size;
        this.Step = Step;
    }
    public int [] findSquares() {
        int firstNumber = Step;
        int [] numbers = new int[Size];
        for (int i = 0; i < Size; i++) {
            numbers[i] = (int) pow(firstNumber, 2);
            firstNumber += Step;
        }
        return numbers;
    }
}