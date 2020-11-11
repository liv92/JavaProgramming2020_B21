package day07_UnarayOperators;

public class Divisibility {

    public static void main(String[] args) {

        int number1 = 30;
        boolean divisibleBy2 = number1 % 2 < 1;
        boolean divisibleBy3 = number1 % 3 == 0;
        boolean divisibleBy5 = number1 % 5 < 1;

        System.out.println(number1+" is divisible by 2: "+divisibleBy2);
        System.out.println(number1+" is divisible by 3: "+divisibleBy3);
        System.out.println(number1+" is divisible by 5: "+divisibleBy5);

        System.out.println(119 % 5);


    }
}

/*
Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;  ==> int
                divisibleBy2 ==> true/false
                divisibleBy3 ==> true/false
                divisbileBy5 ==> true/false
            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                number = 80;
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true
 */