import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long TanyaSticks = playGame(n, true);
        System.out.println(TanyaSticks);
    }

    private static long playGame(long sticks, boolean TanyaTurn) {
        if (sticks == 1) {
            return TanyaTurn ? 0 : 1;
        }
        if (sticks % 2 == 0) {
            if (TanyaTurn) {
                return playGame(sticks / 2, !TanyaTurn);
            } else {
                if (sticks == 2) {
                    return 1;
                } else {
                    return Math.max(playGame(sticks - 1, !TanyaTurn), playGame(sticks / 2, !TanyaTurn));
                }
            }
        } else {
            return playGame(sticks - 1, !TanyaTurn);
        }
    }
}