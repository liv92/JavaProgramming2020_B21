package Day15_Scanner;

import java.util.Scanner;

public class ScannerInt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number one");
        int numberOne = scanner.nextInt();
        System.out.println("Enter number two");
        int numberTwo = scanner.nextInt();

        System.out.println("Number one is "+numberOne);
        System.out.println("Number two is "+numberTwo);
        System.out.println("Sum is "+ (numberOne + numberTwo));


    }
}
