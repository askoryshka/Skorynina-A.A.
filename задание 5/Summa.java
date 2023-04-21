import java.util.ArrayList;
import static java.lang.Math.pow;
public class Summa {
    private ArrayList<Integer> array;
    public Summa(ArrayList<Integer> array) {
        this.array = array;
    }
    public int Sum() {
        int sum = 0;
        for (int number : array) {
            sum += pow(number, 2);
        }
        return sum;
    }
}