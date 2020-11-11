package Day15_Scanner;

import java.util.Scanner;

public class task06_SumOfNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number below: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number below: ");
        int num2 = sc.nextInt();

        System.out.println("Enter number below: ");
        int num3 = sc.nextInt();

        int total = (num1 + num2 + num3);

        if(total > 0)
            System.out.println(total);
        else if (num1 + num2 > 0)
            if (num2 + num3 > 0)
                System.out.println();




    }
}

/*
Write a program that ask user to enter 3 numbers and shows the sum of the numbers.
Part 2: Ask the user to enter 3 numbers and calculate the sum of the numbers, but only include positive numbers in the total

 */