package packageCalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperationsTest {



    @Test
    public void testGetAddition() {
        Operations oper = new Operations(1.1111, 2.0000, '+');
        assertTrue("операция сложения не удалась", 3.1111 == oper.getAddition(1.1111, 2.0000));
    }

    @Test
    public void testGetSubtraction() {
        Operations oper = new Operations(1.1111, 2.0000, '-');
        assertTrue("операция вычитания не удалась", -0.8889 == oper.getSubtraction(1.1111, 2.0000));
    }

    @Test
    public void testGetDivision() throws Exception{
        Operations oper = new Operations(1.1111, 2.0000, '/');
        assertTrue("операция деления не удалась", 0.55555 == oper.getDivision(1.1111, 2.0000));
    }

    @Test(expected = Exception.class)
    public void testGetDivisionException() throws Exception {
        Operations oper = new Operations(1.1111, 0.0, '/');
        oper.getDivision(1.1111, 0.0);

    }

    @Test
    public void testGetMultiplication() {
        Operations oper = new Operations(1.1111, 2.0000, '*');
        assertTrue("операция умножения не удалась", 2.2222 == oper.getMultiplication(1.1111, 2.0000));
    }
}