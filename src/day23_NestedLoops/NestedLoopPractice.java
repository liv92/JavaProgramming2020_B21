package day23_NestedLoops;

public class NestedLoopPractice {

    public static void main(String[] args) {

        for(int j = 1; j <= 8; j++){

            for(int i = 1; i <= j; i++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
