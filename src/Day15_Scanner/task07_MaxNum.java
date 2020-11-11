package Day15_Scanner;

import java.util.Scanner;

public class task07_MaxNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number below: ");
        int num1 = sc.nextInt();

        System.out.println("Enter another number below: ");
        int num2 = sc.nextInt();

        System.out.println("Enter final number below: ");
        int num3 = sc.nextInt();

        String result = "";

        if(num1 > num2 && num1 > num3)
            result = "The biggest number from "+num1+", "+num2+", and "+num3+" is "+num1;
        else if (num2 > num1 && num2 > num3)
            result = "The biggest number from "+num1+", "+num2+", and "+num3+" is "+num2;
        else
            result = "The biggest number from "+num1+", "+num2+", and "+num3+" is "+num3;

        System.out.println(result);

    }
}

/*
Ask user to enter three numbers. Print the biggest number from the entered numbers
    Ex:
    Input: 3,6,4
    Output: The biggest number from 3,6, 4 is 6

 */