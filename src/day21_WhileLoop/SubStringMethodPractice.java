package day21_WhileLoop;

public class SubStringMethodPractice {

    public static void main(String[] args) {
        String email = "Livio_Daljani@Tesla.com";

        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.lastIndexOf("@");

        String lastName = email.substring(0, indexOf_);

        String firstName = email.substring(indexOf_ +1, indexOfAt);

        String domain = email.substring(indexOfAt + 1, email.lastIndexOf("."));

        System.out.println(lastName); // "John"
        System.out.println(firstName); // "Daniel"
        System.out.println(domain); // BOfA

    }
}

/*
lastName_firstName@compamyName.com


 */