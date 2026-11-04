package org.example;

public class City {
    private String name;
    private int population;
    private double area;

    public City(String name,int population,double area)
    {
        this.name = name;
        this.population = population;
        this.area=area;
    }
    public String getName(){
        return name;
    }
    public int getPopulation()
    {
        return population;
    }
    public double getArea()
    {
        return area;
    }
    @Override
    public String toString() {
        return name + " Население: " + population + " чел., Площадь: " + area + " кв. км";
    }
    public static void main(String[] args)
    {
        City[] cities = new City[6];
        cities[0] = new City("Минск", 1995471, 348.84);
        cities[1] = new City("Гомель", 501802, 139.77);
        cities[2] = new City("Могилёв", 353338, 118.5);
        cities[3] = new City("Витебск", 359148, 124.54);
        cities[4] = new City("Гродно", 358717, 142.11);
        cities[5] = new City("Брест", 340800, 146.12);

        City maxPopulationCity = cities[0];
        City maxAreaCity = cities[0];

        for (int i = 1; i < cities.length; i++) {
            if (cities[i].getPopulation() > maxPopulationCity.getPopulation()) {
                maxPopulationCity = cities[i];
            }

            if (cities[i].getArea() > maxAreaCity.getArea()) {
                maxAreaCity = cities[i];
            }
        }

        System.out.println("Город с максимальным населением: " + maxPopulationCity);
        System.out.println("Город с максимальной площадью: " + maxAreaCity);
    }

}
