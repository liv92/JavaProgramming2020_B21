package day06_ArithmeticOperators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double salary = 168000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary is: $" + salary);
        System.out.println("YOur State Tax: $" + stateTax);
        System.out.println("Your federal tax: $" + federalTax);
        System.out.println("Your tax total: $" + totalTax);
        System.out.println("Your salary after tax is: $" + salaryAfterTax);

    }
}
/*
variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
                100000    0.08         0.21
    output:
        Your salary is: YourSalary
        Your State Tax: YourStateTax
        Your federal Tax: federalTax
        your total tax: TotalTax
        your salary after tax: YourSalaryAfterTax

 */