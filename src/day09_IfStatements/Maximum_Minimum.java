package day09_IfStatements;

public class Maximum_Minimum {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;

        boolean n1IsMax = n1 > n2; // false
        boolean n2IsMax = n2 > n1; // true
        boolean equal = !n1IsMax && !n2IsMax; // n1 == n2; // false

        if(n1IsMax){
            System.out.println(n1+" is maximum"); // false
        }

        if(n2IsMax){
            System.out.println(n2+" is maximum"); // only true statement, so this IF statement will print.
        }

        if(equal){
            System.out.println(equal+" is equal"); // false
        }

    }
}
