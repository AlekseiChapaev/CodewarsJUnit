package cata7.jadenCasingStrings;

import cata7.JadenCasingStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JadenCasingStringsTest {
    JadenCasingStrings jadenCase = new JadenCasingStrings();

    @Test
    public void test() {
        assertEquals("Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
    }

    @Test
    public void testNullArg() {
        assertNull(null, jadenCase.toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        assertNull(null, jadenCase.toJadenCase(""));
    }

}