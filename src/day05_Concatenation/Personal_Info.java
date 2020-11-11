package day05_Concatenation;

public class Personal_Info {

    public static void main(String[] args) {

      String firstName = "Livio";
      String lastName = "Daljani";
      String fullName = firstName+" "+lastName;
      int age = 28;
      String gender = "Male";
      long phoneNumber = 2155941172l;
      int SSN = 542570511;

        System.out.println("Full name is: "+fullName);
        System.out.println("age is: "+age+" years old");
        System.out.println("gender is: "+gender);
        System.out.println("Phone number is: "+phoneNumber);
        System.out.println("SSN is: "+SSN);



    }
}

/*
 variables: firstName, lastName, fullName, age, gender, phoneNumber, SSN
    output:
            full name is: YourFullName
            age is: YourAge years old
            gender is: YourGender
            Phone Number is: YourPhoneNumber
            SSN is: YourSSN
            please use concatenation, do not use more than 5 print statements
 */