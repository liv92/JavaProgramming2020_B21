package day11_MultiBranchIf;

public class Month {

    public static void main(String[] args) {

        int month = 2;
        String monthIs = " ";

        if (month == 1){
            monthIs = "January";
        }else if (month == 2){
            monthIs = "February";
        }else if(month == 3){
            monthIs = "March";
        }else if(month == 4){
            monthIs = "April";
        }else if(month == 5){
            monthIs = "May";
        }else if(month == 6){
            monthIs = "June";
        }else if (month == 7){
            monthIs = "July";
        }else if(month == 8){
            monthIs = "August";
        }else if(month == 9){
            monthIs = "September";
        }else if(month == 10){
            monthIs = "October";
        }else if(month == 11){
            monthIs = "November";
        }else{
            monthIs = "December";
        }

        System.out.println(month);

    }
}
