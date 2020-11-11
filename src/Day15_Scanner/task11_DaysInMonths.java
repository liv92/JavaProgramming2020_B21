package Day15_Scanner;

import java.util.Scanner;

public class task11_DaysInMonths {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Year below: ");
        int year = sc.nextInt();

        System.out.println("Please enter the Month below: ");
        int month = sc.nextInt();

        String result = "";

        switch (month){
            case 2: if(year % 2 == 0)
                result = "29 days";
            else
                result = "28 days"; break;

            case 1: result = "";
            case 3: result = "";
            case 5: result = "";
            case 7: result = "";
            case 8: result = "";
            case 10: result = "";
            case 12: result = "31 days"; break;

            case 4: result = "";
            case 6: result = "";
            case 9: result = "";
            case 11: result = "30 days"; break;

        }

        System.out.println(result);

    }
}

/*
Recreate the task which tells the user how many days are in a given month (day 13).
Accept a month (number) and year from the console and print how many days are in that specific month.
Handle leap years. Try to redo this ask without looking at the previous code.
 */