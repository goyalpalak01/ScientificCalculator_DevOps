import ScientificCalculator.ScientificCalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScientificCalculatorTest {

    private static final double DELTA = 1e-15;
    ScientificCalculator sc = new ScientificCalculator();
    //factorial test
    @Test
    public  void  factorialTruePositiveTest()
    {
        assertEquals("{factorialTruePositiveTest1}",24.0,sc.calculateFactorial(4),DELTA);
        assertEquals("{factorialTruePositiveTest2}",1.0,sc.calculateFactorial(0),DELTA);
    }
    @Test
    public  void  factorialTrueNegativeTest()
    {
        assertEquals("{factorialTrueNegativeTest1}",Double.NaN,sc.calculateFactorial(-20),DELTA);
    }
    @Test
    public  void  factorialFalsePositiveTest()
    {
        assertNotEquals("{factorialFalsePositiveTest1}",42.0,sc.calculateFactorial(4),DELTA);
        assertNotEquals("{factorialFalsePositiveTest2}",11.0,sc.calculateFactorial(0),DELTA);
    }
    @Test
    public  void  factorialFalseNegativeTest()
    {
        assertNotEquals("{factorialFalseNegativeTest1}",24.0,sc.calculateFactorial(-20),DELTA);

    }

    //exponentiation test
    @Test
    public void exponentiationTruePositiveTest()
    {
        assertEquals("{exponentiationTruePositiveTest1}",81.0,sc.calculateExp(3,4),DELTA);
        assertEquals("{exponentiationTruePositiveTest2}",0.125,sc.calculateExp(2,-3),DELTA);
        assertEquals("{exponentiationTruePositiveTest3}",0.25,sc.calculateExp(-2,-2),DELTA);
    }
    @Test
    public void exponentiationTrueNegativeTest()
    {
        assertEquals("{exponentiationTrueNegativeTest1}",Double.NaN,sc.calculateExp(0,0),DELTA);

    }
    @Test
    public void exponentiationFalsePositiveTest()
    {
        assertNotEquals("{exponentiationFalsePositiveTest1}",91.0,sc.calculateExp(3,4),DELTA);
        assertNotEquals("{exponentiationFalsePositiveTest2}",125.0,sc.calculateExp(2,-3),DELTA);
        assertNotEquals("{exponentiationFalsePositiveTest3}",Double.NaN,sc.calculateExp(-2,-2),DELTA);
    }
    @Test
    public void exponentiationFalseNegativeTest()
    {
        assertNotEquals("{exponentiationFalseNegativeTest1}",1.0,sc.calculateExp(0,0),DELTA);

    }

    //logarithm test
    @Test
    public void logarithmTruePositiveTest()
    {
        assertEquals("{logarithmTruePositiveTest1}",0.6931471805599453,sc.calculateLog(2),DELTA);
        assertEquals("{logarithmTruePositiveTest2}",1.667706820558076,sc.calculateLog(5.3),DELTA);
    }
    @Test
    public void logarithmTrueNegativeTest()
    {
        assertEquals("{logarithmTrueNegativeTest1}",Double.NaN,sc.calculateLog(0),DELTA);
        assertEquals("{logarithmTrueNegativeTest2}",Double.NaN,sc.calculateLog(-4),DELTA);
    }
    @Test
    public void logarithmFalsePositiveTest()
    {
        assertNotEquals("{logarithmFalsePositiveTest1}",6.9,sc.calculateLog(2),DELTA);

    }
    @Test
    public void logarithmFalseNegativeTest()
    {
        assertNotEquals("{logarithmFalseNegativeTest1}",1.0,sc.calculateLog(0),DELTA);
        assertNotEquals("{logarithmFalseNegativeTest2}",4.0,sc.calculateLog(-5.3),DELTA);
    }

    //square root test

    @Test
    public void sqrtTruePositiveTest(){

        assertEquals("{sqrtTruePositiveTest1}", 2.6457513110645907, sc.calculateSqrt(7), DELTA);
        assertEquals("{sqrtTruePositiveTest2}", 0.0, sc.calculateSqrt(0), DELTA);
        assertEquals("{sqrtTruePositiveTest3}", 1.224744871391589, sc.calculateSqrt(1.5), DELTA);
    }
    @Test
    public void sqrtTrueNegativeTest(){

        assertEquals("{sqrtTrueNegativeTest1}", Double.NaN, sc.calculateSqrt(-7), DELTA);

    }
    @Test
    public void sqrtFalsePositiveTest(){

        assertNotEquals("{sqrtFalsePositiveTest1}", 2.0, sc.calculateSqrt(7), DELTA);
        assertNotEquals("{sqrtFalsePositiveTest2}",Double.NaN, sc.calculateSqrt(0), DELTA);
        assertNotEquals("{sqrtFalsePositiveTest3}", 1.0, sc.calculateSqrt(1.5), DELTA);
    }

    @Test
    public void sqrtFalseNegativeTest(){

        assertNotEquals("{sqrtNegativeTest3}", -3.0, sc.calculateSqrt(-9), DELTA);
    }

}
