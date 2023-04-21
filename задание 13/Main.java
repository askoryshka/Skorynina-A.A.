import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Начало ряда:");
        int start = scanner.nextInt();

        System.out.println("Шаг:");
        int shag = scanner.nextInt();

        System.out.println("Количество шагов:");
        int kollichestvo_shagov = scanner.nextInt();

        for (int i = 0; i < kollichestvo_shagov; i++) {
            int num = start + i * shag;
            System.out.print(num + " ");
        }
    }
}