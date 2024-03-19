import java.util.Scanner;

public class Calculator {
    /**
     * Этот метод используется для выполнения операции сложения двух чисел с плавающей запятой.
     *
     * @param num1 Первое число
     * @param num2 Второе число
     * @return Результат операции сложения
     */
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в простой калькулятор");
        System.out.println("Пожалуйста, введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Пожалуйста, введите второе число:");
        double num2 = scanner.nextDouble();

        double result = add(num1, num2);

        // Используем форматирование для вывода результата и округляем его до четырех знаков после запятой
        System.out.printf("результат: %.4f%n", result);
    }
}