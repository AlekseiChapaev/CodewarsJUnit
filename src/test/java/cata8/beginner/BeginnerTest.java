package cata8.beginner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginnerTest {

    @Test
    public void testSomething() {
        assertEquals(Beginner.check(new Object[] {66, 101}, 66), true);
        assertEquals(Beginner.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45), true);
        assertEquals(Beginner.check(new Object[] {'t', 'e', 's', 't'}, 'e'), true);
        assertEquals(Beginner.check(new Object[] {"what", "a", "great", "kata"}, "kat"), false);
    }

}