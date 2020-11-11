package day20_ForLoop;

import java.util.Scanner;

public class BreakContinue {


    public static void main(String[] args) {

        for(int i=1; i <= 10; i-- ){ // i: 1, 0
            if( i < 1 ){
                break; // exits the loop immedietly
            }
            System.out.println("Hello Batch 21");
        }


        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("Enter a number");
            int num1 = sc.nextInt();

            System.out.println("Enter a second number");
            int num2 = sc.nextInt();

            System.out.println(num1+" + "+num2+" = "+(num1+num2));

            System.out.println("Would you like to continue? Yes, No");
            String answer = sc.next();

            if (answer.equalsIgnoreCase("no")) {
                break;
            }

        }

    }
}
/*
1. ask used to enter two numbers and then print the sum of those two numbers
2. ask the user, would you like to continue? Yes, No
        if answer is yes -> repeat
        if answer is no -> exit loop
 */
