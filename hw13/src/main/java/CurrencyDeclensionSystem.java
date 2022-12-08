import declension.ICurrencyDeclension;
import declension.RubleDeclension;
import input.ConsoleUserInput;
import input.IUserInput;
import numbertostring.INumberToStringConverter;
import numbertostring.RussianNumberToStringConverter;
import output.ConsoleUserOutput;
import output.IUserOutput;

public class CurrencyDeclensionSystem {
    private IUserInput userInput = new ConsoleUserInput();
    private IUserOutput userOutput = new ConsoleUserOutput();
    private ICurrencyDeclension currencyDeclension = new RubleDeclension();
    private INumberToStringConverter numberToStringConverter = new RussianNumberToStringConverter();

    public void run() {
        while (true) {
            userOutput.print("Ввод с консоли:");
            while (!userInput.isReadInt()) {
                userInput.readString();
                userOutput.print("Введите число!");
            }
            int countOfCurrency = userInput.readInt();
            userOutput.print("Вывод программы: " + numberToStringConverter.convertNumberToString(countOfCurrency) + " " + currencyDeclension.getCurrencyDeclension(countOfCurrency));
        }
    }
}
