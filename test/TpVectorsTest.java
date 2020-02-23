import org.junit.Test;
import tp2.TpVectors;
import tp2.TpVectorsSolution;
import tp2.utils.Infraction;
import utils.SkipRule;

import static org.junit.Assert.*;

public class TpVectorsTest extends SkipRule {
    TpVectors<Integer> vectorGuide = new TpVectorsSolution<>();

    @Test
    public void exercise_1_a() {
        assertEquals(new Integer(15), vectorGuide.exercise_1_a(new Integer[]{1, 1, 2, 3, 5}));
        assertEquals(new Integer(0), vectorGuide.exercise_1_a(new Integer[]{1, -1, 2, -2, 3, -3}));
    }

    @Test
    public void exercise_1_b() {
        assertEquals(new Integer(5), vectorGuide.exercise_1_b(new Integer[]{1, 1, 2, 3, 5}));
        assertEquals(new Integer(355), vectorGuide.exercise_1_b(new Integer[]{1, -1, 2, -2, 3, -3, 2, 11, 355, 21, 35, 78, 11, 90}));
    }

    @Test
    public void exercise_1_c() {
        assertEquals(new Integer(1), vectorGuide.exercise_1_c(new Integer[]{1, 1, 2, 3, 5}, 2));
        assertEquals(new Integer(3), vectorGuide.exercise_1_c(new Integer[]{1, -1, 5, 2, 5, -2, 3, -3, 5, 5}, 5));
    }

    @Test
    public void exercise_1_d() {
        assertEquals(new Integer(1), vectorGuide.exercise_1_d(new Integer[]{1, 1, 2, 3, 5}));
        assertEquals(new Integer(1), vectorGuide.exercise_1_d(new Integer[]{1, -1, 5, 7, 2, 7, 5, -2, 3, -3, 5, 5}));
        assertEquals(new Integer(3), vectorGuide.exercise_1_d(new Integer[]{1, -1, 5, 2, 5, -2, 3, -3, 5, 5}));
    }

    @Test
    public void exercise_1_f() {
        assertEquals(new Integer(0), vectorGuide.exercise_1_f(new Integer[]{1, 1, 1, 1, 1, 1}));
        assertEquals(new Integer(1), vectorGuide.exercise_1_f(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        assertEquals(new Integer(22), vectorGuide.exercise_1_f(new Integer[]{1, -1, 4, 2, 5, -2, 12, -3, 6, 5}));
    }

    @Test
    public void exercise_1_g() {
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 1, 2, 3, 4}, vectorGuide.exercise_1_g(new Integer[]{1, 2, 3, 4}, new Integer[]{1, 2, 3, 4}));
        assertArrayEquals(new Integer[]{5, 3, 8, 1, 2, 3, 4}, vectorGuide.exercise_1_g(new Integer[]{5, 3, 8}, new Integer[]{1, 2, 3, 4}));
    }

    @Test
    public void exercise_1_h() {
        assertArrayEquals(new Integer[]{5, 5, 5, 5}, vectorGuide.exercise_1_h(new Integer[]{1, 2, 3, 4}, new Integer[]{1, 2, 3, 4}));
        assertArrayEquals(new Integer[]{9, 6, 10}, vectorGuide.exercise_1_h(new Integer[]{5, 3, 8}, new Integer[]{1, 2, 3, 4}));
    }

    @Test
    public void exercise_1_i() {
        assertArrayEquals(new Integer[]{1, 1, 2, 2, 3, 3, 4, 4}, vectorGuide.exercise_1_i(new Integer[]{1, 2, 3, 4}, new Integer[]{1, 2, 3, 4}));
        assertArrayEquals(new Integer[]{5, 1, 3, 2, 8, 3, 4}, vectorGuide.exercise_1_i(new Integer[]{5, 3, 8}, new Integer[]{1, 2, 3, 4}));
    }

    @Test
    public void exercise_1_j() {
        assertArrayEquals(new Integer[]{4, 3, 2, 1}, vectorGuide.exercise_1_j(new Integer[]{1, 2, 3, 4}));
        assertArrayEquals(new Integer[]{8, 4, 6, 7, 3, 4, 5, 2}, vectorGuide.exercise_1_j(new Integer[]{2, 5, 4, 3, 7, 6, 4, 8}));
        assertArrayEquals(new Integer[]{7, 5, 3, 4, 2}, vectorGuide.exercise_1_j(new Integer[]{2, 4, 3, 5, 7}));
    }

    @Test
    public void exercise_1_k() {
        assertEquals(new Integer(14), vectorGuide.exercise_1_k(new Integer[]{1, 2, 3}, new Integer[]{1, 2, 3}));
        assertEquals(new Integer(0), vectorGuide.exercise_1_k(new Integer[]{1, 0, 0}, new Integer[]{0, 1, 0}));
        assertEquals(new Integer(56), vectorGuide.exercise_1_k(new Integer[]{2, 3, 4}, new Integer[]{5, 6, 7}));
    }

    @Test
    public void exercise_2() {
        assertArrayEquals(new Integer[]{1, 0, 2, 1}, vectorGuide.exercise_2(new Integer[]{5, 7, 1, 3}));
    }

    @Test
    public void exercise_3() {
        assertFalse(vectorGuide.exercise_3(new Integer[]{}));
        assertTrue(vectorGuide.exercise_3(new Integer[]{5, 8, 113, 78, 112}));
        assertFalse(vectorGuide.exercise_3(new Integer[]{1, 1, 2, 3, 5, 6}));
    }

//    TODO: test exercise 4
    @Test
    public void exercise_4() {
    }

    @Test
    public void exercise_5_a() {
        assertArrayEquals(new Integer[]{1}, vectorGuide.exercise_5_a(new Infraction[]{new Infraction(1,2,3),new Infraction(1,3,1),new Infraction(1,5,2),new Infraction(1,6,3)}));
        assertArrayEquals(new Integer[]{12,1}, vectorGuide.exercise_5_a(new Infraction[]{new Infraction(12,2,3),new Infraction(12,3,1),new Infraction(1,5,2),new Infraction(1,6,3)}));
    }

    @Test
    public void exercise_5_b() {
        assertArrayEquals(new Integer[]{2,5,6,7,8,9,10,11,12}, vectorGuide.exercise_5_b(new Infraction[]{new Infraction(1,2,3),new Infraction(3,3,1),new Infraction(4,5,2),new Infraction(1,6,3)}));
        assertArrayEquals(new Integer[]{2,4,5,6,7,8,9,11}, vectorGuide.exercise_5_b(new Infraction[]{new Infraction(12,2,3),new Infraction(10,3,1),new Infraction(1,5,2),new Infraction(3,6,3)}));
    }

    @Test
    public void exercise_5_c() {
        assertEquals(new Integer(9), vectorGuide.exercise_5_c(new Infraction[]{new Infraction(1,2,3),new Infraction(1,3,1),new Infraction(1,5,2),new Infraction(1,6,3)}));
        assertEquals(new Integer(16), vectorGuide.exercise_5_c(new Infraction[]{new Infraction(12,2,10),new Infraction(12,3,1),new Infraction(1,5,2),new Infraction(1,6,3)}));
    }
}