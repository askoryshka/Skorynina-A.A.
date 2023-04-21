public class StrCount {
    String text;
    char Char;
    public StrCount (String text, char Char) {
        this.text = text;
        this.Char = Char;
    }
    public int str_count() {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == Char) {
                count++;
            }
        }
        return count;
    }
}