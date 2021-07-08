package HW20200304_isLovely;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextWithNTest {
    TextWithN text = new TextWithN();

    @Test
    public void testMakeText_HelloWorldAndN11_HelloWorld(){
        String s = "Hello world";
        assertEquals("Hello world", text.makeNewText(s, 11));
    }
    @Test
    public void testMakeText_HelloWorldAndN5_Hello(){
        String s = "Hello world";
        assertEquals("Hello", text.makeNewText(s, 5));
    }
    @Test
    public void testMakeText_HelloWorldAndN6_Hello(){
        String s = "Hello world";
        assertEquals("Hello", text.makeNewText(s, 5));
    }
    @Test
    public void testMakeText_HelloAndTwoSpasedAndN5_Hello(){
        String s = "Hello  world";
        assertEquals("Hello", text.makeNewText(s, 6));
    }
    @Test
    public void testMakeText_HelloWorldAndN7_Hello(){
        String s = "Hello world";
        assertEquals("Hello", text.makeNewText(s, 7));
    }
    @Test
    public void testMakeText_HelloWorldAndN4_emptyString(){
        String s = "Hello world";
        assertEquals("", text.makeNewText(s, 4));
    }
    @Test
    public void testMakeText_HelloWorlAndYoudAndN17_emptyString(){
        String s = "Hello world and you!";
        assertEquals("Hello world and", text.makeNewText(s, 17));
    }


}