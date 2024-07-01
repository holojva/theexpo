package com.company;

public class LutiyKorch extends GenericCar {
    int numOfSpeakers;
    int carMileage;
    LutiyKorch(int maxSpeed, int numberOfTires, int numberOfGears, int engineVolume, String carName, int numOfSpeakers, int cost, int horsepower, boolean isAutomatical, int carMileage) {
        super(maxSpeed, numberOfTires, numberOfGears, engineVolume, carName, cost, horsepower, isAutomatical);
        this.numOfSpeakers = numOfSpeakers;
        this.carMileage = carMileage;
    }
    @Override
    void makeCarRun() {
        System.out.println("Wwrrrrrrrrrrph...*long pause* wwrrrrrrrrrrrph... damn it (the driver mumbles) wwwwrrrrrrrr *car goes for 25 meters and dies* AAAAAAAHHHHH");
    }
    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Количество динамиков: "+ numOfSpeakers);
        System.out.println("Пробег: "+ carMileage);
    }
    void turnOnMusic() {
        System.out.println("Never gonna giiii------... *car turns off and stops*");
    }
    void goForABit() {
        System.out.println("*Car doesn't even show a bit of life*");
    }
    @Override
    void showPossibilities() {
        printInfo();
        makeCarRun();
        goForABit();
        turnOnMusic();
    }
}
