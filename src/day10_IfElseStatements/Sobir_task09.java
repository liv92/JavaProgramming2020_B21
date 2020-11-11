package day10_IfElseStatements;

public class Sobir_task09 {

    public static void main(String[] args) {

        boolean boughtIceCream = false;
        boolean boughtCake = !boughtIceCream;
        if (boughtCake || boughtIceCream){
            System.out.println("Happy");
        }else{
            System.out.println("Unhappy");
        }
    }
}

/*
Your kids will be happy if either of condition is met:
boughtIcecream = true/false
boughtCacke = has to be opposite
You have to choose to use && or || operator in if/else statement and print out the result
 */