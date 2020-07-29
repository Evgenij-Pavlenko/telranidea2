import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberPowTest {
    NumberPow numberPow = new NumberPow();

    @Test
    public void testNumberPow(){
        assertEquals(64, numberPow.numberToPow(8,2));
    }

    @Test
    public void testNumberPow2_num8AndPower2_numInPower64(){
        assertEquals(64, numberPow.numberToPow(8,2));
    }

    @Test
    public void testNumberPow2_num3AndPower3_numInPower27(){
        assertEquals(27, numberPow.numberToPow(3,3));
    }

    @Test
    public void testNumberPow2_num2AndPower10_numInPower1024(){
        assertEquals(1024, numberPow.numberToPow(2,10));
    }

    @Test
    public void testNumberPow2_someNumAndPower0_numInPower1(){
        assertEquals(1, numberPow.numberToPow(8,0));
    }

}