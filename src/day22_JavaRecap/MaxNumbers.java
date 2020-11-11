package day22_JavaRecap;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

public class MaxNumbers {

    public static void main(String[] args) {
/*
write a program that asks user to enter 5 numbers and returns the maximum number
 */

        Scanner scan = new Scanner(System.in);
        int max = -99999999; // user most likely to enter a number thats greater than -999999, ect.

        for (int i = 1; i <= 5; i++){
            System.out.println("Enter a number: ");
            int n = scan.nextInt();

            if (n > max){
                max = n;
            }
        }
        System.out.println("Maximum number is: "+max);

    }
}
