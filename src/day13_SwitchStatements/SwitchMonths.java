package day13_SwitchStatements;

public class SwitchMonths {

    public static void main(String[] args) {

        int month = 15;
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
            default: monthIs = "Invalid";
        }

        System.out.println(monthIs);
    }
}
