package romantoint;

import java.util.HashMap;
import java.util.Map;

public class romanToInt {

    Map<String, Integer> romanNumerals;

    public romanToInt() {
        romanNumerals = new HashMap<>();
        romanNumerals.put("I", 1);
        romanNumerals.put("IV", 4);
        romanNumerals.put("V", 5);
        romanNumerals.put("IX", 9);
        romanNumerals.put("X", 10);
        romanNumerals.put("XL", 40);
        romanNumerals.put("L", 50);
        romanNumerals.put("XC", 90);
        romanNumerals.put("C", 100);
        romanNumerals.put("CD", 400);
        romanNumerals.put("D", 500);
        romanNumerals.put("CM", 900);
        romanNumerals.put("M", 1000);
    }

    public int convert(String roman) {
        int result = 0;
        int preValue = Integer.MAX_VALUE;
        char preChar = 'a';
        String s;

        char[] ch = roman.toCharArray();
        for (char c : ch) {
            int currentValue = romanNumerals.get(String.valueOf(c));
            if (currentValue <= preValue) {
                result += currentValue;
            } else {
                result -= preValue;
                s = String.valueOf(preChar) + String.valueOf(c);
                System.out.println(s);
                currentValue = romanNumerals.get(s);
                result += currentValue;
            }
            preValue = currentValue;
            preChar = c;
        }
        return result;
    }

}
