package com.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsequenceFinderTest {
    SubsequenceFinder subsequence = new SubsequenceFinder();

    @Test
    public void testIsSubsequence_emptyPatternEmptyText_true(){
        assertTrue(subsequence.isSubsequence("", ""));
    }

    @Test
    public void testIsSubsequence_emptyPatternAndAnyText_true(){
        assertTrue(subsequence.isSubsequence("", "9"));
    }
    @Test
    public void testIsSubsequence_oneLetterPatternAndAnyText_false(){
        assertFalse(subsequence.isSubsequence("a", "9"));
    }
    @Test
    public void testIsSubsequence_oneLetterPatternAndAnyText_true(){
        assertTrue(subsequence.isSubsequence("a", "a9"));
    }

    @Test
    public void testIsSubsequence_mixedPatternAndMixedText_false(){
        assertFalse(subsequence.isSubsequence("abcs", "sdfavdfvb;lkcooo"));
    }

    @Test
    public void testIsSubsequence_mixedPatternAndMixedText_true(){
        assertTrue(subsequence.isSubsequence("abcs", "asdfavdfvb;lkcooos"));
    }

    @Test
    public void testIsSubsequence_StringSubstring_true() {
        String first = "bcd";
        String second = "A$%bGDFcLKKd";
        assertTrue(subsequence.isSubsequence(first, second));
    }
    @Test
    public void testIsSubsequence_StringSubstring_false() {
        String first = "bcd";
        String second = "A$%bGDFcLKK";
        assertFalse(subsequence.isSubsequence(first, second));
    }
    @Test
    public void testIsSubsequence_StringEmptySubstring_true() {
        String first = "";
        String second = "A$%bGDFcLKK";
        assertTrue(subsequence.isSubsequence(first, second));
    }
    @Test
    public void testIsSubsequence_StringSubstringEmpty_false() {
        String first = "bcd";
        String second = "";
        assertFalse(subsequence.isSubsequence(first, second));
    }
    @Test
    public void testIsSubsequence_StringAndSameSubstring_true() {
        String first = "bcd";
        String second = "bcd";
        assertTrue(subsequence.isSubsequence(first, second));
    }

    @Test
    public void testIsSubsequence_StringDoubleSymbolSubstring_false() {
        String first = "bccd";
        String second = "A$%bGDFcLKKd";
        assertFalse(subsequence.isSubsequence(first, second));
    }

    @Test
    public void testIsSubsequence_StringSubstringDoubleSymbol_true() {
        String first = "bcd";
        String second = "A$%bGDFcLcKKd";
        assertTrue(subsequence.isSubsequence(first, second));
    }

    @Test
    public void testIsSubsequence_StringDoubleSymbolSubstringDoubleSymbol_true() {
        String first = "bccd";
        String second = "A$%bGDFcLcKKd";
        assertTrue(subsequence.isSubsequence(first, second));
    }

    @Test
    public void testIsSubsequence_StringDoubleSymbolSubstringDoubleSymbolBeside_true() {
        String first = "bccd";
        String second = "A$%bGDFccLKKd";
        assertTrue(subsequence.isSubsequence(first, second));
    }

}