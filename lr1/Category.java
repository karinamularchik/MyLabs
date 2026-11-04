package org.example;

public enum Category {
    FOOD, CLOTHES, ELECTRONICS, BOOKS, TOYS
}

class Product {
    private String name;
    private Category category;

    public Product(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public String getName() { return name; }
    public Category getCategory() { return category; }
}

class Main {
    public static void main(String[] args) {
        Product[] products = new Product[6];
        products[0] = new Product("Смартфон", Category.ELECTRONICS);
        products[1] = new Product("Яблоко", Category.FOOD);
        products[2] = new Product("Футболка", Category.CLOTHES);
        products[3] = new Product("Ноутбук", Category.ELECTRONICS);
        products[4] = new Product("Книга", Category.BOOKS);
        products[5] = new Product("Наушники", Category.ELECTRONICS);

        System.out.println("Товары категории ELECTRONICS:");
        for (Product product : products) {
            if (product.getCategory() == Category.ELECTRONICS) {
                System.out.println("- " + product.getName());
            }
        }
    }
}