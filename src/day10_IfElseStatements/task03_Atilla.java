package day10_IfElseStatements;

public class task03_Atilla {

    public static void main(String[] args) {

        int numberOfBedrooms = 3;

        boolean oneBedroom = numberOfBedrooms == 1;
        boolean twoBedroom = numberOfBedrooms == 2 && !oneBedroom;
        boolean threeBedroom = numberOfBedrooms == 3 && !oneBedroom && !twoBedroom;

        if (oneBedroom){
            System.out.println("One bedroom selected, total price is $1,100");
        }
        if (twoBedroom){
            System.out.println("Two bedroom selected, total price is $1,850");
        }
        if (threeBedroom){
            System.out.println("Three bedroom selected, total is $2,550");
        }

    }
}
/*
In this assignment, you will write program for Leasing office.
Declare numberOfBedrooms variable and assign value.
Use multi way If statement create this program.
If 1 is assigned, print one bedroom selected, total price is $1100;
If 2 is assigned, print one bedroom selected, total price is $1850;
If 3 is assigned, print one bedroom selected, total price is $2550;
Note: All other inputs should print: No such Bedrooms available
 */