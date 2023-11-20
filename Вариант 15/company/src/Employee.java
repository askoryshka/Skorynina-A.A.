import java.io.*;

// Создаем класс Employee, который реализует интерфейс Comparable и Serializable
class Employee implements Comparable<Employee>, Serializable {
    private String fio;
    private int age;
    private int salary;

    // Конструктор класса Employee
    public Employee (String fio, int age, int salary) {
        this.fio = fio;
        this.age = age;
        this.salary = salary;
    }

    // Геттер для ФИО
    public String getFio() {
        return fio;
    }

    // Геттер для возраста
    public int getAge() {
        return age;
    }

    // Геттер для зарплаты
    public int getSalary() {
        return salary;
    }