package Classes;

public class ArabicToRomanYearConverter {

    public String arabicToRomanYear(int arabicYear) {
        String[] romanDigit = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] romanYear = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder romanYearSB = new StringBuilder();
        int i = 0;
        while (arabicYear > 0) {
            int count = arabicYear / romanYear[i];
            for (int j = 0; j < count; j++) {
                romanYearSB.append(romanDigit[i]);
                arabicYear -= romanYear[i];
            }
            i++;
        }
        return romanYearSB.toString();
    }
}
