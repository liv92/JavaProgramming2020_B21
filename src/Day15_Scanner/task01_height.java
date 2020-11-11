package Day15_Scanner;

import java.util.Scanner;

public class task01_height {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter height below:");
        double height = sc.nextDouble();

        System.out.println("Please enter shoe size below:");
        byte shoeSize = sc.nextByte();

        System.out.println("Do you like to wear hats? True or False.");
        boolean wearHat = sc.nextBoolean();

        System.out.println("Your height is "+height+" and your shoe size is "+shoeSize+" and you like to wear hats is "+wearHat+".");


    }
}

/*
Ask the user to enter their height (double), shoe size (byte), and if they like to wear hats (boolean).
Print out the information

 */