public class Sum {
    public static String sum(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int sum = n1 + n2;
        return String.valueOf(sum);
    }
}