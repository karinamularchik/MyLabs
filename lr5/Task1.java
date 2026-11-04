package org.example;

public class Task1 {
    public static void main(String[] args) {
        Building building = new Building("Ленина 1", 5, 500.0);
        Residential residential = new Residential("Пушкина 10", 9, 3000.0, 36);
        Office office = new Office("Мира 5", 3, 1200.0, 50);

        building.build();
        building.build(9);
        building.build("кирпич");

        Building[] buildings = { building, residential, office };
        for (Building b : buildings) {
            b.displayInfo();
        }
    }
}