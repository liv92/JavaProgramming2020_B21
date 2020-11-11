package day10_IfElseStatements;

public class IfElseStatement {

    public static void main(String[] args) {

        int number = 100;
        boolean isEven = number % 2 == 0;

        if(isEven){ // for even number
            System.out.println(number+" is even");
        }

        if(!isEven) {
            System.out.println(number + " is odd");

            // ^ is the same as v

            if (isEven) { // for even number
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }
    }
}
