package day23_NestedLoops;

public class BranchingStatement {

    public static void main(String[] args) {

        int numerator = 10;
        int denominator = 0;

        if (denominator == 0){
            System.err.println("Invalid number");
            System.exit(0); // forcefully terminating the program.
        }

        System.out.println(numerator/denominator);

    }
}
