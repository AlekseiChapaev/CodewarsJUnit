package thirdAngleOfTriangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThirdAngleOfTriangleTest {
    @Test
    public void testOtherAngle() {
        assertEquals(123, ThirdAngleOfTriangle.otherAngle(45,12));
        assertEquals(70, ThirdAngleOfTriangle.otherAngle(50,60));
    }
}