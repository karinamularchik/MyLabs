package org.example;

class Computer implements Connectable, Configurable {
    private String model;
    private boolean connected;
    private String os;

    public Computer(String model, String os) {
        this.model = model;
        this.connected = false;
        this.os = os;
    }

    @Override
    public void connect() {
        this.connected = true;
        System.out.println("Компьютер " + model + " (" + os + ") подключен к сети.");
    }

    @Override
    public void disconnect() {
        this.connected = false;
        System.out.println("Компьютер " + model + " отключен от сети.");
    }

    @Override
    public boolean isConnected() {
        return connected;
    }

    @Override
    public void configure() {
        System.out.println("Настройка сетевых параметров компьютера " + model);
    }

    @Override
    public void reset() {
        System.out.println("Сброс сетевых настроек компьютера " + model);
    }
}
