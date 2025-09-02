package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void minus() {
        Complex c1 = new Complex(3,6);
        Complex c2 = new Complex(1,4);

        Complex res = c1.minus(c2);

        assertEquals(2.0, res.getReal(), 1e-10);
        assertEquals(2.0, res.getImaginary(), 1e-10);
    }
}
