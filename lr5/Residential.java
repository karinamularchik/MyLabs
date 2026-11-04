package org.example;

class Residential extends Building {
    private int apartmentsCount;

    public Residential(String address, int floors, double area, int apartmentsCount) {
        super(address, floors, area);
        this.apartmentsCount = apartmentsCount;
    }

    @Override
    public String getPurpose() {
        return "Жилой дом";
    }
}
