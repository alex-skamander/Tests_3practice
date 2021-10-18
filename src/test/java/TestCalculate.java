import org.junit.Assert;
import org.junit.Test;

public class TestCalculate extends Assert {
    @Test
    public void TestCalculateGetInt() {
        Calculate calculate = new Calculate();
        assertEquals(60000, calculate.getInt());
    }

    @Test
    public void TestCalcEmployeeSalary() {
        Calculate calculate = new Calculate();
        assertEquals(52200, calculate.CalcEmployeeSalary(60000, 13));
    }

    @Test
    public void TestCalcEmployerContributions() {
        Calculate calculate = new Calculate();
        assertEquals(18120.0, calculate.CalcEmployerContributions(60000, 22, 5.1, 3.1), 0);
    }

}
