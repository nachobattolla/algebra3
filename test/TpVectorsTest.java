import org.junit.Test;
import tp2.TpVectors;
import tp2.TpVectorsSolution;
import utils.SkipRule;

import static org.junit.Assert.*;

public class TpVectorsTest extends SkipRule {
    TpVectors vectorGuide = new TpVectorsSolution();

    @Test
    public void exercise_1_a() {
        assertEquals(15, vectorGuide.exercise_1_a(new int[]{1, 1, 2, 3, 5}));
        assertEquals(0, vectorGuide.exercise_1_a(new int[]{1, -1, 2, -2, 3, -3}));
    }

    @Test
    public void exercise_1_b() {
        assertEquals(5, vectorGuide.exercise_1_b(new int[]{1, 1, 2, 3, 5}));
        assertEquals(355, vectorGuide.exercise_1_b(new int[]{1, -1, 2, -2, 3, -3, 2, 11, 355, 21, 35, 78, 11, 90}));
    }

    @Test
    public void exercise_1_c() {
        assertEquals(1, vectorGuide.exercise_1_c(new int[]{1, 1, 2, 3, 5}, 2));
        assertEquals(3, vectorGuide.exercise_1_c(new int[]{1, -1, 5, 2, 5, -2, 3, -3, 5, 5}, 5));
    }

    @Test
    public void exercise_1_d() {
        assertEquals(1, vectorGuide.exercise_1_d(new int[]{1, 1, 2, 3, 5}));
        assertEquals(1, vectorGuide.exercise_1_d(new int[]{1, -1, 5, 7, 2, 7, 5, -2, 3, -3, 5, 5}));
        assertEquals(3, vectorGuide.exercise_1_d(new int[]{1, -1, 5, 2, 5, -2, 3, -3, 5, 5}));
    }

    @Test
    public void exercise_1_f() {
        assertEquals(0, vectorGuide.exercise_1_f(new int[]{1, 1, 1, 1, 1, 1}));
        assertEquals(1, vectorGuide.exercise_1_f(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        assertEquals(22, vectorGuide.exercise_1_f(new int[]{1, -1, 4, 2, 5, -2, 12, -3, 6, 5}));
    }

    @Test
    public void exercise_1_g() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 1, 2, 3, 4}, vectorGuide.exercise_1_g(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{5, 3, 8, 1, 2, 3, 4}, vectorGuide.exercise_1_g(new int[]{5, 3, 8}, new int[]{1, 2, 3, 4}));
    }

    @Test
    public void exercise_1_h() {
        assertArrayEquals(new int[]{5, 5, 5, 5}, vectorGuide.exercise_1_h(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{9, 6, 10}, vectorGuide.exercise_1_h(new int[]{5, 3, 8}, new int[]{1, 2, 3, 4}));
    }

    @Test
    public void exercise_1_i() {
        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3, 4, 4}, vectorGuide.exercise_1_i(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{5, 1, 3, 2, 8, 3, 4}, vectorGuide.exercise_1_i(new int[]{5, 3, 8}, new int[]{1, 2, 3, 4}));
    }

    @Test
    public void exercise_1_j() {
        assertArrayEquals(new int[]{4, 3, 2, 1}, vectorGuide.exercise_1_j(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{8, 4, 6, 7, 3, 4, 5, 2}, vectorGuide.exercise_1_j(new int[]{2, 5, 4, 3, 7, 6, 4, 8}));
        assertArrayEquals(new int[]{7, 5, 3, 4, 2}, vectorGuide.exercise_1_j(new int[]{2, 4, 3, 5, 7}));
    }

    @Test
    public void exercise_1_k() {
        assertEquals(14, vectorGuide.exercise_1_k(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        assertEquals(0, vectorGuide.exercise_1_k(new int[]{1, 0, 0}, new int[]{0, 1, 0}));
        assertEquals(56, vectorGuide.exercise_1_k(new int[]{2, 3, 4}, new int[]{5, 6, 7}));
    }

    @Test
    public void exercise_2() {
        assertArrayEquals(new int[]{1, 0, 2, 1}, vectorGuide.exercise_2(new int[]{5, 7, 1, 3}));
    }

    @Test
    public void exercise_3() {
        assertFalse(vectorGuide.exercise_3(new int[]{}));
        assertTrue(vectorGuide.exercise_3(new int[]{5, 8, 113, 78, 112}));
        assertFalse(vectorGuide.exercise_3(new int[]{1, 1, 2, 3, 5, 6}));
    }

//    TODO: test exercise 4
    @Test
    public void exercise_4() {
    }
}