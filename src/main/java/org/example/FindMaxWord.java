package org.example;

import java.util.Scanner;

/**
 * Программа для поиска максимального слова в массиве слов.
 */
public class FindMaxWord {
    public static void secmain() {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя количество слов в массиве
        System.out.print("Введите количество слов: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // считываем перевод строки после ввода числа

        // Создаем массив для хранения слов
        String[] words = new String[n];

        // Заполняем массив словами, вводимыми пользователем
        for (int i = 0; i < n; i++) {
            System.out.print("Введите слово " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }

        // Ищем максимальное слово в массиве
        String maxWord = findMaxWord(words);

        // Выводим максимальное слово на экран
        System.out.println("Максимальное слово: " + maxWord);
    }

    /**
     * Метод для поиска максимального слова в массиве.
     *
     * @param words Массив слов, в котором нужно найти максимальное слово.
     * @return Максимальное слово в массиве.
     */
    public static String findMaxWord(String[] words) {
        if (words == null || words.length == 0) {
            return null; // если массив пуст, возвращаем null
        }

        String maxWord = words[0]; // предполагаем, что первое слово максимальное

        // Проходим по остальным словам в массиве
        for (int i = 1; i < words.length; i++) {
            // Если текущее слово больше максимального, обновляем максимальное слово
            if (words[i].compareTo(maxWord) > 0) {
                maxWord = words[i];
            }
        }

        return maxWord;
    }
}
