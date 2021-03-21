package tp1;

import java.util.List;

public class Guide1RecursiveSolution implements Guide1 {

    @Override
    public int exercise_1_a(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_b(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_c(int p, int n) {
        int sum;
        if(n>=0){
            sum =excercise1Aux(p,n,0,0);
        return sum;
        }
        else
        throw new UnsupportedOperationException("TODO");
    }
    public int excercise1Aux(int p , int n,int i,int sum){
        if (i<n) {
            sum = (int) (sum + Math.pow(p,i));
            i = i+1;
            excercise1Aux(p,n,i,sum);
        }
        return sum;
    }
    @Override
    public int exercise_1_d(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_e(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_f(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_2_a(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_2_b(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_2_c(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_2_d(int a, int b) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_3(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_4(int[] array) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_5(int[] array, int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_6_b_i(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_6_b_ii(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_6_b_iii(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public List<Integer> exercise_6_b_iv(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_8(int[] coefs, int n) {
        throw new UnsupportedOperationException("TODO");
    }
}
