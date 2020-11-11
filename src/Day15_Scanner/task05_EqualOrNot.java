package Day15_Scanner;

import java.util.Scanner;

public class task05_EqualOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number below: ");
        int num1 = sc.nextInt();

        System.out.println("Enter another number below: ");
        int num2 = sc.nextInt();

        String result = "";

        if(num1 == num2)
             result = num1+" and "+num2+ " are equal";
        else
            result = num1+" and "+num2+ " are not equal";

        System.out.println(result);

    }
}

/*
Write a program that will accept two numbers and check if two numbers are equal or not.
 */