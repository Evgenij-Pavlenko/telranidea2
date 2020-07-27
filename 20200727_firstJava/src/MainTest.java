import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testReverceString1(){
        String test = "Hello";
        String expected = "olleH";
        String actual = Main.reverceString1(test);
        assertEquals(expected, actual);
    }

    @Test
    public void testReverceString2(){
        String test = "Hello";
        String expected = "olleH";
        String actual = Main.reverceString2(test);
        assertEquals(expected, actual);
    }

    @Test
    public void testChangeCase(){
        String test = "Hel*lo";
        String expected = "hEL*LO";
        String actual = Main.changeCase(test);
        assertEquals(expected, actual);
    }

//    @Test
//    public void testDoubleInt(){
//        List<Integer> testList = new ArrayList<>(Arrays .asList(-8,1,-5,1,2,7));
//        List<Integer> expected = new ArrayList<>(Arrays.asList(1));
//        List<Integer> actual = Main.doubleInt(testList);
//        assertEquals(expected,actual);
//    }
    @Test
    public void testDoubleIntSet(){
        List<Integer> testList = new ArrayList<>(Arrays .asList(-8,1,-5,1,2,7,-5,1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, -5));
        List<Integer> actual = Main.doubleIntSet(testList);
        assertEquals(expected,actual);
    }
}
