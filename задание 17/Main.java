public class Main {
    public static void main(String[] args) {
        Check brackets = new Check("(((())())))");
        System.out.println(brackets.check());
    }
}