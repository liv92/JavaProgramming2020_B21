package day07_UnarayOperators;

public class LeapYear {

    public static void main(String[] args) {

        int year1 = 2020, year2 = 2021;

        boolean leapYear1 = year1 % 4 < 1; //checks if year1 is evenly divisible by 4, if the result is less then 1 it is evenly divisible
        boolean leapYear2 = year2 % 4 < 1;

        System.out.println(year1+" is a leap year: "+leapYear1);
        System.out.println(year2+" is a leap year: "+leapYear2);

    }

}

/*
create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
                year = 2020
            output:
                2020 is leap year: true
                year = 2021
            output:
                2021 is leap year: false
        Hint: if the number of year can be evenly divisible by 4, it's known as leap year

 */