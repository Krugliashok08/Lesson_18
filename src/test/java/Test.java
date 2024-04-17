import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;

public class Test {

    @org.junit.jupiter.api.Test
    @Description("Addition: 2 + 4 = 6 ")
    @Feature("Calculator")
    @Story("Addition")
    public void additionTest() {
        Assertions.assertEquals(6, 6);
    }

    @org.junit.jupiter.api.Test
    @Description("Subtraction: 5 - 4 = 1 ")
    @Feature("Calculator")
    @Story("Subtraction")
    public void subtractionTest() {
        Assertions.assertEquals(1, 1);
    }

    @org.junit.jupiter.api.Test
    @Description("Multiplication: 3 * 3 = 9 ")
    @Feature("Calculator")
    @Story("Multiplication")
    public void multiplicationTest() {
        Assertions.assertEquals(9, 9);
    }

    @org.junit.jupiter.api.Test
    @Description("Division: 5 : 1 = 5 ")
    @Feature("Calculator")
    @Story("Division")
    public void divisionTest() {
        Assertions.assertEquals(5, 5);
    }
}