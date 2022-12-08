package numbertostring;

import java.util.List;

public class NumberDigitsGroupedByDigitClass {
    private List<Integer> digits ;
    private DigitClassName digitClassName;
    public enum DigitClassName {UNIT, THOUSAND, MILLION}

    public NumberDigitsGroupedByDigitClass(List<Integer> digits, DigitClassName digitClass) {
        this.digits = digits;
        this.digitClassName = digitClass;
    }

    public boolean areAllDigitsZero() {
       long countZeroDigits = digits.stream().filter(i -> i.equals(0)).count();
        return countZeroDigits == digits.size() ? true : false;
    }

    public DigitClassName getDigitClassName() {
        return digitClassName;
    }

    public boolean isTenFromElevenToNineteen() {
        return (getTenDigits() == 1 && (getUnitDigits() != 0)) ? true : false;
    }

    public boolean isTenRound() {
        return (getUnitDigits() == 0) ? true : false;
    }

    public boolean isHundredRound() {
        return (getTenDigits() == 0 && getUnitDigits() == 0) ? true : false;
    }

    public int getUnitDigits() {
        if (digits.size() > 0) {
            return digits.get(0);
        }
        else return -1;
    }

    public int getTenDigits() {
        if (digits.size() > 1) {
            return digits.get(1);
        }
        else return -1;
    }

    public int getHundredDigits() {
        if (digits.size() > 2) {
            return digits.get(2);
        }
        else return -1;
    }

    public int getDigitsSize() {
        return digits.size();
    }

    public boolean isDigitClassContainingUnit() {
        if (getDigitsSize() == 1 && getUnitDigits() != 0)
            return true;
        if (getDigitsSize() > 1 && getUnitDigits() != 0 && getTenDigits() != 1) {
            return true;
        }
        return false;
    }

    public boolean isDigitClassContainingTen() {
       return (getDigitsSize() > 1 && getTenDigits() != 0) ? true : false;
    }

    public boolean isDigitClassContainingHundred() {
        return (getDigitsSize() > 2 && getHundredDigits() != 0) ? true : false;
    }
}
