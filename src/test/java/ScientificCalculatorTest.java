import ScientificCalculator.ScientificCalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScientificCalculatorTest {

    private static final double DELTA = 1e-15;
    ScientificCalculator sc = new ScientificCalculator();

    @Test
    public  void  factorialPositiveTest()
    {
        assertEquals("{factorialPositiveTest1}",24.0,sc.calculateFactorial(4),DELTA);
        assertEquals("{factorialPositiveTest2}",Double.NaN,sc.calculateFactorial(-20),DELTA);
    }

    @Test
    public void factorialNegativeTest()
    {
        assertNotEquals("{factorialNegativeTest1}",42.0,sc.calculateFactorial(4),DELTA);
        assertNotEquals("{factorialNegativeTest2}",6.0,sc.calculateFactorial(-20),DELTA);
    }

    @Test
    public void exponentiationPositiveTest()
    {
        assertEquals("{exponentPositiveTest1}",Double.NaN,sc.calculateExp(0,0),DELTA);
        assertEquals("{exponentPositiveTest2}",81.0,sc.calculateExp(3,4),DELTA);
        assertEquals("{exponentPositiveTest3}",0.125,sc.calculateExp(2,-3),DELTA);

    }


    @Test
    public void exponentiationNegativeTest()
    {
        assertNotEquals("{exponentNegativeTest3}",1,sc.calculateExp(0,0),DELTA);
        assertNotEquals("{exponentNegativeTest1}",32,sc.calculateExp(3,4),DELTA) ;
        assertNotEquals("{exponentNegativeTest2}",0.125,sc.calculateExp(3,-4),DELTA);

    }

    @Test
    public void logarithmPositiveTest()
    {
        assertEquals("{logarithmPositiveTest1}",0.6931471805599453,sc.calculateLog(2),DELTA);
        assertEquals("{logarithmPositiveTest2}",Double.NaN,sc.calculateLog(0),DELTA);
        assertEquals("{logarithmPositiveTest3}, ",Double.NaN,sc.calculateLog(-8),DELTA);
    }


    @Test
    public void logarithmNegativeTest()
    {
        assertNotEquals("{logarithmNegativeTest1}", 2.2, sc.calculateLog(3), DELTA);
        assertNotEquals("{logarithmNegativeTest2}", 0, sc.calculateLog(0), DELTA);
        assertNotEquals("{logarithmNegativeTest3}", 4.0, sc.calculateLog(-5.3), DELTA);
    }


    @Test
    public void sqrtPositiveTest(){
        assertEquals("{sqrtPositiveTest1}", 20.0, sc.calculateSqrt(400), DELTA);
        assertEquals("{sqrtPositiveTest2}", 2.6457513110645907, sc.calculateSqrt(7), DELTA);
        assertEquals("{sqrtPositiveTest3}", 0.0, sc.calculateSqrt(0), DELTA);
        assertEquals("{sqrtPositiveTest4}", Double.NaN, sc.calculateSqrt(-5), DELTA);
    }

    @Test
    public void sqrtNegativeTest(){
        assertNotEquals("{sqrtNegativeTest1}", 6.9, sc.calculateSqrt(400), DELTA);
        assertNotEquals("{sqrtNegativeTest2}", 9.0, sc.calculateSqrt(3.4), DELTA);
        assertNotEquals("{sqrtNegativeTest3}", 3.0, sc.calculateSqrt(-9), DELTA);
    }

}
