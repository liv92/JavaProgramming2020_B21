package day04_Variables;

public class EmployeeInfo {

    public static void main(String[] args) {
        /*
         declare the following variables:
                    firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary
            write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = M
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50
             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: M
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false

         */

        String firstName = "John";
        String lastName = "Daniel";
        String fullName = firstName+ lastName;
        String gender = "M";
        int age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120000.50;

        System.out.print("Employee' full name is: ");
        System.out.println(firstName+" "+lastName);

        System.out.print("John Daniel' gender is: ");
        System.out.println(gender);

        System.out.print("John Daniel' age is: ");
        System.out.println(age+" years old");

        System.out.print("John Daniel works at: ");
        System.out.println(companyName);

        System.out.print("John Daniel' Job title is: ");
        System.out.println(jobTitle);

        System.out.print("John Daniel' salary is ");
        System.out.println(salary+" $");

        System.out.print("John Daniel is full time employee: ");
        System.out.println(isFullTime);

        System.out.print("John Daniel is married: ");
        System.out.println(isMarried);

        System.out.println("Employee' full name is: "+firstName+" "+lastName);
        System.out.println("==========================================================");
        System.out.println();

        System.out.println("Employee' full name is: "+fullName);
        System.out.println(fullName+"' age is: "+age+" years old");
        System.out.println(fullName+" works at: "+companyName);
        System.out.println(fullName+"' Job title is: "+jobTitle);
        System.out.println(fullName+"' salary is $"+salary);
        System.out.println(fullName+" is married: "+isMarried);




    }
}
/*
Employee' full name is: John Daniel
                        John Daniel' gender is: M
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false
 */