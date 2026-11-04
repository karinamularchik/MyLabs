package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String fileName = "f.txt";
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(fileName)) {
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(201) - 100;
                writer.print(num + " ");
            }
            System.out.println("10 целых чисел записаны в файл " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }

        int countInRange = 0;
        System.out.println("\n--- Числа из файла ---");

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.print(number + " ");

                if (number >= -50 && number <= 50) {
                    countInRange++;
                }
            }
            System.out.println();
            System.out.println("Количество чисел в диапазоне от -50 до 50 включительно: " + countInRange);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при открытии файла: " + e.getMessage());
        }
    }
}