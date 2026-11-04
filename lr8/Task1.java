package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        String fileName = "favorite_food.txt";
        String foodInfo = "Моя любимая еда — шаурма.\nЕсли говорить про домашнюю еду, то это борщик";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(foodInfo);
            System.out.println("Файл успешно создан и заполнен.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        File file = new File(fileName);
        System.out.println("\n--- Информация о файле ---");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Существует: " + (file.exists() ? "Да" : "Нет"));
        System.out.println("Доступен для чтения: " + (file.canRead() ? "Да" : "Нет"));

        System.out.println("\n--- Содержимое файла ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}