package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String fileName = "volumes.txt";

        try (Scanner keyboardScanner = new Scanner(System.in).useLocale(Locale.US);
             PrintWriter writer = new PrintWriter(fileName)) {

            System.out.println("Введите 15 вещественных значений объема жидкости:");
            for (int i = 0; i < 15; i++) {
                System.out.print("Объем " + (i + 1) + ": ");
                while (!keyboardScanner.hasNextDouble()) {
                    System.out.println("Ошибка! Введите вещественное число (с точкой):");
                    keyboardScanner.next();
                }
                double volume = keyboardScanner.nextDouble();
                writer.print(volume + " ");
            }
            System.out.println("Данные об объемах сохранены в файл.");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }

        double sum = 0.0;
        int count = 0;

        try (Scanner fileScanner = new Scanner(new File(fileName)).useLocale(Locale.US)) {
            while (fileScanner.hasNextDouble()) {
                double volume = fileScanner.nextDouble();
                sum += volume;
                count++;
            }

            if (count > 0) {
                double average = sum / count;
                System.out.printf("\nСчитано значений: %d\n", count);
                System.out.printf("Средний объем жидкости: %.3f\n", average);
            } else {
                System.out.println("Файл пуст.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}