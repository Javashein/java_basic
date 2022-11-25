package numbertostring;

import java.util.ArrayList;
import java.util.List;

public class IntegerNumberDigit {
    private int number;


    public IntegerNumberDigit(int number) {
       this.number = number;
    }

    public List<NumberDigitsGroupedByDigitClass> getNumberDigitsGroupedByDigitClass() {
        int numberDigit = number;
        List<NumberDigitsGroupedByDigitClass> numberDigitsGroupedByDigitClass = new ArrayList<>();
        NumberDigitsGroupedByDigitClass.DigitClassName digitClassName;
        int index = 0;
        List<Integer> nums = new ArrayList<>();
        List<Integer> digits;

        while (numberDigit != 0) {
            nums.add(numberDigit % 10);
            numberDigit /= 10;
        }

        for(int i = 0; i < nums.size(); i++) {
            digits = new ArrayList<>();
            digitClassName = switch (i) {
                case 0 -> NumberDigitsGroupedByDigitClass.DigitClassName.UNIT;
                case 3 -> NumberDigitsGroupedByDigitClass.DigitClassName.THOUSAND;
                default -> NumberDigitsGroupedByDigitClass.DigitClassName.MILLION;
            };

            while(index < 3 && i < nums.size()) {
                digits.add(index, nums.get(i));
                index++;
                i++;
            }

            NumberDigitsGroupedByDigitClass numberDigitInDigitClass = new NumberDigitsGroupedByDigitClass(digits, digitClassName);
            numberDigitsGroupedByDigitClass.add(numberDigitInDigitClass);
            index = 0;
            i--;
        }
        return numberDigitsGroupedByDigitClass;
    }

    public NumberDigitsGroupedByDigitClass getDigitGroupByDigitClass(List<NumberDigitsGroupedByDigitClass> numberDigitsGroupedByDigitClass, NumberDigitsGroupedByDigitClass.DigitClassName digitClass) {
        for (NumberDigitsGroupedByDigitClass numberDigit : numberDigitsGroupedByDigitClass) {
            if (numberDigit.getDigitClassName() == digitClass) {
                return numberDigit;
            }
        }
        return null;
    }
}
