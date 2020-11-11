package day10_IfElseStatements;

public class Sobir_task01 {

    public static void main(String[] args) {

        int distance = 50;
        int battery = 40;
        boolean chargingStation = true;
        if (chargingStation || distance < battery){
            System.out.println("Can take trip");
        } else{
            System.out.println("Can not take trip");
        }
    }
}

/*
you have to drive on tesla to the mall and back, parking might or not have charging station.
Use if statement with or operator and print if you can have a trip back.
int distance = 50;
int battery = 40; // how far car can go
boolean charStation = true; // is there charging station
Please print if you can have a trip
 */