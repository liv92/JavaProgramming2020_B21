package day14_SwitchRecap;

public class DaysInMonth {

    public static void main(String[] args) {

        int year = 2020;
        String month = "Feb";
        String result = "";

        switch (month){
            case "Jan": result = "31"; break;

            case "Feb": result = (year % 4 == 0) ? "29 days" : "28 days"; break;

            case "Mar": result = "31 days"; break;

            case "April": result = "30 days"; break;

            case "May": result = "31 days"; break;

            case "June": result = "30 days"; break;

            case "July": result = "31 days"; break;

            case "August": result = "31 days"; break;

            case "September": result = "30 days"; break;

            case "October": result = "31 days"; break;

            case "November": result = "30 days"; break;

            case "December": result = "31 days"; break;

            default: result = "Invalid";

        }
        System.out.println(result);

    }
}
