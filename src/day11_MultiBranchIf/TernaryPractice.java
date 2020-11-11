package day11_MultiBranchIf;

public class TernaryPractice {

    public static void main(String[] args) {

        int n = 100;
        String result1 = " ";

        if(n % 2 == 0){
            result1 = "Even";
        }else{
            result1 = "Odd";
        }

        System.out.println(result1);
        System.out.println("================================================");

        String result2 = (n % 2 == 0) ? "Even" : "Odd"; //same as above if/else statement, this is called Ternary
        System.out.println(result2);
        System.out.println("=================================================");

        int age = 25;
        String citizenship = "USA";

        String eligible = (age >= 18 && citizenship == "USA") ? "Eligible to Vote" : "Is not eligible to vote";
        System.out.println(eligible);
        System.out.println("==================================================");

        int personAge = 18;

        String buyAlcohol = (personAge >= 21) ? "Eligible to buy Alc" : "Not eligible to buy Alc";
        System.out.println(buyAlcohol);
        System.out.println("==================================================");

        int number = 1000;
        String s1 = " ";

        if (number > 0){
            s1 = "Positive";
        }else if(number < 0){
            s1 = "Negative";
        }else{
            s1 = "Zero";
        }

        String s2 = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";


    }
}
