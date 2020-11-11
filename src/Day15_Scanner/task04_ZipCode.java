package Day15_Scanner;

import java.util.Scanner;

public class task04_ZipCode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter zip code below: ");
        long zip = sc.nextLong();

        System.out.println("Enter number of people you live with below: ");
        byte people = sc.nextByte();

        System.out.println("Are you married? Enter True below if married and False if not: ");
        boolean married = sc.nextBoolean();

        String isMarried = "";

        if(married)
            isMarried = "married";
        else
            isMarried = "not married";

        System.out.println("I see you are "+isMarried+" and live with "+people+" people in your house which is in the "+zip+" area!");

    }
}

/*
 Ask the user to enter their zipcode (long), the number of people they live with (byte),
 if they are married or not (boolean - true for married/false for not) and print the values in the following format:
 "I see you are $marriedOrNot! and live with $peopleNum people in your house which is in the $zipcode area! "
 */