package lessonsExamples.hw1310;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTransformTest {
    String testString = "abc defG ikl";
    String testString2 = "abc fGDLK ikl";
    String testString3 = "abc fGDLeK ikl";

    @Test
    void transform1() {
      assertEquals("ABC defG IKL", StringTransform.transform1(testString));
    }

    @Test
    void transform2() {
        assertEquals("abc fgdlk ikl", StringTransform.transform2(testString2));
    }

    @Test
    void transform3() {
        assertEquals("abc DEFG ikl", StringTransform.transform3(testString));
    }

    @Test
    void transform4() {
        assertEquals("abc FGDLEK ikl", StringTransform.transform4(testString3, 6));
    }
}