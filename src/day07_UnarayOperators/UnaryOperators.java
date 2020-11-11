package day07_UnarayOperators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = -100;
        boolean positive = a > 0; // verify if a is positive
        boolean negative = a < 0; // verify if a is negative

        System.out.println(a+" is positive: "+positive);
        System.out.println(a+" is negative: "+negative);

        //Pre-Increment (Immediately)
        int x = 100;
        ++x; // 101
        System.out.println(x);

        //Pre-Decrement (Immediately)
        int y = 100;
        --y; // 99
        System.out.println(y);

        //Post-Increment (first passes current value, then increases/decreases the value by 1)
        int a2 = 100;
        System.out.println(a2--); // 100
        System.out.println(a2); // 99







    }
}
