package com.company;

public class PremiumCar extends GenericCar {
    boolean isFridgeThere;
    int numOfSpeakers;
    PremiumCar(int max_speed, int number_of_tires, int number_of_gears, int engine_volume, String car_name, boolean isFridgeThere, int numOfSpeakers, int cost, int horsepower, boolean isAutomatical) {
        super(max_speed, number_of_tires, number_of_gears, engine_volume, car_name, cost, horsepower, isAutomatical);
        this.isFridgeThere = isFridgeThere;
        this.numOfSpeakers = numOfSpeakers;
    }
    @Override
    void makeCarRun() {
        System.out.println("Ww... ww... *fastly speeds up*");
    }
    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Холодильник: "+ (isFridgeThere ? "есть":"нет"));
        System.out.println("Количество динамиков: "+ numOfSpeakers);
    }
    void turnOnMusic() {
        System.out.println("There's a sta-arman waiting in the sky... *music is louder than everything going on*");
    }
    @Override
    void showPossibilities() {
        printInfo();
        makeCarRun();
        goForABit();
        turnOnMusic();
    }
    @Override
    void goForABit() {
        System.out.println("*Car goes for a kilometre through the expo without issues*");
    }
}
