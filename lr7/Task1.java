package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static Transport findTransportByBrand(List<Transport> fleet, String brand) throws TransportNotFoundException {
        for (Transport t : fleet) {
            if (t.getBrand().equalsIgnoreCase(brand)) {
                return t;
            }
        }
        throw new TransportNotFoundException("Транспорт с брендом '" + brand + "' не найден в автопарке!");
    }

    public static void main(String[] args) {
        List<Transport> fleet = new ArrayList<>();

        try {
            fleet.add(new Transport("Автобус", "Mercedes", 2018, 45, 28.5));
            fleet.add(new Transport("Грузовик", "Volvo", 2005, 2, 35.0));
            fleet.add(new Transport("Легковой", "Toyota", 2021, 5, 7.8));

            fleet.add(new Transport("Ретро", "OldCar", 1850, 4, 12.0));
        } catch (InvalidTransportDataException e) {
            System.err.println("\nОшибка валидации данных: " + e.getMessage());
        }

        System.out.println("\n Список автопарка");
        for (Transport t : fleet) {
            System.out.println(t);
        }

        System.out.println("\n Проведение обслуживания автопарка");
        for (Transport t : fleet) {
            try {
                t.service();
            } catch (MaintenanceException e) {
                System.out.println("Ошибка обслуживания: " + e.getMessage());
            }
        }

        System.out.println("\nРасчет топлива на 250 км");
        double distance = 250.0;
        for (Transport t : fleet) {
            double fuel = t.calculateFuel(distance);
            System.out.println("Бренд: " + t.getBrand() + " | Потребуется топлива: " + String.format("%.2f", fuel) + " л.");
        }

        System.out.println("\nПоиск транспорта в автопарке");
        try {
            Transport found = findTransportByBrand(fleet, "Toyota");
            System.out.println("Найден: " + found);

            findTransportByBrand(fleet, "BMW");
        } catch (TransportNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        }
    }
}