package numbertostring;

import java.util.Collections;
import java.util.List;

public class RussianNumberToStringConverter implements INumberToStringConverter {
    private static final String[] units = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять", "десять"};
    private static final String[] tensStartWithOne = {"", "одиннадцать", "двенадцать", "тринадцать", "четынадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    private static final String[] tens = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто", "восемьнадцать", "девятнадцать"};
    private static final String[] hundreds = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
    private static final String[] thousands = {"тысяча", "тысячи", "тысяч"};
    private static final String[] millions = {"миллион", "миллиона", "миллионов"};
    private static final String[] leword = {"одна", "две"};
    private String numberToString = null;
    private NumberDigitsGroupedByDigitClass numberDigitsInGroupDigitClass;

    @Override
    public String convertNumberToString(int number) {
        String digitClassToString = null;
        IntegerNumberDigit numberDigitsGroupedByDigitClass = new IntegerNumberDigit(number);
        List<NumberDigitsGroupedByDigitClass> numberDigitInDigitClasses = numberDigitsGroupedByDigitClass.getNumberDigitsGroupedByDigitClass();
        Collections.reverse(numberDigitInDigitClasses);
        for (int i = 0; i < numberDigitInDigitClasses.size() &&  !(numberDigitInDigitClasses.get(i).areAllDigitsZero()); i++) {
            if (i != 0) {
                digitClassToString = numberToString;
            }
            numberToString = convertDigitClazzToString(numberDigitInDigitClasses.get(i));
            if (i != 0) {
                numberToString = digitClassToString + " " + numberToString;
            }
        }
        return numberToString;
    }

    private String convertUnitDigitToString() {
        int unitDigit = numberDigitsInGroupDigitClass.getUnitDigits();
        if (numberDigitsInGroupDigitClass.getDigitClassName() == NumberDigitsGroupedByDigitClass.DigitClassName.THOUSAND) {
            numberToString = switch (unitDigit) {
                case 1 -> leword[0] + " " + thousands[0];
                case 2 -> leword[1] + " " + thousands[1];
                case 3, 4 -> units[unitDigit] + " " + thousands[1];
                default -> units[unitDigit] + " " + thousands[2];
            };
            return numberToString;
        }

        if (numberDigitsInGroupDigitClass.getDigitClassName() == NumberDigitsGroupedByDigitClass.DigitClassName.MILLION) {
            numberToString = switch (unitDigit) {
                case 1 -> millions[0];
                case 2, 3, 4 -> millions[1];
                default -> millions[2];
            };
            return units[unitDigit] + " " +  numberToString;
        }
        return units[unitDigit];
    }

    private String convertTenDigitToString() {
        int unitDigit = numberDigitsInGroupDigitClass.getUnitDigits();
        int tenDigit = numberDigitsInGroupDigitClass.getTenDigits();
        if (numberDigitsInGroupDigitClass.isTenRound()) {
            numberToString = tens[tenDigit];
        } else  {
            numberToString = tens[tenDigit] + " " + convertUnitDigitToString();
        }
        if (numberDigitsInGroupDigitClass.isTenFromElevenToNineteen()) {
            numberToString = convertFromElevenToNineteenDigitToString(unitDigit);
        }
        if (!numberDigitsInGroupDigitClass.isDigitClassContainingUnit()) {
            numberToString += addDigitWord();
        }
        return numberToString;
    }

    private String convertHundredDigitToString() {
        int hundredDigit = numberDigitsInGroupDigitClass.getHundredDigits();
        if (numberDigitsInGroupDigitClass.isHundredRound()) {
            numberToString = hundreds[hundredDigit] + addDigitWord();
        } else  {
            numberToString = hundreds[hundredDigit] + " " + numberToString;
        }
        return numberToString;
    }

    private String convertFromElevenToNineteenDigitToString(int unitDigit) {
        return tensStartWithOne[unitDigit];
    }

    private String addDigitWord() {
        String digitName = "";
        if (numberDigitsInGroupDigitClass.getDigitClassName() == NumberDigitsGroupedByDigitClass.DigitClassName.THOUSAND) {
            digitName = " " + thousands[2];
        }
        if (numberDigitsInGroupDigitClass.getDigitClassName() == NumberDigitsGroupedByDigitClass.DigitClassName.MILLION) {
            digitName = " " + millions[2];
        }
        return digitName;
    }

    private String convertDigitClazzToString(NumberDigitsGroupedByDigitClass numberDigitInDigitClass) {
        numberDigitsInGroupDigitClass = numberDigitInDigitClass;
        if (numberDigitsInGroupDigitClass.isDigitClassContainingUnit()) {
            numberToString = convertUnitDigitToString();
        }
        if (numberDigitsInGroupDigitClass.isDigitClassContainingTen()) {
            numberToString = convertTenDigitToString();
        }
        if (numberDigitsInGroupDigitClass.isDigitClassContainingHundred()) {
            numberToString = convertHundredDigitToString();
        }
        return numberToString;
    }
}
