package org.example;

public class Task1 {
    public static void main(String[] args) {
        Square square = new Square("Синий", 0.0, 0.0, 4.0);
Shape shape = new Square("Синий", 0.0, 0.0, 4.0);
        square.displayInfo();
        System.out.printf("Диагональ: %.2f\n", square.getDiagonal());

        square.move(2.0, 3.0);
        square.displayInfo();
    }
}