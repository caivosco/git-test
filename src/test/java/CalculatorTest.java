import org.junit.jupiter.api.*;
import java.util.logging.Logger;
public class CalculatorTest {

    private static final Logger log = Logger.getLogger(CalculatorTest.class.getName());

    @BeforeAll
    static void setup() {
        log.info("beforeAll executes once before all  test methods in this class");
    }

    @BeforeEach
    void init() {
        log.info("beforeEach executes before each method in this class");
    }

    @DisplayName("single test successful")
    @Test
    void addNumbers() {

        //arrange
        Calculator calculator = new Calculator();

        //act
        int sum = calculator.add(1,3);

        //asset
        Assertions.assertEquals(4, sum);
        log.info("everything is ok");

    }

    @AfterEach
    void tearDown() {
        log.info("afterEach executed after each test method");
    }

    @AfterAll
    static void done() {
        log.info("afterALl executed after all test methods");
    }

}
