package day12_NestedIf;

public class Muhtar_task02 {

    public static void main(String[] args) {

        /*

         */

        int month = 10;
        String numberOfDays = "";

        if (month >= 1 && month <= 12) {
            if (month == 1) {
                numberOfDays = "31";
            }else if (month == 2) {
                numberOfDays = "28";
            }else if (month == 3) {
                numberOfDays = "31";
            }else if (month == 4) {
                numberOfDays = "30";
            }else if (month == 5) {
                numberOfDays = "31";
            }else if (month == 6) {
                numberOfDays = "30";
            }else if (month == 7) {
                numberOfDays = "31";
            }else if (month == 8) {
                numberOfDays = "31";
            }else if (month == 9) {
                numberOfDays = "30";
            }else if (month == 10) {
                numberOfDays = "31";
            }else if (month == 11) {
                numberOfDays = "30";
            }else if (month == 12) {
                numberOfDays = "31";
            }
        }else{
            numberOfDays = "Invalid";
        }
        System.out.println(numberOfDays);
    }
}

/*
 write a program that can find the number of days in a month
 */