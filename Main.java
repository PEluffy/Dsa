
import romantoint.romanToInt;

public class Main {

    public static void main(String[] args) {

        romanToInt converter = new romanToInt();
        String roman = "XLII"; // Example input
        System.out.println("The integer value of " + roman + " is: " + converter.convert(roman));
    }
}
