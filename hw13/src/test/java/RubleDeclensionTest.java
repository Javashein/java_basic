import declension.RubleDeclension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RubleDeclensionTest {
    @Test
    public void testDeclensionWithOneRuble() {
        RubleDeclension rubleDeclension = new RubleDeclension();
        String declensionToString = rubleDeclension.getCurrencyDeclension(1);
        Assertions.assertEquals("рубль", declensionToString);
    }

    @Test
    public void testDeclensionWithTwoRubles() {
        RubleDeclension rubleDeclension = new RubleDeclension();
        String declensionToString = rubleDeclension.getCurrencyDeclension(2);
        Assertions.assertEquals("рубля", declensionToString);
    }

    @Test
    public void testDeclensionWithSomeRubles() {
        RubleDeclension rubleDeclension = new RubleDeclension();
        String declensionToString = rubleDeclension.getCurrencyDeclension(5);
        Assertions.assertEquals("рублей", declensionToString);
    }
}
