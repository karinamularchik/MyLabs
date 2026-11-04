package org.example;
public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;

    }

    public void bark() {

        System.out.println("Гав");
    }

@Override
public String toString() {
        return "Имя: "+name + " Порода: "+breed+"Возраст: "+age;
}
    public static void main(String[] args) {
        Dog dog1 = new Dog("Мася", "Русский той", 8);
        dog1.bark();
        System.out.println(dog1);

    }
}