package org.example.task1;

class Pants extends Garment {
    private int length;

    public Pants(String name, String id, String size, int length) {
        super(name, id, size);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Pants{name='" + getName() + "', id='" + getId() + "', size='" + getSize() + "', length=" + getLength() + "}";
    }
}
