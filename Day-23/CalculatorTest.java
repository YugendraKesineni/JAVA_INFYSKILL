import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
    
    Calculator calc = new Calculator();

    @Test
    public void testSum(){
        int expected = 3;
        int actual = calc.sum(2,1);

        assertEquals(expected,actual);
    }
}
