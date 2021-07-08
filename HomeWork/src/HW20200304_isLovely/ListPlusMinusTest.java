package HW20200304_isLovely;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListPlusMinusTest {
    ListPlusMinus listPlusMinus = new ListPlusMinus();

    @Test
    public void testSaparateInteger_zero_zero() {
        List<Integer> list = Arrays.asList(0);
        assertEquals(Arrays.asList(0), listPlusMinus.saparateInteger(list));
    }

    @Test
    public void testSaparateInteger_allZero_allZero() {
        List<Integer> list = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0), listPlusMinus.saparateInteger(list));
    }

    @Test
    public void testSaparateInteger_minus_minus() {
        List<Integer> list = Arrays.asList(-3, -5, -1);
        assertEquals(Arrays.asList(-3, -5, -1), listPlusMinus.saparateInteger(list));
    }

    @Test
    public void testSaparateInteger_plus_plus() {
        List<Integer> list = Arrays.asList(8, 0, 3, 10);
        assertEquals(Arrays.asList(8, 0, 3, 10), listPlusMinus.saparateInteger(list));
    }

    @Test
    public void testSaparateInteger_minusAndPlus_rightList() {
        List<Integer> list = Arrays.asList(8, 3, -3, 10, -5, -1);
        assertEquals(Arrays.asList(-3, -5, -1, 8, 3, 10), listPlusMinus.saparateInteger(list));
    }

    @Test
    public void testSaparateInteger_minusAndPlusAndZero_rightList() {
        List<Integer> list = Arrays.asList(8, 0, 3, -3, 10, -5, -1);
        assertEquals(Arrays.asList(-3, -5, -1, 8, 0, 3, 10), listPlusMinus.saparateInteger(list));
    }
    @Test
    public void testSaparateInteger_minusAndPlusAndZeroDoubleNumbers_rightList() {
        List<Integer> list = Arrays.asList(8, 0, 8, -3, 3, -3, 10, -5, -1);
        assertEquals(Arrays.asList(-3,-3, -5, -1, 8, 0, 8, 3, 10), listPlusMinus.saparateInteger(list));
    }


}