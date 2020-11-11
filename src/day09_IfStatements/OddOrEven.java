package day09_IfStatements;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 1000;
        boolean even = number % 2 == 0; // 1000 is evenly divisible by 2 so it's an even number ==> true statement
        boolean odd = !even; // is NOT even ==> false statement
        System.out.println(number+" is even number "+even); //true
        System.out.println(number+" is odd number "+odd); //false


        int n = 200;
        boolean isPositive = n > 0;
        boolean isNegative = n < 0;
        boolean isZero = !isPositive && !isNegative;
        System.out.println(n+" is positive: "+isPositive); //true
        System.out.println(n+" is negative: "+isNegative); //false
        System.out.println(n+" is zero: "+isZero); //false


        System.out.println(false == !true);
                        // false == false ==> true

        System.out.println(false != true && false == true);
                        // true && true ==> true

        System.out.println(!false != false);
                        // true != false ==> true

        System.out.println(true && true && true && false); // false

        System.out.println(!!true); //true
        System.out.println(!!!false); //true
        System.out.println(!!!!false); //false
        //



    }
}
