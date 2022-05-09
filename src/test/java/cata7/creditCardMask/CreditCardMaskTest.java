package cata7.creditCardMask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardMaskTest {

    @Test
    public void testSolution() {
        assertEquals("############5616", CreditCardMask.maskify("4556364607935616"));
        assertEquals("#######5616",      CreditCardMask.maskify(     "64607935616"));
        assertEquals("1",                CreditCardMask.maskify(               "1"));
        assertEquals("",                 CreditCardMask.maskify(                ""));
        assertEquals("##ippy",                                    CreditCardMask.maskify("Skippy")                                  );
        assertEquals("####################################man!",  CreditCardMask.maskify("Nananananananananananananananana Batman!"));
    }

}