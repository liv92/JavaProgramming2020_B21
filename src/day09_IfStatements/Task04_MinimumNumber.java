package day09_IfStatements;

public class Task04_MinimumNumber {

    public static void main(String[] args) {

        int a = 300, b = 200, c = 100;
        boolean aMin = (a < b) && (a < c), bMin = (b < a) && (b < c), cMin = (c < a) && (c < b);

        if(aMin){
            System.out.println("a is min");
        }

        if(bMin){
            System.out.println("b is min");
        }

        if(cMin){
            System.out.println("c is min");
        }

    }
}

/*
 write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)

 */