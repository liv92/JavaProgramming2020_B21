package Day15_Scanner;

import java.util.Scanner;

public class task02_multiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number below: ");
        int num1 = sc.nextInt();

        System.out.println("Enter another number below: ");
        int num2 = sc.nextInt();

        int result  = num1 * num2;

        System.out.println(num1+" x "+num2+" = "+result);

    }
}

/*
Create a program that will take two int numbers and multiply them. Print in the following way:
    %numOne x %numTwo = %result
    Ex: 3,5 --> 3 x 5 = 15
    Ex: -2,30 --> -2 x 30 = -60

 */