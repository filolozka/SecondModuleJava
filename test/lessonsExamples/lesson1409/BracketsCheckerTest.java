package lessonsExamples.lesson1409;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsCheckerTest {

    @Test
    public void bracketsCheckerTest() {
        BracketsChecker checker = new BracketsChecker();
        assertTrue(checker.test("qwe{fhf}rey"));
        assertTrue(checker.test("q(we{f(h)f}rey)"));
        assertTrue(checker.test("q(we{f(h)f}r[e]y)"));
        assertTrue(checker.test("q(we{f(h)f}r[e]y) errt[rtdgh] c{ffdg}g"));
        assertTrue(checker.test(""));
        assertTrue(checker.test("()"));
        assertTrue(checker.test("(rtgfhndghnt)"));

        assertFalse(checker.test(null));
        assertFalse(checker.test("gdf(hfr}g"));
        assertFalse(checker.test("g[df(hfr]g"));
        assertFalse(checker.test("gd)f(hfrg"));
        assertFalse(checker.test("(gfg}df}hfr)g"));
        assertFalse(checker.test("(gfg[dff)hd]hfrg"));
        assertFalse(checker.test("(fg{dgf[d]f(gd)r"));
        assertFalse(checker.test("fg{dgf[d]f(gd)dfgh{r"));
    }
}