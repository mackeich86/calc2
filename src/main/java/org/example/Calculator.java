package org.example;

import java.util.Scanner;

public class Calculator {
    /**
     * Этот метод используется для выполнения операции сложения двух чисел с плавающей запятой.
     *
     * @param num1 Первое число с плавающей запятой
     * @param num2 Второе число с плавающей запятой
     * @return Результат операции сложения
     */
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Этот метод используется для выполнения операции вычитания двух чисел с плавающей запятой.
     *
     * @param num1 Первое число с плавающей запятой
     * @param num2 Второе число с плавающей запятой
     * @return Результат операции вычитания
     */
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Этот метод используется для выполнения умножения двух чисел с плавающей запятой.
     *
     * @param num1 Первое число с плавающей запятой
     * @param num2 Второе число с плавающей запятой
     * @return Результат операции умножения
     */
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Этот метод используется для выполнения операции деления двух чисел с плавающей запятой.
     *
     * @param num1 Первое число с плавающей запятой
     * @param num2 Второе число с плавающей запятой
     * @return Результат операции деления
     */
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Делитель не может быть равен 0");
            return Double.NaN; // Возвращает специальное значение, представляющее нечисловое число
        }
    }

    public static void runCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в простой калькулятор");
        System.out.println("Пожалуйста, введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Пожалуйста, выберите действие (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        System.out.println("Пожалуйста, введите второе число:");
        double num2 = scanner.nextDouble();

        scanner.close();

        double result;

        // Выполняем действия в соответствии с оператором, выбранным пользователем
        switch (operator) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Недопустимый оператор");
                return;
        }

        // Используем форматирование для вывода результата и округляем его до четырех знаков после запятой
        System.out.printf("результат: %.4f%n", result);
    }
}