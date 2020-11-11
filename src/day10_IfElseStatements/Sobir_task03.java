package day10_IfElseStatements;

public class Sobir_task03 {

    public static void main(String[] args) {

        double distance = 30;
        double bikeSpeedMPH = 20;
        double carSpeedMPH = 40;
        double bikeTimeMinutes = (distance / bikeSpeedMPH) * 60;
        double carTimeMinutes = (distance / carSpeedMPH) * 60;
        boolean bike = bikeTimeMinutes == (distance / bikeSpeedMPH) * 60;
        boolean car = carTimeMinutes == (distance / carSpeedMPH) * 60;
        if (bike){
            System.out.println("It will take "+bikeTimeMinutes+" minutes to get to the trail on bike.");
        }

        if (car){
            System.out.println("It will take "+carTimeMinutes+" minutes to get to the trail with a car.");
        }


    }
}

/*
3) You want to get to hiking place.
Bike speed 20 mi/h, car 40 mi/h, distance 30 mi.
Use if/else statement to calculate time of trip and print out result.
 */