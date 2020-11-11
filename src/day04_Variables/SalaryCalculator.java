package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        /*
        write a program that can calculate the salary after tax based on the salary and tax rate
            Ex:
                if salary = 100000
                   tax rate = 0.28
                   total tax amount = ?
                   Salary after tax = ?

         */

        int salary = 100000; //first set of data given
        double taxRate = 0.28; //second set of data given

        double taxAmount = salary * taxRate; //from first 2 data points, third data point created
        double salaryAfterTax = salary - taxAmount; //from previous 3 data points, last data point is created and problem is solved.

        System.out.print("Your total tax amount will be: $");
        System.out.println(taxAmount);

        System.out.print("Your salary after tax will be: $");
        System.out.println(salaryAfterTax);




    }

}
