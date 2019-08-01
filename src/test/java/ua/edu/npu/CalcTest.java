package ua.edu.npu;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void addTest() {
        assertEquals(5, Calc.add(2,3));
    }

    @Test
    public void creationTest() {
        Calc c = new Calc();
        assertNotNull(c);
    }
}