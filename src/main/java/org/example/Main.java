package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите программу для запуска:");
        System.out.println("1. Калькулятор");
        System.out.println("2. Поиск максимального слова в массиве");

        // Запрашиваем у пользователя выбор программы
        System.out.print("Введите номер программы: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // считываем перевод строки после ввода числа

        switch (choice) {
            case 1:
                runCalculator();
                break;
            case 2:
                findMaxWord();
                break;
            default:
                System.out.println("Некорректный выбор программы.");
        }
    }

    // Метод для запуска калькулятора
    private static void runCalculator() {
        System.out.println("Вы выбрали калькулятор.");
        // Здесь можно вызвать код для запуска калькулятора
        Calculator.runCalculator();
    }

    // Метод для запуска программы поиска максимального слова в массиве
    private static void findMaxWord() {
        System.out.println("Вы выбрали программу для поиска максимального слова в массиве.");

        // Здесь можно вызвать код для запуска программы поиска максимального слова в массиве
        // (как пример, можно использовать код из предыдущего ответа)
        FindMaxWord.secmain();
    }
}
