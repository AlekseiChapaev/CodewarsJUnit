package cata8.switchItUp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import cata8.switchItUp.SwitchItUp;

import static org.junit.jupiter.api.Assertions.*;

class SwitchItUpTest {
    @Test
    public void basicTests() {
        Assertions.assertEquals("One", SwitchItUp.switchItUp(1));
        assertEquals("Three", SwitchItUp.switchItUp(3));
        assertEquals("Five", SwitchItUp.switchItUp(5));
    }
}