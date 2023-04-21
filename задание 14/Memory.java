public class Memory {
    private static final Integer [] cell = new Integer[3];
    public Integer [] fillCell(int number) {
        int indexOfMin = 0;
        for (int i = 0; i < 3; i++) {
            if (cell[i] == null) {
                cell[i] = number;
            } else if (cell[i] < cell[indexOfMin]) {
                indexOfMin = i;
            }
        }
        cell[indexOfMin] = number;
        return cell;
    }
}