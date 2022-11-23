package numbertostring;

import java.util.ArrayList;
import java.util.List;

public class IntegerNumberDigit {
    List<NumberDigitsGroupedByDigitClass> numberDigitsGroupedByDigitClass = new ArrayList<>();

    public IntegerNumberDigit(int number) {
        int numberDigit = number;
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
    }

    public List<NumberDigitsGroupedByDigitClass> getNumberDigitsGroupedByDigitClass() {
        return numberDigitsGroupedByDigitClass;
    }

    public NumberDigitsGroupedByDigitClass getDigitGroupByDigitClass(NumberDigitsGroupedByDigitClass.DigitClassName digitClass) {
        for (NumberDigitsGroupedByDigitClass numberDigit : numberDigitsGroupedByDigitClass) {
            if (numberDigit.getDigitClassName() == digitClass) {
                return numberDigit;
            }
        }
        return null;
    }
}
