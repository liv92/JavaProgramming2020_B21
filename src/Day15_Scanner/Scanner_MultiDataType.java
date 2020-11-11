package Day15_Scanner;

import java.util.Scanner;

public class Scanner_MultiDataType {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter age below: ");
        byte age = input.nextByte();

        System.out.println("Please enter favorite number below: ");
        long favNumber = input.nextLong();

        System.out.println("Are you a student? True or False: ");
        boolean student = input.nextBoolean();




    }
}
