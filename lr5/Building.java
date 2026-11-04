package org.example;

class Building {
    private String address;
    private int floors;
    private double area;

    public Building(String address, int floors, double area) {
        this.address = address;
        this.floors = floors;
        this.area = area;
    }

    public void build() {
        System.out.println("Строю здание");
    }

    public void build(int floors) {
        System.out.println("Строю здание с " + floors + " этажами");
    }

    public void build(String material) {
        System.out.println("Строю из " + material);
    }

    public String getPurpose() {
        return "Неизвестно";
    }

    public void displayInfo() {
        System.out.println("Адрес: " + address + ", Этажей: " + floors + ", Площадь: " + area + ", Назначение: " + getPurpose());
    }
}
