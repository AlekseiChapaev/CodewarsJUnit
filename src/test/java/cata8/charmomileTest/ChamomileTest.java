package cata8.charmomileTest;

import cata8.charmomile.Chamomile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChamomileTest {

    @Test
    public void test1() {
        assertEquals("I love you", Chamomile.howMuchILoveYou(1));
        assertEquals("a little", Chamomile.howMuchILoveYou(2));
        assertEquals("not at all", Chamomile.howMuchILoveYou(6));
        assertEquals("a little", Chamomile.howMuchILoveYou(20));
    }
}