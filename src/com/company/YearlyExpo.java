package com.company;

import java.util.Scanner;

import static com.company.weekdays.*;

public class YearlyExpo {
    GenericCar cars[];
    String dayOfWeek;
    String dateOfExpo;
    String input;
    public YearlyExpo() {
        cars = new GenericCar[]{
                new PremiumCar(200, 4, 3, 5, "XiaoHongShu", true, 12, 150000000, 350, true),
                new HomeMadeCar(75, 4, 5, 2, "Moskvich 2025", 2, 150000, 150, false, 13),
                new LutiyKorch(170, 4, 4, 2, "Toyota Corolla 1975", 12, 50000, 150, false, 459793),
                new TimeCar(2000, 4, 21, 695, "Delorian DMC 12", 999999999, 150000000, true, 3, 1),
                new ElectroScooterCar(20, 4, 256, 0, "Ninebot+smekalka", 15000, 5, true),
        };
        dayOfWeek = dayIsLike(weekdays.today());
        dateOfExpo = "07.07.2024";

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose a car: premium, homemade, korch, timecar, electroscooter. You can get all info with 'all'. To get expo data enter 'expo' ");
            String input = sc.nextLine();
            switch (input.toLowerCase()) {
                case "premium":
                    cars[0].showPossibilities();
                    break;
                case "homemade":
                    cars[1].showPossibilities();
                    break;
                case "korch":
                    cars[2].showPossibilities();
                    break;
                case "timecar":
                    cars[3].showPossibilities();
                    break;
                case "electroscooter":
                    cars[4].showPossibilities();
                    break;
                case "all":
                    for (int i = 0; i < 5; i++) {
                        cars[i].printInfo();
                    }
                    break;
                case "expo":
                    expo();
                    break;
                default:
                    System.out.println("Try again");
            }
        }
    }
    public String dayIsLike(weekdays day)
    {
        switch (day) {
            case MONDAY:
                return "Monday";
            case TUESDAY:
                return "Tuesday";

            case WEDNESDAY:
                return "Wednesday";

            case THURSDAY:
                return "Thursday";
            case FRIDAY:
                return "Friday";
            case SATURDAY:
                return "Saturday";
            case SUNDAY:
                return "Sunday";
            default:
                System.out.println("stop it it doesnt work.");
                break;
        }
        return null;
    }
    public void expo() {
        System.out.println("Date: "+dateOfExpo+", day of the week: "+dayOfWeek);
    }
}