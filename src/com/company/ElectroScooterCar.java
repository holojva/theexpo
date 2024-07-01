package com.company;

public class ElectroScooterCar extends GenericCar {
    ElectroScooterCar(int maxSpeed, int numberOfTires, int numberOfGears, int engineVolume, String carName, int cost, int horsepower, boolean isAutomatical) {
        super(maxSpeed, numberOfTires, numberOfGears, engineVolume, carName, cost, horsepower, isAutomatical);
    }
    @Override
    void makeCarRun() {
        System.out.println("*with no noise it starts* *slowly speeds up*");
    }
    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Affordable: yes");
    }
    void enterPetusharingMode() {
        System.out.println("*the 'car' starts going on the sidewalks scaring people*");
    }
    void showPossibilities() {
        printInfo();
        makeCarRun();
        goForABit();
        enterPetusharingMode();
    }
    @Override
    void goForABit() {
        System.out.println("*the 'car' goes for a kilometre through the expo except that it is slow*");
    }
}
