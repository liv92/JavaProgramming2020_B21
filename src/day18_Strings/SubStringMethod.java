package day18_Strings;

import java.util.Scanner;

public class SubStringMethod {

    public static void main(String[] args) {

        String str = "Today is Monday";
        //            0123456789

        String day = str.substring(9, 14+1 );

        System.out.println(day); // Monday


        String email = "cybertek@gmail.com";
        //              0123456789

        String domain = email.substring(9, 14 );

        System.out.println("Domain of the email "+email+" is: "+ domain); // Domain of the email cybertek@gmail.com is: gmail


        String s1 = "I like movies and books";
        //       01234567

        String word1 = s1.substring(7, 12+1);

        System.out.println(word1); // movies

        System.out.println("======================================");

        String firstName = "cYBERtek";

        String firstChar = firstName.substring(0, 1).toUpperCase(); // CYBERtek
        String rest = firstName.substring(1, firstName.length() ).toLowerCase()  ; //Cybertek

        System.out.println(firstChar); // C
        System.out.println(rest); // ybertek

        firstName = firstChar + rest;

        System.out.println(firstName); // Cybertek


        System.out.println("============================================");
    /*
    ask the user to enter first and last names, then print out the full name
            input:
                cYbErTeK
                sCHOOL
            output:
                Cybertek School
     */

        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String f = scan.nextLine();

        f = f.substring(0,1).toUpperCase()  +  f.substring(1, f.length()-1 +1 ).toLowerCase() ;

        System.out.println("Enter your last name: ");
        String l = scan.nextLine();

        l =  l.substring(0, 1).toUpperCase() + l.substring(1, l.length()).toLowerCase();

        System.out.println("first name is: "+f);
        System.out.println("last name is: "+l);

        String fullName = f + " " + l;

        System.out.println("full name is: "+fullName);





    }

}