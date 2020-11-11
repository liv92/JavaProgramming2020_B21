package day09_IfStatements;

public class Task03_MaximumNumber {

    public static void main(String[] args) {

        int a = 100;
        int b = 300;
        int c = 200;
        boolean aMax = (a > b) && (a > c);
        boolean bMax = (b > a) && (b > c);
        boolean cMax = (c > a) && (c > b);

        if(aMax){
            System.out.println("a is max");
        }

        if(bMax){
            System.out.println("b is max");
        }

        if(cMax){
            System.out.println("c is max");
        }



    }
}

/*
 write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)

 */