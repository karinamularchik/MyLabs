package org.example;

public class Task1 {
    public static void main(String[] args) {
        Connectable.showInfo();

        Connectable[] devices = new Connectable[] {
                new Router("TP-Link", "Admin123"),
                new Router("ASUS", "Setup2026"),
                new Router("D-Link", "RootPass"),
                new Computer("Lenovo", "Windows 11"),
                new Computer("MacBook", "macOS")
        };

        System.out.println("\nПодключение устройств");
        for (Connectable device : devices) {
            device.connect();
        }

        System.out.println("\nНастройка и проверка статусов");
        for (Connectable device : devices) {
            System.out.println("Статус подключения: " + (device.isConnected() ? "В сети" : "Не в сети"));

            if (device instanceof Configurable) {
                Configurable confDevice = (Configurable) device;
                confDevice.configure();
            }
            System.out.println();
        }
    }
}