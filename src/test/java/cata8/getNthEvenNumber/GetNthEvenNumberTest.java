package cata8.getNthEvenNumber;

import cata8.getNthEvenNumber.GetNthEvenNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetNthEvenNumberTest {
    @Test
    public void exampleTests() {
        Assertions.assertEquals(0, GetNthEvenNumber.nthEven(1));
        assertEquals(2, GetNthEvenNumber.nthEven(2));
        assertEquals(4, GetNthEvenNumber.nthEven(3));
        assertEquals(198, GetNthEvenNumber.nthEven(100));
        assertEquals(2597466, GetNthEvenNumber.nthEven(1298734));
    }
}