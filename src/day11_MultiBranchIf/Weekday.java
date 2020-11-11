package day11_MultiBranchIf;

public class Weekday {

    public static void main(String[] args) {

        int dayOfWeek = 5;
        String dayOfWeekIs = " ";

        if (dayOfWeek == 1){
            dayOfWeekIs = "Monday";
        }else if(dayOfWeek == 2){
            dayOfWeekIs = "Tuesday";
        }else if (dayOfWeek == 3){
            dayOfWeekIs = "Wednesday";
        }else if (dayOfWeek == 4){
            dayOfWeekIs = "Thursday";
        }else if (dayOfWeek == 5){
            dayOfWeekIs = "Friday";
        }else if (dayOfWeek == 6){
            dayOfWeekIs = "Saturday";
        }else{
            dayOfWeekIs = "Sunday";
        }
        System.out.println(dayOfWeekIs);
    }
}
