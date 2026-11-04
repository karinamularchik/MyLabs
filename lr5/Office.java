package org.example;

class Office extends Building {
    private int workstationsCount;

    public Office(String address, int floors, double area, int workstationsCount) {
        super(address, floors, area);
        this.workstationsCount = workstationsCount;
    }

    @Override
    public String getPurpose() {
        return "Офис";
    }
}
