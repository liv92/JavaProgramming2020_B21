package day22_JavaRecap;

import java.util.Scanner;

public class MinMaxNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483647;
        int min = 2147483647;

        for (int i = 1; i <= 5; i++){
            System.out.println("Enter number");
            int n = scan.nextInt();

            if (n < max){ // if the input is smaller than previous min number
                min = n;
            }else{ // if the input is greater than previous max number
                max = n;
            }
        }

        scan.close();

        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
