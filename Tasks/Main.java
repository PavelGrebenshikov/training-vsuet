import Classes.AdditionStringsNumbers;
import Classes.NextGreaterNumber;
import Classes.RangeFinder;

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

    }

}
