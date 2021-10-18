import org.junit.Assert;
import org.junit.Test;

public class TestCalculate extends Assert {
    @Test
    public void TestCalculateGetInt() {
        Calculate calculate = new Calculate();
        assertEquals(60000, calculate.getInt());
    }

    public void TestCalcEmployeeSalary() {
        Calculate calculate = new Calculate();
        assertEquals(52200, calculate.CalcEmployeeSalary(60000, 13));
    }

}
