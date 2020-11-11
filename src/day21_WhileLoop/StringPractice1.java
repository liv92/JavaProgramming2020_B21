package day21_WhileLoop;

import java.util.Scanner;

public class StringPractice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine(); //Java

        int lastIndex = word.length()-1;
        char first = word.charAt(0); // J
        char last = word.charAt(lastIndex); //a

        System.out.println(first +""+ last);

        String rq = "Batch " + 2 + 1;
        //           "Batch 2" + 1
        //           "Batch 21"

        System.out.println("======================================================");

        while (true) {

            System.out.println("Enter building number: ");
            String building = scan.next();

            scan.nextLine();

            System.out.println("Enter street name: ");
            String street = scan.nextLine();

            System.out.println("Enter apartment number: ");
            String apartment = scan.next();

            scan.nextLine();

            System.out.println("Enter city name: ");
            String city = scan.nextLine();

            System.out.println("Enter your state: ");
            String state = scan.nextLine();

            System.out.println("Enter zipcode: ");
            int zipCode = scan.nextInt();

            String fullAddress = building + " " + street + ", Apt# " + apartment + "\n" + city + ", " + state + " " + zipCode;

            System.out.println(fullAddress);

            System.out.println("Would you like to continue? Yes or No");
            String answer = scan.next();

            if(answer.equalsIgnoreCase("no")){
                break;
            }

        }




        // String buildingNumber ( next() )
        // String street ( nextLine() )
        // String apartmentNumber ( next() )
        // String city ( nextLine() )
        // String state ( nextLine() )
        // int zipCode ( nextInt() )



    }
}
