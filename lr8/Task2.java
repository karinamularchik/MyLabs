package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String fileName = "f.txt";

        try (Scanner keyboardScanner = new Scanner(System.in);
             PrintWriter writer = new PrintWriter(fileName)) {

            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                while (!keyboardScanner.hasNextInt()) {
                    System.out.println("Ошибка! Введите целое число:");
                    keyboardScanner.next();
                }
                int num = keyboardScanner.nextInt();
                writer.print(num + " ");
            }
            System.out.println("Числа успешно записаны в файл " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при создании/открытии файла: " + e.getMessage());
        }

        File file = new File(fileName);
        int oddCount = 0;

        System.out.println("\n--- Числа из файла ---");
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();
                System.out.print(number + " ");

                if (number % 2 != 0) {
                    oddCount++;
                }
            }
            System.out.println();
            System.out.println("Количество чисел, не кратных 2: " + oddCount);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}