package org.example.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void printProgrammers(List<Programmer> programmers, int level) {
        System.out.println("=== Программисты с уровнем " + level + " ===");
        boolean found = false;
        for (Programmer p : programmers) {
            if (p.getLevel() == level) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет программистов с таким уровнем.");
        }
    }

    public static void main(String[] args) {
        List<Programmer> programmers = new ArrayList<>();
        programmers.add(new Programmer(1, "Алексей", "Java", 2, Arrays.asList(5, 4, 5))); // Среднее: 4.67
        programmers.add(new Programmer(2, "Борис", "Python", 1, Arrays.asList(2, 3, 2))); // Среднее: 2.33 (< 3, удалится)
        programmers.add(new Programmer(3, "Виктор", "C++", 2, Arrays.asList(4, 4, 5)));    // Среднее: 4.33
        programmers.add(new Programmer(4, "Анна", "JavaScript", 2, Arrays.asList(3, 3, 3))); // Среднее: 3.0
        programmers.add(new Programmer(5, "Дмитрий", "Java", 1, Arrays.asList(5, 5, 4))); // Среднее: 4.67
        programmers.add(new Programmer(6, "Елена", "Python", 2, Arrays.asList(1, 2, 2))); // Среднее: 1.67 (< 3, удалится)

        System.out.println("Исходный список");
        for (Programmer p : programmers) {
            System.out.println(p);
        }
        System.out.println();

        programmers.removeIf(p -> p.getAverageReview() < 3.0);

        for (Programmer p : programmers) {
            if (p.getAverageReview() >= 4.0) {
                p.setLevel(p.getLevel() + 1);
            }
        }

        printProgrammers(programmers, 3);
        System.out.println();

        programmers.sort((p1, p2) -> {
            int cmp = Double.compare(p2.getAverageReview(), p1.getAverageReview());
            if (cmp != 0) {
                return cmp;
            }
            return p2.getName().compareTo(p1.getName());
        });

        System.out.println(" Отсортированный список (ID, Имя, Средний рейтинг) ");
        for (Programmer p : programmers) {
            System.out.println("ID: " + p.getId() +
                    " | Имя: " + p.getName() +
                    " | Средний рейтинг: " + String.format("%.2f", p.getAverageReview()));
        }
    }
}