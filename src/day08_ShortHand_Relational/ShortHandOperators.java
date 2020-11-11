package day08_ShortHand_Relational;

public class ShortHandOperators {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(a); // current value is 10
        a = 30; // value has been reassigned to 30 now. (java executes from top to bottom.)
        System.out.println(a); // current value is now 30

        String schoolName = "Cybertek";
        schoolName = "PennState";

        int x = 100;
        x -= 62; // x = x - 62; ==> 38

        double salary = 100000; // 0.28 tax rate
        salary -= (salary * 0.28);
        System.out.println(salary); //72000


        String name = "Cybertek ";
        name += "School ";
        System.out.println(name); //Cybertek School


        double totalTax = 100000;
                totalTax *= 0.28; //totalTax = 100000 * 0.28 = 28000
        System.out.println(totalTax);


        int bonus = 5000;
            bonus *= 2+1; // bonus = 5000 * 3 = 15000
        System.out.println(bonus);


        int house = 500000;
        int month = 240;
        double monthlyPayment = 500000;
            monthlyPayment /= month;
        System.out.println(monthlyPayment);


        int A = 2000;
            A %= 2; // a = 2000 / 0 ==> 0 remainder



        int X = 100;
        boolean isEven = x % 2 == 0; //100 is evenly divisible by 2 // Even number identifies if divisible with no remainder





    }
}
