package day07_UnarayOperators;

public class PrimitiveCasting {

    public static void main(String[] args) {

        //implicit casting
        int a = 300;
        double b = a; //casting a smaller data type to the the larger data type. Done automatically.
        System.out.println(b);

        short A = 3000;
        long B = A; //implicit casting, automatically done.
        long l2 = 300; //implicit casting //300L
        System.out.println(A);


        //explicit casting: casting larger type to smaller type. Must be done manually.
        double x = 200.5;
        int y = (int)x; // (int) is the manual part to create the casting
        System.out.println(y);

        long l1 = 100;
        short s1 = (short) l1; //shortcut: option + enter = casting

        short s2 = 400;
        byte b1 = (byte) s2; // -128 <= byte <= 127
        System.out.println(b1); //the value of 400 is out of byte' range, and casting does not change limit of dataType

        long l3 = 100;
        byte b2 = (byte) l3; // 100 is in bytes range, therefore it printed value out "correctly"
        System.out.println(b2);


    }
}
