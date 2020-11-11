package day11_MultiBranchIf;

public class MaxMinNumber2_Ternary {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;
        int n3 = 300;

        int max1 = 0;

        if(n1 > n2 && n1 > n3){
            max1 = n1;
        }else if(n2 > n1 && n2 > n3){
            max1 = n2;
        }else{
            max1 = n3;
        }
        System.out.println(max1); // 300

        // Above using if/else statement
        // Below using Ternary (same result as above)

        int max2 = (n1 > n2 && n1 > n3) ? n1 : (n2 > n1 && n2 > n3) ? n2 :n3;
        System.out.println(max2); // 300

    }
}
