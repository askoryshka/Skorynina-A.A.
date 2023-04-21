import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] vowels = {"а", "о", "у", "ы", "э", "е", "ё", "и", "ю", "я"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввод:");
        String stroka = scanner.nextLine();

        for (String vowel : vowels) {
            stroka = stroka.replace(vowel, "");
        }
        System.out.println(stroka);
    }
}