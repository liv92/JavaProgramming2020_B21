package day10_IfElseStatements;

public class Sobir_task02 {

    public static void main(String[] args) {

       double money = 20;
       double hotFood = 7;
       double drink = 4;
       double costOfFood = hotFood * 2 + drink;
       double remainder = money % costOfFood;
        System.out.println(remainder);


    }
}

/*
You have $20. You have to spend it all.
You have to buy 2 dishes of hot food for $7 each 1 bottle of drink for $4 how much money left for candies?
Use % operator to calculate.
 */