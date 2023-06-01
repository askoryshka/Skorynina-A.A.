
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HistoryManager {
    private static final String fileName = "D:\\ВГУИТ\\Основы программирывания\\Стас\\2 семестр\\задание 50\\история калькулятора";
    public void saveExpression(String expression, double result) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append(expression);
            writer.append(",");
            writer.append(String.valueOf(result));
            writer.append("\n");
        } catch (IOException e) {
            System.err.println("Ошибка при сохранении истории: " + e.getMessage());
        }
    }
    public List<String> loadHistory() {
        List<String> history = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                history.add(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при загрузке истории: " + e.getMessage());
        }
        return history;
    }
}