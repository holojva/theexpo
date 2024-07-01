package com.company;

public class TimeCar extends GenericCar {
    int numOfComputersInside;
    int numOfDrBrownsInside;
    TimeCar(int maxSpeed, int numberOfTires, int numberOfGears, int engineVolume, String carName, int cost, int horsepower, boolean isAutomatical, int numOfComputersInside, int numOfDrBrownsInside) {
        super(maxSpeed, numberOfTires, numberOfGears, engineVolume, carName, cost, horsepower, isAutomatical);
        this.numOfComputersInside= numOfComputersInside;
        this.numOfDrBrownsInside = numOfDrBrownsInside;
    }
    @Override
    void makeCarRun() {
        System.out.println("Wwrrrrrrrrrrrr... wrrrrrrrwrrrrr... *fastly speeds up and disappears into thin air*");
    }
    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Количество компьютеров: "+ numOfComputersInside);
        System.out.println("Количество докторов Браунов: "+ numOfDrBrownsInside);
    }
    void turnOnComputers() {
        System.out.println("*the entire car starts blinking and all phones die in a radius of a hundred meters*");
    }
    @Override
    void showPossibilities() {
        printInfo();
        makeCarRun();
        goForABit();
        turnOnComputers();
    }
    @Override
    void goForABit() {
        System.out.println("*Car goes for a 100m through the expo and somehow even teleports where it was*");
    }
}
