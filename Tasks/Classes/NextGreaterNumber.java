package Classes;

public class NextGreaterNumber {

    public int number;

    public int getNextGreaterNumber() {

        char[] digits = String.valueOf(this.number).toCharArray();

        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        if (i < 0) {
            return -1;
        }

        int j = digits.length - 1;
        while (j >= 0 && digits[j] <= digits[i]) {
            j--;
        }

        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        int start = i + 1;
        int end = digits.length - 1;
        while (start < end) {
            temp = digits[start];
            digits[start] = digits[end];
            digits[end] = temp;
            start++;
            end--;
        }

        int nextGreaterNumber = Integer.parseInt(new String(digits));
        return nextGreaterNumber;
    }

    public NextGreaterNumber() {}

    public NextGreaterNumber(int number) {
        this.number = number;
    }

}