public class TestingSystem {
    public static void main(String[] args) throws AnswerIndexOutOfBoundsException {

        TestElement firstTestElement = new TestElement("What is a correct syntax to output \"Hello World\" in Java",
                new String[]{"1. System.out.println(\"Hello World\");", "2. echo(\"Hello World\");", "3. print (\"Hello World\");"},
                1, new ConsoleUserOutput());

        TestElement secondTestElement = new TestElement("Which data type is used to create a variable that should store text?",
                new String[]{"1.string", "2.String", "3.text", "4.Text"},
                2, new FileUserOutput());


        TestBlock firstTestBlock = new TestBlock(new TestElement[]{firstTestElement});
        firstTestBlock.pass();
        secondTestElement.show();
    }
}