import numbertostring.RussianNumberToStringConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RussianNumberToStringTest {
    @Test
    public void testNumberWithUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(7);
        Assertions.assertEquals("семь", numberToString);
    }

    @Test
    public void testNumberWithRoundTenDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(20);
        Assertions.assertEquals("двадцать", numberToString);
    }

    @Test
    public void testNumberWithTenDigitFromElevenToNineteen() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(11);
        Assertions.assertEquals("одиннадцать", numberToString);
    }

    @Test
    public void testNumberWithTenDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(23);
        Assertions.assertEquals("двадцать три", numberToString);
    }

    @Test
    public void testNumberWithRoundHundredDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(300);
        Assertions.assertEquals("триста", numberToString);
    }

    @Test
    public void testNumberWithHundredDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(405);
        Assertions.assertEquals("четыреста пять", numberToString);
    }

    @Test
    public void testNumberWithHundredDigitPlusRoundTenDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(570);
        Assertions.assertEquals("пятьсот семьдесят", numberToString);
    }

    @Test
    public void testNumberWithHundredDigitPlusTenDigitFromElevenToNineteen() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(517);
        Assertions.assertEquals("пятьсот семнадцать", numberToString);
    }

    @Test
    public void testNumberWithHundredDigitPlusTenDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(895);
        Assertions.assertEquals("восемьсот девяносто пять", numberToString);
    }

    @Test
    public void testNumberWithOneThousandDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(1000);
        Assertions.assertEquals("одна тысяча", numberToString);
    }

    @Test
    public void testNumberWithTwoThousandDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(2000);
        Assertions.assertEquals("две тысячи", numberToString);
    }

    @Test
    public void testNumberWithThreeThousandDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(3000);
        Assertions.assertEquals("три тысячи", numberToString);
    }

    @Test
    public void testNumberWithSomeThousandDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(5000);
        Assertions.assertEquals("пять тысяч", numberToString);
    }

    @Test
    public void testNumberWithRoundThousandDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(9000);
        Assertions.assertEquals("девять тысяч", numberToString);
    }

    @Test
    public void testNumberWithUnitThousandDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(1001);
        Assertions.assertEquals("одна тысяча один", numberToString);
    }

    @Test
    public void testNumberWithUnitThousandDigitPlusRoundTenDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(4010);
        Assertions.assertEquals("четыре тысячи десять", numberToString);
    }

    @Test
    public void testNumberWithUnitThousandDigitPlusTenDigitFromElevenToNineteen() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(7011);
        Assertions.assertEquals("семь тысяч одиннадцать", numberToString);
    }

    @Test
    public void testNumberWithUnitThousandDigitPlusTenDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(7021);
        Assertions.assertEquals("семь тысяч двадцать один", numberToString);
    }

    @Test
    public void testNumberWithUnitThousandDigitPlusRoundHundredDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(5200);
        Assertions.assertEquals("пять тысяч двести", numberToString);
    }

    @Test
    public void testNumberWithUnitThousandDigitPlusHundredDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(5209);
        Assertions.assertEquals("пять тысяч двести девять", numberToString);
    }

    @Test
    public void testNumberWithUnitThousandDigitPlusHundredPlusRoundTenDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(1110);
        Assertions.assertEquals("одна тысяча сто десять", numberToString);
    }

    @Test
    public void testNumberWithUnitThousandDigitPlusHundredPlusTenDigitFromElevenToNineteenDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(4111);
        Assertions.assertEquals("четыре тысячи сто одиннадцать", numberToString);
    }

    @Test
    public void testNumberWithUnitThousandDigitPlusHundredPlusTenDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(2999);
        Assertions.assertEquals("две тысячи девятьсот девяносто девять", numberToString);
    }

    @Test
    public void testNumberWithRoundUnitThousandDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(9000);
        Assertions.assertEquals("девять тысяч", numberToString);
    }

    @Test
    public void testNumberWithRoundTenThousandDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(10_000);
        Assertions.assertEquals("десять тысяч", numberToString);
    }

    @Test
    public void testNumberTenThousandDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(10_001);
        Assertions.assertEquals("десять тысяч один", numberToString);
    }

    @Test
    public void testNumberTenThousandDigitPlusRoundTenDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(10_010);
        Assertions.assertEquals("десять тысяч десять", numberToString);
    }

    @Test
    public void testNumberTenThousandDigitPlusTenDigitFromElevenToNineteenDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(50_011);
        Assertions.assertEquals("пятьдесят тысяч одиннадцать", numberToString);
    }

    @Test
    public void testNumberTenThousandDigitPlusTenDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(50_081);
        Assertions.assertEquals("пятьдесят тысяч восемьдесят один", numberToString);
    }

    @Test
    public void testNumberTenThousandDigitPlusRoundHundredDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(50_100);
        Assertions.assertEquals("пятьдесят тысяч сто", numberToString);
    }

    @Test
    public void testNumberTenThousandHundredDigitPlusHundredDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(50_103);
        Assertions.assertEquals("пятьдесят тысяч сто три", numberToString);
    }

    @Test
    public void testNumberTenThousandPlusHundredDigitPlusTenDigitFromElevenToNineteen() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(50_218);
        Assertions.assertEquals("пятьдесят тысяч двести восемнадцать", numberToString);
    }

    @Test
    public void testNumberTenThousandDigitPlusOneThousandDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(51_000);
        Assertions.assertEquals("пятьдесят одна тысяча", numberToString);
    }

    @Test
    public void testNumberTenThousandDigitPlusOneThousandDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(52_001);
        Assertions.assertEquals("пятьдесят две тысячи один", numberToString);
    }

    @Test
    public void testNumberTenThousandDigitPlusOneThousandPlusTenDigitFromElevenToNineteen() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(51_011);
        Assertions.assertEquals("пятьдесят одна тысяча одиннадцать", numberToString);
    }

    @Test
    public void testNumberTenThousandDigitPlusOneThousandPlusTenDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(53_055);
        Assertions.assertEquals("пятьдесят три тысячи пятьдесят пять", numberToString);
    }

    @Test
    public void testNumberTenThousandDigitPlusOneThousandPlusRoundHundredDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(74_200);
        Assertions.assertEquals("семьдесят четыре тысячи двести", numberToString);
    }

    @Test
    public void testNumberTenThousandDigitPlusOneThousandPlusRoundHundredDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(75_205);
        Assertions.assertEquals("семьдесят пять тысяч двести пять", numberToString);
    }

    @Test
    public void testNumberTenThousandDigitPlusOneThousandPlusRoundHundredDigitPlusRoundTenDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(75_820);
        Assertions.assertEquals("семьдесят пять тысяч восемьсот двадцать", numberToString);
    }

    @Test
    public void testNumberTenThousandDigitPlusOneThousandPlusRoundHundredDigitPlusFromElevenToNineteen() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(75_818);
        Assertions.assertEquals("семьдесят пять тысяч восемьсот восемнадцать", numberToString);
    }

    @Test
    public void testNumberTenThousandDigitPlusOneThousandPlusRoundHundredDigitPlusTenDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(75_877);
        Assertions.assertEquals("семьдесят пять тысяч восемьсот семьдесят семь", numberToString);
    }

    @Test
    public void testNumberWithRoundHundredThousandDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(100_000);
        Assertions.assertEquals("сто тысяч", numberToString);
    }

    @Test
    public void testNumberWithHundredThousandDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(200_004);
        Assertions.assertEquals("двести тысяч четыре", numberToString);
    }

    @Test
    public void testNumberWithHundredThousandDigitPlusRoundTenDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(100_090);
        Assertions.assertEquals("сто тысяч девяносто", numberToString);
    }

    @Test
    public void testNumberWithHundredThousandDigitPlusRoundTenDigitFromElevenToNineteen() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(100_015);
        Assertions.assertEquals("сто тысяч пятнадцать", numberToString);
    }

    @Test
    public void testNumberWithHundredThousandPlusRoundHundredDigitPlusTenDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(192_285);
        Assertions.assertEquals("сто девяносто две тысячи двести восемьдесят пять", numberToString);
    }

    @Test
    public void testNumberWithOneMillionDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(1_102_205);
        Assertions.assertEquals("один миллион сто две тысячи двести пять", numberToString);
    }

    @Test
    public void testNumberWithTwoMillionDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(2_102_205);
        Assertions.assertEquals("два миллиона сто две тысячи двести пять", numberToString);
    }

    @Test
    public void testNumberWithTenMillionDigitPlusHundredThousandPlusUnitDigitPlusHundredDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(23_102_205);
        Assertions.assertEquals("двадцать три миллиона сто две тысячи двести пять", numberToString);
    }

    @Test
    public void testNumberWithHundredMillionDigitPlusHundredThousandPlusUnitDigitPlusHundredDigitPlusUnitDigit() {
        RussianNumberToStringConverter russianNumberToStringConverter = new RussianNumberToStringConverter();
        String numberToString = russianNumberToStringConverter.convertNumberToString(525_102_205);
        Assertions.assertEquals("пятьсот двадцать пять миллионов сто две тысячи двести пять", numberToString);
    }
}
