package cata8.cockroach;

import cata8.cockroach.Cockroach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CockroachTest {
    @Test
    public void basicTests(){
        Cockroach cockroach = new Cockroach();
        assertEquals(30, cockroach.cockroachSpeed(1.08));
        assertEquals(30, cockroach.cockroachSpeed(1.09));
        assertEquals(0, cockroach.cockroachSpeed(0));
    }
}