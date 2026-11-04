package org.example;

class Square extends Shape {
    private double side;

    public Square(String color, double x, double y, double side) {
        super(color, x, y);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public void draw() {
        System.out.println("Квадрат со стороной " + side);
    }

    public double getDiagonal() {
        return side * Math.sqrt(2);
    }
}
