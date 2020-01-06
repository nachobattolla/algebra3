import org.junit.Test;

import tp2.Guide6;
import tp2.answers.Guide6Solved;
import tp2.utils.*;
import utils.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Guide6Test extends SkipRule {
    Guide6 guide6 = new Guide6Solved();

    @Test
    public void exercise_1_a() {
        assertEquals(14, guide6.exercise_1_a(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        assertEquals(0, guide6.exercise_1_a(new int[]{1, 0, 0}, new int[]{0, 1, 0}));
        assertEquals(56, guide6.exercise_1_a(new int[]{2, 3, 4}, new int[]{5, 6, 7}));
    }

    @Test
    public void exercise_1_b() {
        assertEquals(7, guide6.exercise_1_b(new int[][]{{2, 3}, {4, 5}}));
        assertEquals(3, guide6.exercise_1_b(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
        assertEquals(34, guide6.exercise_1_b(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}));
    }

    @Test
    public void exercise_1_c() {
        assertEquals(4, guide6.exercise_1_c(new int[][]{{2, 3}, {4, 5}}));
        assertEquals(1, guide6.exercise_1_c(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
        assertEquals(30, guide6.exercise_1_c(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}));
    }

    @Test
    public void exercise_1_d() {
        assertArrayEquals(new int[]{1, 1, 1, 6}, guide6.exercise_1_d(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}, {1, 2, 3}}));
        assertArrayEquals(new int[]{6, 6}, guide6.exercise_1_d(new int[][]{{1, 1, 1, 1, 1, 1}, {2, 2, 2}}));
        assertArrayEquals(new int[]{7, 14, 11, 6, 6}, guide6.exercise_1_d(new int[][]{{1, 2, 4}, {2, 8, 4}, {6, 2, 3}, {1, 2, 3}, {1, 2, 3}}));
    }

    @Test
    public void exercise_1_e() {
        assertArrayEquals(new int[]{8, 14}, guide6.exercise_1_e(new int[][]{{2, 3}, {4, 5}}, new int[]{1, 2}));
        assertArrayEquals(new int[]{7, 8, 9}, guide6.exercise_1_e(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, new int[]{7, 8, 9}));
        assertArrayEquals(new int[]{9, 9, 9}, guide6.exercise_1_e(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}, new int[]{2, 3, 4}));
    }

    @Test
    public void exercise_1_f() {
        assertArrayEquals(new int[][]{{2, 4, 6}, {8, 10, 12}, {14, 16, 18}}, guide6.exercise_1_f(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertArrayEquals(new int[][]{{2, 2, 3}, {4, 6, 6}, {7, 8, 10}}, guide6.exercise_1_f(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertArrayEquals(new int[][]{{2, 0, 0}, {0, 2, 0}, {0, 0, 2}}, guide6.exercise_1_f(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
    }

    @Test
    public void exercise_1_g() {
        assertArrayEquals(new int[][]{{30, 36, 42}, {66, 81, 96}, {102, 126, 150}}, guide6.exercise_1_g(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertArrayEquals(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, guide6.exercise_1_g(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        assertArrayEquals(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, guide6.exercise_1_g(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
        assertArrayEquals(new int[][]{{2, 4, 6}, {0, 2, 4}, {0, 0, 2}}, guide6.exercise_1_g(new int[][]{{1, 1, 1}, {0, 1, 1}, {0, 0, 1}}, new int[][]{{2, 2, 2}, {0, 2, 2}, {0, 0, 2}}));
        assertArrayEquals(new int[][]{{6, 6, 6}, {12, 12, 12}, {18, 18, 18}}, guide6.exercise_1_g(new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}}, new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}}));
    }

    @Test
    public void exercise_1_h() {
        assertArrayEquals(new int[][]{{1, 3}, {2, 4},}, guide6.exercise_1_h(new int[][]{{1, 2}, {3, 4}}));
        assertArrayEquals(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}, guide6.exercise_1_h(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
        assertArrayEquals(new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}, guide6.exercise_1_h(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    @Test
    public void exercise_2_a() {
        assertTrue(guide6.exercise_2_a(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
        assertFalse(guide6.exercise_2_a(new int[][]{{1, 0, 1}, {0, 1, 0}, {0, 0, 1}}));
        assertFalse(guide6.exercise_2_a(new int[][]{{1, 0, 0}, {0, 1, 1}, {0, 0, 1}}));
    }

    @Test
    public void exercise_2_b() {
        assertTrue(guide6.exercise_2_b(new int[][]{{3, -2, 1}, {1, -3, 2}, {-1, 2, 4}}));
        assertFalse(guide6.exercise_2_b(new int[][]{{-2, 2, 1}, {1, 3, 2}, {1, -2, 0}}));
    }

    @Test
    public void exercise_3_a_i() {
        MatrixVectorOperation op1 = new MatrixVectorOperation(new int[][]{{1, 1, 1}, {0, 1, 1}, {0, 0, 1}}, new int[]{7, 8, 9});
        assertArrayEquals(new int[]{24, 17, 9}, guide6.exercise_3_a_i(op1).getResult());
        assertTrue(op1.getCounter() <= 12);

        MatrixVectorOperation op2 = new MatrixVectorOperation(new int[][]{{1, 1, 1, 1}, {0, 1, 1, 1}, {0, 0, 1, 1}, {0, 0, 0, 1}}, new int[]{1, 2, 3, 4});
        assertArrayEquals(new int[]{10, 9, 7, 4}, guide6.exercise_3_a_i(op2).getResult());
        assertTrue(op2.getCounter() <= 20);
    }

    @Test
    public void exercise_3_a_ii() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new int[][]{{1, 2, 3}, {0, 5, 6}, {0, 0, 9}}, new int[][]{{1, 2, 3}, {0, 5, 6}, {0, 0, 9}});
        assertArrayEquals(new int[][]{{2, 4, 6}, {0, 10, 12}, {0, 0, 18}}, guide6.exercise_3_a_ii(op1).getResult());
        assertTrue(op1.getCounter() <= 12);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new int[][]{{1, 1, 1, 1}, {0, 1, 1, 1}, {0, 0, 1, 1}, {0, 0, 0, 1}}, new int[][]{{2, 2, 2, 2}, {0, 2, 2, 2}, {0, 0, 2, 2}, {0, 0, 0, 2}});
        assertArrayEquals(new int[][]{{3, 3, 3, 3}, {0, 3, 3, 3}, {0, 0, 3, 3,}, {0, 0, 0, 3}}, guide6.exercise_3_a_ii(op2).getResult());
        assertTrue(op2.getCounter() <= 20);
    }

    @Test
    public void exercise_3_a_iii() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new int[][]{{1, 1, 1}, {0, 1, 1}, {0, 0, 1},}, new int[][]{{2, 2, 2}, {0, 2, 2}, {0, 0, 2}});
        assertArrayEquals(new int[][]{{2, 4, 6}, {0, 2, 4}, {0, 0, 2}}, guide6.exercise_3_a_iii(op1).getResult());
        System.out.println(op1.getCounter());
        assertTrue(op1.getCounter() <= 20);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new int[][]{{1, 1, 1, 1}, {0, 1, 1, 1}, {0, 0, 1, 1}, {0, 0, 0, 1}}, new int[][]{{2, 2, 2, 2}, {0, 2, 2, 2}, {0, 0, 2, 2}, {0, 0, 0, 2}});
        assertArrayEquals(new int[][]{{2, 4, 6, 8}, {0, 2, 4, 6}, {0, 0, 2, 4}, {0, 0, 0, 2}}, guide6.exercise_3_a_iii(op2).getResult());
        System.out.println(op2.getCounter());
        assertTrue(op2.getCounter() <= 40);
    }

    @Test
    public void exercise_3_b_i() {
        MatrixVectorOperation op1 = new MatrixVectorOperation(new int[][]{{1, 1, 0}, {1, 1, 1}, {1, 1, 1}}, new int[]{2, 3, 4});
        assertArrayEquals(new int[]{5, 9, 9}, guide6.exercise_3_b_i(op1).getResult());
        System.out.println(op1.getCounter());
        assertTrue(op1.getCounter() <= 16);

        MatrixVectorOperation op2 = new MatrixVectorOperation(new int[][]{{1, 1, 0, 0}, {1, 1, 1, 0}, {1, 1, 1, 1}, {1, 1, 1, 1}}, new int[]{1, 2, 3, 4});
        assertArrayEquals(new int[]{3, 6, 10, 10}, guide6.exercise_3_b_i(op2).getResult());
        System.out.println(op2.getCounter());
        assertTrue(op2.getCounter() <= 26);
    }

    @Test
    public void exercise_3_b_ii() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new int[][]{{1, 1, 0}, {1, 1, 1}, {1, 1, 1}}, new int[][]{{2, 2, 0}, {2, 2, 2}, {2, 2, 2}});
        assertArrayEquals(new int[][]{{3, 3, 0}, {3, 3, 3}, {3, 3, 3}}, guide6.exercise_3_b_ii(op1).getResult());
        assertTrue(op1.getCounter() <= 16);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new int[][]{{1, 1, 0, 0}, {1, 1, 1, 0}, {1, 1, 1, 1}, {1, 1, 1, 1}}, new int[][]{{2, 2, 0, 0}, {2, 2, 2, 0}, {2, 2, 2, 2}, {2, 2, 2, 2}});
        assertArrayEquals(new int[][]{{3, 3, 0, 0}, {3, 3, 3, 0}, {3, 3, 3, 3,}, {3, 3, 3, 3}}, guide6.exercise_3_b_ii(op2).getResult());
        assertTrue(op2.getCounter() <= 26);
    }

    @Test
    public void exercise_3_b_iii() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new int[][]{{1, 1, 0}, {1, 1, 1}, {1, 1, 1}}, new int[][]{{2, 2, 0}, {2, 2, 2}, {2, 2, 2}});
        assertArrayEquals(new int[][]{{4, 4, 2}, {6, 6, 4}, {6, 6, 4}}, guide6.exercise_3_b_iii(op1).getResult());
        System.out.println(op1.getCounter());
        assertTrue(op1.getCounter() <= 42);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new int[][]{{1, 1, 0, 0}, {1, 1, 1, 0}, {1, 1, 1, 1}, {1, 1, 1, 1}}, new int[][]{{2, 2, 0, 0}, {2, 2, 2, 0}, {2, 2, 2, 2}, {2, 2, 2, 2}});
        assertArrayEquals(new int[][]{{4, 4, 2, 0}, {6, 6, 4, 2}, {8, 8, 6, 4}, {8, 8, 6, 4}}, guide6.exercise_3_b_iii(op2).getResult());
        System.out.println(op2.getCounter());
        assertTrue(op2.getCounter() <= 80);
    }

    @Test
    public void exercise_3_c_i() {
        MatrixVectorOperation op1 = new MatrixVectorOperation(new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}, new int[]{2, 3, 4});
        assertArrayEquals(new int[]{5, 9, 7}, guide6.exercise_3_c_i(op1).getResult());
        System.out.println(op1.getCounter());
        assertTrue(op1.getCounter() <= 14);

        MatrixVectorOperation op2 = new MatrixVectorOperation(new int[][]{{1, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 1, 1}, {0, 0, 1, 1}}, new int[]{1, 2, 3, 4});
        assertArrayEquals(new int[]{3, 6, 9, 7}, guide6.exercise_3_c_i(op2).getResult());
        assertTrue(op2.getCounter() <= 20);
    }

    @Test
    public void exercise_3_c_ii() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}, new int[][]{{2, 2, 0}, {2, 2, 2}, {0, 2, 2}});
        assertArrayEquals(new int[][]{{3, 3, 0}, {3, 3, 3}, {0, 3, 3}}, guide6.exercise_3_c_ii(op1).getResult());
        assertTrue(op1.getCounter() <= 16);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new int[][]{{1, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 1, 1}, {0, 0, 1, 1}}, new int[][]{{2, 2, 0, 0}, {2, 2, 2, 0}, {0, 2, 2, 2}, {0, 0, 2, 2}});
        assertArrayEquals(new int[][]{{3, 3, 0, 0}, {3, 3, 3, 0}, {0, 3, 3, 3,}, {0, 0, 3, 3}}, guide6.exercise_3_c_ii(op2).getResult());
        assertTrue(op2.getCounter() <= 26);
    }

    @Test
    public void exercise_3_c_iii() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}, new int[][]{{2, 2, 0}, {2, 2, 2}, {0, 2, 2}});
        assertArrayEquals(new int[][]{{4, 4, 2}, {4, 6, 4}, {2, 4, 4}}, guide6.exercise_3_c_iii(op1).getResult());
        assertTrue(op1.getCounter() <= 34);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new int[][]{{1, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 1, 1}, {0, 0, 1, 1}}, new int[][]{{2, 2, 0, 0}, {2, 2, 2, 0}, {0, 2, 2, 2}, {0, 0, 2, 2}});
        assertArrayEquals(new int[][]{{4, 4, 2, 0}, {4, 6, 4, 2}, {2, 4, 6, 4}, {0, 2, 4, 4}}, guide6.exercise_3_c_iii(op2).getResult());
        assertTrue(op2.getCounter() <= 52);
    }

    @Test
    public void exercise_3_d_i() {
        MatrixVectorOperation op1 = new MatrixVectorOperation(new int[][]{{1, 1, 1}, {1, 1, 1}, {0, 1, 1}}, new int[]{2, 3, 4});
        assertArrayEquals(new int[]{9, 9, 7}, guide6.exercise_3_d_i(op1).getResult());
        assertTrue(op1.getCounter() <= 16);

        MatrixVectorOperation op2 = new MatrixVectorOperation(new int[][]{{1, 1, 1, 1}, {0, 1, 1, 1}, {0, 0, 1, 1}, {0, 0, 0, 1}}, new int[]{1, 2, 3, 4});
        assertArrayEquals(new int[]{10, 9, 7, 4}, guide6.exercise_3_d_i(op2).getResult());
        assertTrue(op2.getCounter() <= 26);
    }

    @Test
    public void exercise_3_d_ii() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new int[][]{{1, 1, 1}, {1, 1, 1}, {0, 1, 1}}, new int[][]{{2, 2, 2}, {2, 2, 2}, {0, 2, 2}});
        assertArrayEquals(new int[][]{{3, 3, 3}, {3, 3, 3}, {0, 3, 3}}, guide6.exercise_3_d_ii(op1).getResult());
        assertTrue(op1.getCounter() <= 16);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}, {0, 0, 1, 1}}, new int[][]{{2, 2, 2, 2}, {2, 2, 2, 2}, {0, 2, 2, 2}, {0, 0, 2, 2}});
        assertArrayEquals(new int[][]{{3, 3, 3, 3}, {3, 3, 3, 3}, {0, 3, 3, 3}, {0, 0, 3, 3}}, guide6.exercise_3_d_ii(op2).getResult());
        assertTrue(op2.getCounter() <= 26);
    }

    @Test
    public void exercise_3_d_iii() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new int[][]{{1, 1, 1}, {1, 1, 1}, {0, 1, 1}}, new int[][]{{2, 2, 2}, {2, 2, 2}, {0, 2, 2}});
        assertArrayEquals(new int[][]{{4, 6, 6}, {4, 6, 6}, {2, 4, 4}}, guide6.exercise_3_d_iii(op1).getResult());
        System.out.println(op1.getCounter());
        assertTrue(op1.getCounter() <= 42);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}, {0, 0, 1, 1}}, new int[][]{{2, 2, 2, 2}, {2, 2, 2, 2}, {0,2, 2, 2}, {0, 0, 2, 2}});
        assertArrayEquals(new int[][]{{4, 6, 8, 8}, {4, 6, 8, 8}, {2, 4, 6, 6}, {0, 2, 4, 4}}, guide6.exercise_3_d_iii(op2).getResult());
        System.out.println(op2.getCounter());
        assertTrue(op2.getCounter() <= 80);
    }

    @Test
    public void exercise_3_e() {
        MatrixMatrixOperation op1 = new MatrixMatrixOperation(new int[][]{{1, 0, 0}, {1, 1, 0}, {1, 1, 1},}, new int[][]{{1, 1, 1}, {0, 1, 1}, {0, 0, 1}});
        assertArrayEquals(new int[][]{{1, 1, 1}, {1, 2, 2}, {1, 2, 3}}, guide6.exercise_3_e(op1).getResult());
        System.out.println(op1.getCounter());
        assertTrue(op1.getCounter() <= 28);

        MatrixMatrixOperation op2 = new MatrixMatrixOperation(new int[][]{{1, 0, 0, 0}, {1, 1, 0, 0}, {1, 1, 1, 0}, {1, 1, 1, 1}}, new int[][]{{1, 1, 1, 1}, {0, 1, 1, 1}, {0, 0, 1, 1}, {0, 0, 0, 1}});
        assertArrayEquals(new int[][]{{1, 1, 1, 1}, {1, 2, 2, 2}, {1, 2, 3, 3}, {1, 2, 3, 4}}, guide6.exercise_3_e(op2).getResult());
        System.out.println(op2.getCounter());
        assertTrue(op2.getCounter() <= 60);
    }

    @Test
    public void exercise_4() {
        ArrayList<double[]> vectors1 = new ArrayList<>(Arrays.asList(new double[]{2, 2, 0}, new double[]{1, 1, 1}));
        List<double[]> result1 = guide6.exercise_4(vectors1);
        norm_1_test(result1);
        orthogonal_test(result1);

        ArrayList<double[]> vectors2 = new ArrayList<>(Arrays.asList(new double[]{0, 0, 1, 1}, new double[]{0, 1, 1, 0}, new double[]{1, 1, 0, 0}));
        List<double[]> result2 = guide6.exercise_4(vectors2);
        norm_1_test(result2);
        orthogonal_test(result2);

        ArrayList<double[]> vectors3 = new ArrayList<>(Arrays.asList(new double[]{1, 3}, new double[]{-1, 2}));
        List<double[]> result3 = guide6.exercise_4(vectors3);
        norm_1_test(result3);
        orthogonal_test(result3);
    }

    private void orthogonal_test(List<double[]> result) {
        for (int i = 0; i < result.size(); i++) {
            for (int j = i + 1; j < result.size(); j++) {
                double actual = Guide6Helpers.dotProduct(result.get(i), result.get(j));
                System.out.println(actual);
                assertEquals(0.0, actual, 0.1);
            }
        }
    }

    private void norm_1_test(List<double[]> result) {
        for (double[] normalizedVector : result) {
            assertEquals(1.0, Guide6Helpers.norm(normalizedVector), 0.1);
        }
    }
}