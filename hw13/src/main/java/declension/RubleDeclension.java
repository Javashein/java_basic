package declension;

import numbertostring.IntegerNumberDigit;
import numbertostring.NumberDigitsGroupedByDigitClass;

public class RubleDeclension implements ICurrencyDeclension {
    @Override
    public String getCurrencyDeclension(int countCurrency) {
        IntegerNumberDigit numberDigitsGroupedByDigitClass = new IntegerNumberDigit(countCurrency);
        NumberDigitsGroupedByDigitClass numberDigitInDigitClass = numberDigitsGroupedByDigitClass.getDigitGroupByDigitClass(NumberDigitsGroupedByDigitClass.DigitClassName.UNIT);
        if (numberDigitInDigitClass.getDigitsSize() > 1 && numberDigitInDigitClass.isTenFromElevenToNineteen()) {
            return "рублей";
        }
        String declension = switch (numberDigitInDigitClass.getUnitDigits()) {
            case 2, 3, 4 -> "рубля";
            case 1 -> "рубль";
            default -> "рублей";
        };
        return declension;
    }
}
