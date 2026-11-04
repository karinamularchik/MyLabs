package org.example;

public class Transport {
    private String type;
    private String brand;
    private int year;
    private int capacity;
    private double fuelConsumption;

    public Transport(String type, String brand, int year, int capacity, double fuelConsumption)
            throws InvalidTransportDataException {
        this.type = type;
        this.brand = brand;
        setYear(year);
        setCapacity(capacity);
        setFuelConsumption(fuelConsumption);
    }

    public void setYear(int year) throws InvalidTransportDataException {
        if (year <= 1900) {
            throw new InvalidTransportDataException("Неверный год выпуска: год должен быть > 1900.");
        }
        this.year = year;
    }

    public void setCapacity(int capacity) throws InvalidTransportDataException {
        if (capacity <= 0) {
            throw new InvalidTransportDataException("Неверная вместимость: вместимость должна быть > 0.");
        }
        this.capacity = capacity;
    }

    public void setFuelConsumption(double fuelConsumption) throws InvalidTransportDataException {
        if (fuelConsumption < 0) {
            throw new InvalidTransportDataException("Неверный расход топлива: значение не может быть отрицательным.");
        }
        this.fuelConsumption = fuelConsumption;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void service() throws MaintenanceException {
        if (this.year < 2010) {
            throw new MaintenanceException("Транспорт '" + brand + "' слишком старый (года выпуска: " + year + ") и требует капитального ремонта!");
        }
        System.out.println("Обслуживание транспорта '" + brand + "' успешно проведено.");
    }

    public double calculateFuel(double distance) {
        return (fuelConsumption * distance) / 100.0;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "Transport{type='" + type + "', brand='" + brand + "', year=" + year +
                ", capacity=" + capacity + ", fuelConsumption=" + fuelConsumption + "}";
    }
}