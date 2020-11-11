package day08_ShortHand_Relational;

public class Homework_01 {

    public static void main(String[] args) {

        //3
        int a = 10, b = 15;
        String aIs = "a is ", bIs = "b is "; //string for fun
        int temp = a;
            a = b;
            b = temp;

        System.out.println(aIs+a+"\n"+bIs+b);


        //4
        int A = 10, B = 15;

        B -= A; // B = B - A ==> B = 5
        A += B; // A = A + B ==> A = 15
        B += B; // B = B + B ==> B = 10

        a = a + b; // now a is == 25
        b = a - b; // now b is == 10
        a = a - b; // now a is == 15

        System.out.println(aIs+a+"\n"+bIs+b);

    }
}

/*
3. write a program that can two variables' value by using a temporary variable
    Ex:
        a =10;
        b= 15;
    output:
        a is 15
        b is 10
4. write a program that can two variables' value without using a temporary variable
    Ex:
        a =10;
        b= 15;
    output:
        a is 15
        b is 10
        Hint: you will need to use some Arithmetical Operators

 */