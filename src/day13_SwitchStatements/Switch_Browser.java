package day13_SwitchStatements;

public class Switch_Browser {

    public static void main(String[] args) {

        String browserIs = "chrome";

        switch (browserIs){

            case "chrome": browserIs = "CHROME BROWSER"; break;

            case "firefox": browserIs = "FIREFOX BROWSER"; break;

            case "opera": browserIs = "OPERA BROWSER"; break;

            case "safari": browserIs = "SAFARI BROWSER"; break;

            case "edge": browserIs = "EDGE BROWSER"; break;

            case "ie":  browserIs = "INTERNET EXPLORER BROWSER"; break;

            default: browserIs = "Invalid Browser";

        }

        System.out.println(browserIs);

    }
}
