import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class CompanyGUI extends JFrame {
    private ArrayList<Employee> employees = new ArrayList<>();

    private JTextField fioField;
    private JTextField ageField;
    private JTextField salaryField;

    public CompanyGUI() {
        setTitle("Управление компанией");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(4, 2));

        createComponents();
        setupListeners();

        loadEmployeesFromFile(); // Загрузка данных из файла при запуске

        pack();
        setLocationRelativeTo(null);
    }

    private void createComponents() {
        fioField = new JTextField();
        ageField = new JTextField();
        salaryField = new JTextField();

        add(new JLabel("ФИО:"));
        add(fioField);
        add(new JLabel("Возраст:"));
        add(ageField);
        add(new JLabel("Зарплата:"));
        add(salaryField);

        JButton addButton = new JButton("Добавить сотрудника");
        add(addButton);
    }

    private void setupListeners() {
        JButton addButton = (JButton) getComponentByName("Добавить сотрудника");
        addButton.addActionListener(e -> addEmployee());
    }

    private Component getComponentByName(String name) {
        for (Component component : getContentPane().getComponents()) {
            if (component instanceof JButton && name.equals(((JButton) component).getText())) {
                return component;
            }
        }
        return null;
    }

    private void addEmployee() {
        try {
            String fio = fioField.getText();
            int age = Integer.parseInt(ageField.getText());
            int salary = Integer.parseInt(salaryField.getText());

            Employee employee = new Employee(fio, age, salary);
            employees.add(employee);

            saveEmployeesToFile(); // Сохранение данных в файл после внесения изменений
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Введите корректные числовые значения для возраста и зарплаты.",
                    "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void saveEmployeesToFile() {
        try (PrintWriter writer = new PrintWriter(
                new OutputStreamWriter(new FileOutputStream("employees.txt"), "UTF-8"))) {
            for (Employee employee : employees) {
                writer.println(employee.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadEmployeesFromFile() {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream("employees.txt"), "UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Обработка строки из файла
                // ...
            }
        } catch (IOException e) {
            System.out.println("Файл employees.txt не найден. Создается новый.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CompanyGUI().setVisible(true));
    }
}

class Employee implements Serializable {
    private String fio;
    private int age;
    private int salary;

    public Employee(String fio, int age, int salary) {
        this.fio = fio;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО: " + fio + ", Возраст: " + age + ", Зарплата: " + salary;
    }
}