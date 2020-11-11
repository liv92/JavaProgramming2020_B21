package Day15_Scanner;

import java.util.Scanner;

public class task09_CostCalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price below: ");
        double price = sc.nextDouble();

        System.out.println("Enter quantity below: ");
        int quantity = sc.nextInt();

        double cost = price * quantity;

        if (cost >= 5000)
            System.out.println("Cost: "+(cost * .9)+", Discount: 10%");
        else
            System.out.println("Cost: "+cost+", Discount 0%");

    }
}

/*
Cost can be calculated as the selling price of the product times the quantity sold, i.e. Cost price × quantity.
Write a program that asks the user to enter product price and quantity and then calculate the Cost.
If the Cost is more than 5000 a discount is 10% offered. Program should display the discount and discounted Cost.
    Ex: 100, 3 -> 300 --> Cost: 300, Discount: 0%
    Ex: 100, 60 -> 6000 -> Cost: 5400, Discount: 10%
 */