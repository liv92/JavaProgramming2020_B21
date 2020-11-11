package day08_ShortHand_Relational;

public class WarmUp {

    public static void main(String[] args) {

        int gallon = 100;
        double liters = gallon * 3.785;
        int result = (int) liters;
        System.out.println(result);

        int kg = 100;
        int lbs = (int) (kg * 2.20462); // put variable data in ( ) to cast the whole variable as an (int)
        System.out.println(lbs);

        int a = 100;
        int b = -a++ + ++a - a-- * a-- % 2;
        //  b = -100 + 102 - 102 * 101 % 2
        //  b = -100 + 102 - 10302 % 2
        //  b = -100 + 102 - 0
        //  b = 2
        System.out.println(b);

        // 2, 4, 8, 16, 32, 64, 124, 256..


    }
}
