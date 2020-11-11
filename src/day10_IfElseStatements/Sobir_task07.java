package day10_IfElseStatements;

public class Sobir_task07 {

    public static void main(String[] args) {

        boolean hasDairy = true;
        boolean isSpicy = false;
        if (hasDairy == false && isSpicy == false){
            System.out.println("Can eat this recipe.");
        }else {
            System.out.println("Can not eat this recipe.");
        }
    }
}

/*
Your friend has dairy products intolerance and allergy for spices.
You have to choose a recipe for your birthday party. Does your dish contains:
hasDairy = true/false
isSpicy = true/false
You have to choose to use && or || operator in if/else statement and print out the result
 */