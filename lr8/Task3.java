package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String fileF = "f.txt";
        String fileG = "g.txt";
        String fileH = "h.txt";

        Random random = new Random();
        try (PrintWriter writerF = new PrintWriter(fileF)) {
            for (int i = 0; i < 15; i++) {
                int randomNumber = random.nextInt(200) - 50;
                writerF.print(randomNumber + " ");
            }
            System.out.println("Файл " + fileF + " успешно заполнен случайными числами.");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка создания файла f: " + e.getMessage());
        }

        try (Scanner scannerF = new Scanner(new File(fileF));
             PrintWriter writerG = new PrintWriter(fileG);
             PrintWriter writerH = new PrintWriter(fileH)) {

            while (scannerF.hasNextInt()) {
                int number = scannerF.nextInt();
                String numberStr = String.valueOf(number);

                if (numberStr.contains("5")) {
                    writerG.print(number + " ");
                } else {
                    writerH.print(number + " ");
                }
            }
            System.out.println("Числа с цифрой 5 записаны в " + fileG + ", остальные — в " + fileH + ".");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
}