package day12_NestedIf;

public class Muhtar_task04 {

    public static void main(String[] args) {

        String browserNAme = "abz";
        String result = "";

        if(browserNAme == "safari" || browserNAme == "chrome" || browserNAme == "firefox" || browserNAme == "opera") {
            if (browserNAme == "chrome") {
                System.out.println("Chrome Browser is selected");
            }
            if (browserNAme == "firefox") {
                System.out.println("Firefox Browser is selected");
            }
            if (browserNAme == "opera") {
                System.out.println("Opera Browser is selected");
            }
            if (browserNAme == "safari") {
                System.out.println("Safari Browser is selected");
            }
        }else{
            System.out.println("Invalid Browser Name");
        }

    }
}

/*
write a program that can display the selected browser
                1. declear a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
             Ex:
                browserName = "chrome";
                output:
                    Chrome Browser is Selected
                browserName =   "cybertek";
                output:
                    Invalid Browser Name

 */