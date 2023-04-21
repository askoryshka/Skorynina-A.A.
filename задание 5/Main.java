import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        ArrayList<Integer> info = input.getInfo();
        System.out.println(info);
        Summa square = new Summa(info);
        System.out.println("Сумма квадаратов = " + square.Sum());
    }
}