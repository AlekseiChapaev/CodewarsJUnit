package cata8.thirdAngleOfTriangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import cata8.thirdAngleOfTriangle.ThirdAngleOfTriangle;

import static org.junit.jupiter.api.Assertions.*;

class ThirdAngleOfTriangleTest {
    @Test
    public void testOtherAngle() {
        Assertions.assertEquals(123, ThirdAngleOfTriangle.otherAngle(45,12));
        assertEquals(70, ThirdAngleOfTriangle.otherAngle(50,60));
    }
}