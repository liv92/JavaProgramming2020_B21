package day14_SwitchRecap;

public class DaysInMonth3 {

    public static void main(String[] args) {

        int year = 2020;
        int month = 2;
        String monthIs = "";

        switch (month){

            case 1: monthIs = "January"; break;
            case 2: monthIs = "February"; break;
            case 3: monthIs = "March"; break;
            case 4: monthIs = "April"; break;
            case 5: monthIs = "May"; break;
            case 6: monthIs = "June"; break;
            case 7: monthIs = "July"; break;
            case 8: monthIs = "August"; break;
            case 9: monthIs = "September"; break;
            case 10: monthIs = "October"; break;
            case 11: monthIs = "November"; break;
            case 12: monthIs = "December"; break;
        }

        String result = "";

        switch (monthIs){

            case "February": result = (year % 4 == 0) ? "29 days" : "28 days"; break;

            case "April":
            case "June":
            case "September":
            case "November": result = "30 days"; break; // this is the || logic in switch statement

            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December": result = "31 days"; break;
        }

        if (monthIs == "January" || monthIs == "February" || monthIs == "March" || monthIs == "April" || monthIs == "May"
            || monthIs == "June" || monthIs == "July" || monthIs == "August" || monthIs == "September" || monthIs == "October"
            || monthIs == "November" || monthIs == "December"){
            System.out.println(monthIs+" has "+result);
        }else{
            System.out.println("Invalid");
        }

    }

}
