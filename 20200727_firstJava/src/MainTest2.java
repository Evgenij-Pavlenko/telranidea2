import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest2 {

    @Test
    public void testChangeCase_emptyString_sameEmptyString(){
assertEquals("", Main.changeCase(""));
    }

    @Test
    public void testChangeCase_oneCapitalLetter_caseSwitched(){
assertEquals("G", Main.changeCase("g"));
    }

    @Test
    public void testChangeCase_oneSmallLetter_caseSwitched(){
assertEquals("g", Main.changeCase("G"));
    }

    @Test
    public void testChangeCase_severalLettersOfDifferentCase_caseSwitched(){
assertEquals("gFklMn", Main.changeCase("GfKLmN"));
    }

    @Test
    public void testChangeCase_severalLettersOfDifferentCaseAndOtherChars_caseSwitched(){
assertEquals("g_Fk8l&Mn", Main.changeCase("G_fK8L&mN"));
    }

}