package com.company;

public class GenericCar {
    int maxSpeed;
    int numberOfTires;
    int numberOfGears;
    int engineVolume;
    String carName;
    int cost;
    int horsepower;
    boolean isAutomatical;
    GenericCar(int maxSpeed, int numberOfTires, int numberOfGears, int engineVolume, String carName, int cost, int horsepower, boolean isAutomatical) {
        this.maxSpeed = maxSpeed;
        this.numberOfTires = numberOfTires;
        this.numberOfGears = numberOfGears;
        this.engineVolume = engineVolume;
        this.carName = carName;
        this.cost = cost;
        this.horsepower = horsepower;
        this.isAutomatical = isAutomatical;
    }
    void printInfo() {
        System.out.println("Название: "+ carName);
        System.out.println("Максимальная скорость: "+ maxSpeed);
        System.out.println("Количество колес: "+ numberOfTires);
        System.out.println("Объем двигателя: "+ engineVolume);
        System.out.println("Цена: "+cost);
        System.out.println("Кол-во лошадиных сил: "+horsepower);
        System.out.println("Количество передач: "+ numberOfGears);
        System.out.println("Коробка: "+ (isAutomatical ? "автомат":"механика"));

    }
    void makeCarRun() {
        System.out.println("Wrrrrr... wrrrr... *speeds up*");
    }
    void goForABit() {
        System.out.println("*Car goes for a kilometre through the expo*");
    }
    void showPossibilities() {
        printInfo();
        makeCarRun();
        goForABit();
    }
}
