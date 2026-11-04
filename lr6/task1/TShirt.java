package org.example.task1;

class TShirt extends Garment {
    private String print;

    public TShirt(String name, String id, String size, String print) {
        super(name, id, size);
        this.print = print;
    }

    public String getPrint() {
        return print;
    }

    @Override
    public String toString() {
        return "TShirt{name='" + getName() + "', id='" + getId() + "', size='" + getSize() + "', print='" + getPrint() + "'}";
    }
}
