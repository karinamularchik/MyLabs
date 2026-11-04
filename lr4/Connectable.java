package org.example;

interface Connectable {
    void connect();

    void disconnect();

    boolean isConnected();

    static void showInfo() {
        System.out.println("Сетевые интерфейсы подключений");
    }
}
