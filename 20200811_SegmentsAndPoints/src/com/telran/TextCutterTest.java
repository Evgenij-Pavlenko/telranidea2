package com.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextCutterTest {
    TextCutter text = new TextCutter();

    @Test
    public void testMakeText_HelloWorldAndN11_HelloWorld() {
        String s = "Hello world";
        assertEquals("Hello world", text.cut(s, 11));
    }

    @Test
    public void testMakeText_HelloWorldAndN5_Hello() {
        String s = "Hello world";
        assertEquals("Hello", text.cut(s, 5));
    }

    @Test
    public void testMakeText_HelloWorldAndN6_Hello() {
        String s = "Hello world";
        assertEquals("Hello", text.cut(s, 6));
    }

//    @Test
//    public void testMakeText_HelloAndTwoSpasedAndN5_Hello() {
//        String s = "Hello  world";
//        assertEquals("Hello", text.cut(s, 6));
//    }

//    @Test
//    public void testMakeText_SpaseInEndAnd_Hello() {
//        String s = "Hello  world";
//        assertEquals("Hello", text.cut(s, 6));
//    }

    @Test
    public void testMakeText_HelloWorldAndN7_Hello() {
        String s = "Hello world";
        assertEquals("Hello", text.cut(s, 7));
    }

    @Test
    public void testMakeText_HelloWorldAndN4_emptyString() {
        String s = "Hello world";
        assertEquals("", text.cut(s, 4));
    }

    @Test
    public void testMakeText_HelloWorlAndYoudAndN17_emptyString() {
        String s = "Hello world and you!";
        assertEquals("Hello world and", text.cut(s, 17));
    }
}