import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int upperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == input.toUpperCase().charAt(i)) {
                upperCount++;
            } else {
                lowerCount++;
            }
        }
        if (upperCount > lowerCount) {
            System.out.println("Итог:");
            System.out.println(input.toUpperCase());
        } else {
            System.out.println("Итог:");
            System.out.println(input.toLowerCase());
        }
    }
}