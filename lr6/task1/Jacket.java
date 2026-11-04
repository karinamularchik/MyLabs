package org.example.task1;

class Jacket extends Garment {
    private String material;

    public Jacket(String name, String id, String size, String material) {
        super(name, id, size);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Jacket{name='" + getName() + "', id='" + getId() + "', size='" + getSize() + "', material='" + getMaterial() + "'}";
    }
}
