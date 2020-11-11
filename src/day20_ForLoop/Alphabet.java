package day20_ForLoop;

public class Alphabet {

    public static void main(String[] args) {

        for ( char i = 65; i < 91; i++ ){
            System.out.print(i+" ");
        }

        System.out.println();

        for (int i = 97; i < 123; i++){
            System.out.print((char)i+" ");
        }

        System.out.println();

        for (char i = 'A'; i <= 'Z'; i++ ){
            System.out.print(i+" ");
        }

        System.out.println("");
        System.out.println("=====");

        for (char ii = 90; ii >= 65; ii--){
            System.out.print(ii+" ");
        }

        System.out.println();

        for (int i = 122; i > 96; i-- ){
            System.out.print((char)i+" ");
        }

        System.out.println();

        for (char i = 'Z'; i >= 'A'; i-- ){
            System.out.print(i+" ");
        }

    }
}


/*
1. Write a program that will print out all alphabet letters
2. Write a program that will print out all alphabet letters in backwards
 */