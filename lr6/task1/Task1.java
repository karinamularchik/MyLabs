package org.example.task1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Garment> garmentMap = new HashMap<>();

        garmentMap.put("Кожанка", new Jacket("Кожанка", "J01", "M", "Кожа"));
        garmentMap.put("Пуховик", new Jacket("Пуховик", "J02", "L", "Нейлон"));
        garmentMap.put("Ветровка", new Jacket("Ветровка", "J03", "S", "Полиэстер"));

        garmentMap.put("Черная футболка", new TShirt("Черная футболка", "T01", "M", "Логотип"));
        garmentMap.put("Белая футболка", new TShirt("Белая футболка", "T02", "L", "Рок-принт"));
        garmentMap.put("Поло", new TShirt("Поло", "T03", "S", "Без принта"));

        garmentMap.put("Джинсы", new Pants("Джинсы", "P01", "32", 100));
        garmentMap.put("Брюки", new Pants("Брюки", "P02", "30", 95));

        System.out.println("Содержимое Map гардероба");
        for (Map.Entry<String, Garment> entry : garmentMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + " | Значение: " + entry.getValue());
        }
    }
}