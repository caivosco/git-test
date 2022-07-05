import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void addNumbers() {

        //arrange
        Calculator calculator = new Calculator();

        //act
        int sum = calculator.add(1,3);

        //asset
        Assertions.assertEquals(4, sum);

    }
    
}
