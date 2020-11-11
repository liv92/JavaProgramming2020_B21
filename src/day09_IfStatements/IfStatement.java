package day09_IfStatements;

public class IfStatement {

    public static void main(String[] args) {

        int number = 201;
        boolean even = number % 2 ==0;
        boolean odd = !even;
        if (even)
            System.out.println(number + " is an even number");
        System.out.println("This is a test");
        if (odd)
            System.out.println(number + " is an odd number");




    }
}
