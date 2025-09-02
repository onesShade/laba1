package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComplexOperationsTest {
    static final double DELTA = 0.000001;

    @Test
    public void testSubtraction() {
        Complex a = new Complex(51.1, 3.0);
        Complex b = new Complex(6.7, -3.2);

        Complex result = new Complex(a.getRe(), a.getIm()).minus(b);

        assertEquals(44.4, result.getRe(), DELTA);
        assertEquals(6.2, result.getIm(), DELTA);
    }

    @Test
    public void testDivision() {

        Complex a = new Complex(12.1, 4.6);
        Complex b = new Complex(5.0, -1.6);

        Complex result = new Complex(a.getRe(), a.getIm()).divideBy(b);

        assertEquals(1.928156748911466, result.getRe(), DELTA);
        assertEquals(1.537010159651669, result.getIm(), DELTA);
    }
}