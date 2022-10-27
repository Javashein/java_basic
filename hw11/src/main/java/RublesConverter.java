public class RublesConverter implements IConverter {
    @Override
    public String currency(int countCurrency) {
        String declension;
        switch (countCurrency) {
            case 2:
            case 3:
            case 4: declension = "рубля"; break;
            case 1: declension = "рубль"; break;
            default: declension = "рублей";
        }
        return declension;
    }
}
