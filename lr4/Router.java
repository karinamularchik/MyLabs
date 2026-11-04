package org.example;

class Router implements Connectable, Configurable {
    private String model;
    private boolean connected;
    private String settings;

    public Router(String model, String settings) {
        this.model = model;
        this.connected = false;
        this.settings = settings;
    }

    @Override
    public void connect() {
        this.connected = true;
        System.out.println("Роутер " + model + " успешно подключен.");
    }

    @Override
    public void disconnect() {
        this.connected = false;
        System.out.println("Роутер " + model + " отключен.");
    }

    @Override
    public boolean isConnected() {
        return connected;
    }

    @Override
    public void configure() {
        System.out.println("Настройка роутера " + model + " (пароль: " + settings + ")");
    }

    @Override
    public void reset() {
        System.out.println("Сброс настроек роутера " + model);
    }
}
