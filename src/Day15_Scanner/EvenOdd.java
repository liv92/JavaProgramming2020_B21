package Day15_Scanner;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int numberOne = scanner.nextInt();

        if(numberOne % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
