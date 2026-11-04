package org.example.task1;

class Garment {
    private String name;
    private String id;
    private String size;

    public Garment(String name, String id, String size) {
        this.name = name;
        this.id = id;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Garment{name='" + getName() + "', id='" + getId() + "', size='" + getSize() + "'}";
    }
}
