package com.company;

public class HomeMadeCar extends GenericCar {
    int numOfSpeakers;
    int numOfComputersInside;
    HomeMadeCar(int maxSpeed, int numberOfTires, int numberOfGears, int engineVolume, String carName, int numOfSpeakers, int cost, int horsepower, boolean isAutomatical, int numOfComputersInside) {
        super(maxSpeed, numberOfTires, numberOfGears, engineVolume, carName, cost, horsepower, isAutomatical);
        this.numOfComputersInside= numOfComputersInside;
        this.numOfSpeakers = numOfSpeakers;
    }
    @Override
    void makeCarRun() {
        System.out.println("Ww... ww... *fastly speeds up*");
    }
    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Количество динамиков: "+ numOfSpeakers);
        System.out.println("Количество компьютеров: "+ numOfComputersInside);
    }
    void turnOnMusic() {
        System.out.println("Ground control to Major Tom... *music is loud*");
    }
    void turnOnComputers() {
        System.out.println("*the entire car blows up*");
    }
    @Override
    void goForABit() {
        System.out.println("*Car goes for a kilometre through the expo without issues except shouting at apple users*");
    }
    @Override
    void showPossibilities() {
        printInfo();
        makeCarRun();
        goForABit();
        turnOnMusic();
        turnOnComputers();
    }
}
