package day14_SwitchRecap;

public class DaysInMonth2 {

    public static void main(String[] args) {

        int year = 2021;
        String month = "Feb";
        String result = "";

        switch (month){
            case "Feb": result = (year % 4 == 0) ? "29 days" : "28 days"; break;

            case "April":
            case "June":
            case "Sept":
            case "Nov": result = "30 days"; break; // this is the || logic in switch statement

            case "Jan":
            case "Mar":
            case "May":
            case "July":
            case "August":
            case "Oct":
            case "Dec": result = "31 days"; break;

            default: result = "Invalid";

        }
        System.out.println(result);

    }
}

/*
case: 2 ==> 28 or 29 days
case: 4, 6, 9, 11 ==> days
case: 1, 3, 5, 7, 8, 10, 12
 */