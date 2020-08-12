
// TODO: Replace examples and use TDD development by writing your own tests

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringHandlingTest {
    @Test
    public void testSimpleWords() {
        // assertEquals("expected", "actual");
        assertEquals("as", StringHandling.longestAlpabeticalSubstring("asd"));
        assertEquals("ab", StringHandling.longestAlpabeticalSubstring("nab"));
        assertEquals("abcde", StringHandling.longestAlpabeticalSubstring("abcdeapbcdef"));
        assertEquals("aaaabbbbctt", StringHandling.longestAlpabeticalSubstring("asdfaaaabbbbcttavvfffffdf"));
        assertEquals("fgikl", StringHandling.longestAlpabeticalSubstring("asdfbyfgiklag"));
    }

    @Test
    public void testWordsWithSingleLetter() {
        // assertEquals("expected", "actual");
        assertEquals("a", StringHandling.longestAlpabeticalSubstring("a"));
        assertEquals("f", StringHandling.longestAlpabeticalSubstring("f"));
        assertEquals("z", StringHandling.longestAlpabeticalSubstring("z"));
    }

    @Test
    public void testWordsWithLettersInBackwardOrder() {
        // assertEquals("expected", "actual");
        assertEquals("z", StringHandling.longestAlpabeticalSubstring("zpda"));
        assertEquals("f", StringHandling.longestAlpabeticalSubstring("fda"));
        assertEquals("z", StringHandling.longestAlpabeticalSubstring("zyx"));
    }
}