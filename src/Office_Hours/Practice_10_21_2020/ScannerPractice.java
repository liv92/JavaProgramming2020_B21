package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for(int i = 1; i <= 50; i++){
            if (i % 3 != 0){
                continue;
            }
            System.out.print(i+" ");
        }
        byte a = 1;
    }
}
