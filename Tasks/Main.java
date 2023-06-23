import Classes.AdditionStringsNumbers;
import Classes.NextGreaterNumber;
import Classes.RangeFinder;
import Classes.RomanToArabic;
import Classes.ArabicToRomanYearConverter;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Вывод 39 задачи
        NextGreaterNumber num = new NextGreaterNumber(523);
        System.out.println(num.getNextGreaterNumber());

        // Вывод 44 задачи
        AdditionStringsNumbers add = new AdditionStringsNumbers("24", "24");
        System.out.println(add.getAdditionStringsNumbers().toString());

        // Вывод 42 задачи
        int[] numbers = {1, 2, 3, 6, 7, 8, 10};
        RangeFinder rangeFilter = new RangeFinder();
        List<String> ranges = rangeFilter.findRanges(numbers);
        System.out.println(ranges);

        // Вывод 46 задачи
        String roman = "MMXXIII";
        RomanToArabic rtb = new RomanToArabic();
        System.out.println(rtb.romanToArabic(roman));

        // Вывод 45 задачи
        ArabicToRomanYearConverter atryc = new ArabicToRomanYearConverter();
        System.out.println(atryc.arabicToRomanYear(2023));

    }

}
