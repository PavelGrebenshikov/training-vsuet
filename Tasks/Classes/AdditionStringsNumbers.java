package Classes;

public class AdditionStringsNumbers {

    public String firstNumber;
    public String secondNumber;

    public String getAdditionStringsNumbers() {

        int convertFist = Integer.parseInt(this.firstNumber);
        int convertSecondNumber = Integer.parseInt(this.secondNumber);

        int sum = convertFist + convertSecondNumber;

        String result = Integer.toString(sum);

        return result;

    }

    public AdditionStringsNumbers() {}

    public AdditionStringsNumbers(String firstNumber, String secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


}
