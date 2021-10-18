import org.junit.Assert;
import org.junit.Test;

public class TestCalculate extends Assert {
    @Test
    public int TestCalculateGetInt() {
        Calculate calculate = new Calculate();
        assertEquals(60000, calculate.getInt());
    }

}
