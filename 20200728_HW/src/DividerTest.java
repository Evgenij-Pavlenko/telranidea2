import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividerTest {
    Divider div = new Divider();

    @Test
    public void testGcd_num6And9_div3() {
        assertEquals(3, div.gcd(9, 6));
    }

    @Test
    public void testGcd_num9And6_div3() {
        assertEquals(3, div.gcd(9, 6));
    }

    @Test
    public void testGcd_num5And10_div5() {
        assertEquals(5, div.gcd(5, 10));
    }

    @Test
    public void testGcd_num6And6_div6() {
        assertEquals(6, div.gcd(6, 6));
    }

    @Test
    public void testGcd_num6And5_div1() {
        assertEquals(1, div.gcd(6, 5));
    }

    @Test
    public void testGcd_num30And18_div6() {
        assertEquals(6, div.gcd(30, 18));
    }

    @Test
    public void testGcd_num5And0_div5() {
        assertEquals(5, div.gcd(5, 0));
    }

}