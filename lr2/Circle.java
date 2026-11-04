package org.example;

public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("Ошибка: Радиус не может быть отрицательным!");
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public double circumference() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return String.format("Радиус: %.2f | Площадь: %.2f | Длина окружности: %.2f",
                radius, area(), circumference());
    }
    public static void main(String[] args) {
        Circle[] circles = new Circle[] {
                new Circle(3.0),
                new Circle(5.5),
                new Circle(10.0)
        };
        System.out.println("Параметры окружностей");
        for (int i = 0; i < circles.length; i++) {
            System.out.println("Окружность №" + (i + 1) + ": " + circles[i]);
        }
    }
}