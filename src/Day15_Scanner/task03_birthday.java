package Day15_Scanner;

import java.util.Scanner;

public class task03_birthday {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your year of your birthday below: ");
        int year = sc.nextInt();

        System.out.println("Enter month of birthday below: ");
        int month = sc.nextInt();

        System.out.println("Enter day of birthday below: ");
        int day = sc.nextInt();

        System.out.println(month+"/"+day+"/"+year+" is your birthday");

    }
}

/*
Ask the user to enter the year, month number, and day
(pick any datatype for the values) they were born and print in the following format:
    " $month / $day / $year is your birthday "
 */