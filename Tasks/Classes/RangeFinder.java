package Classes;

import java.util.ArrayList;
import java.util.List;

public class RangeFinder {

    public static List<String> findRanges(int[] numbers) {
        List<String> ranges = new ArrayList<>();
        if (numbers.length == 0) {
            return ranges;
        }
        int start = numbers[0];
        int end = start;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == end + 1) {
                end = numbers[i];
            } else {
                String range = start == end ? Integer.toString(start) : start + "-" + end;
                ranges.add(range);
                start = numbers[i];
                end = start;
            }
        }
        String range = start == end ? Integer.toString(start) : start + "-" + end;
        ranges.add(range);
        return ranges;
    }

}
