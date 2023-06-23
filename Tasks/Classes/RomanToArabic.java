package Classes;

import java.util.HashMap;
import java.util.Map;

public class RomanToArabic {

    public int romanToArabic(String roman) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        int prev = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int current = map.get(roman.charAt(i));
            if (current < prev) {
                sum -= current;
            } else {
                sum += current;
            }
            prev = current;
        }
        return sum;
    }
}