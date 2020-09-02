import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubstringTest {
    Substring sub = new Substring();

    @Test
    public void testSub_HK1_emptyList() {
        List<String> expected = Collections.EMPTY_LIST;
        assertEquals(expected, sub.sub(1, "H"));
    }
    @Test
    public void testSub_HelloK1_emptyList() {
        List<String> expected = Collections.EMPTY_LIST;
        assertEquals(expected, sub.sub(1, "Hello"));
    }

    @Test
    public void testSub_HelloK2_1() {
        List<String> expected = Arrays.asList("ll");
        assertEquals(expected, sub.sub(2, "Hello"));
    }

    @Test
    public void testSub_HelloK3_2() {
        List<String> expected = Arrays.asList("ell", "llo");
        assertEquals(expected, sub.sub(3, "Hello"));
    }

    @Test
    public void testSub_HelloK4_2() {
        List<String> expected = Arrays.asList("Hell", "ello");
        assertEquals(expected, sub.sub(4, "Hello"));
    }

    @Test
    public void testSub_HelloK5_1() {
        List<String> expected = Arrays.asList("Hello");
        assertEquals(expected, sub.sub(5, "Hello"));
    }
    @Test
    public void testSub_HelloK6_1() {
        List<String> expected = Arrays.asList("Hello");
        assertEquals(expected, sub.sub(6, "Hello"));
    }
    @Test
    public void testSub_HellloK4_1() {
        List<String> expected = Arrays.asList("Hell");
        assertEquals(expected, sub.sub(4, "Helllo"));
    }
    @Test
    public void testSub_HellloK3_1() {
        List<String> expected = Arrays.asList("ell", "llo");
        assertEquals(expected, sub.sub(3, "Helllo"));
    } @Test
    public void testSub_HellloK2_1() {
        List<String> expected = Arrays.asList("ll", "ll");
        assertEquals(expected, sub.sub(2, "Helllo"));
    }
}