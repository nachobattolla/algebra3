package tp1;

import java.util.ArrayList;
import java.util.List;

public class Guide1IterativeSolution implements Guide1 {

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
        int sum = 0;
        if (n>=0) {
            for (int i = 0; i <= n; i++) {
                sum = (int) (sum + Math.pow(p, i));

            }
            return sum;
        }
        throw new UnsupportedOperationException("TODO");

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

        int r;
        int auxR;

        if (a>=b) {
            r = a%b;

            if (r == 0 || a == 0) {
                return b;
            } else if (b == 0) {
                return a;
            } else {
                while (r != 0) {
                    auxR = r;
                    r = b % r;
                    b = auxR;
                }
                return b;
            }
        }else{
            r = b%a;

            if (r == 0 || b == 0) {
                return a;
            } else if (a == 0) {
                return b;
            } else {
                while (r != 0) {
                    auxR = r;
                    r = a % r;
                    a = auxR;
                }
                return a;
            }
        }
    }

    @Override
    public int exercise_3(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_4(int[] array) {

        int n = array.length;
        boolean palindromic = false;

        for (int i = 0; i < n/2; i++) {
            if (array[i] == array[n-1]){
                palindromic = true;
                n--;
            }else{
                palindromic = false;
                return palindromic;
            }
        }
        return palindromic;

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
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 , 97};
        List factors = new ArrayList();
            int index= 0;
            int num = primes[index];
            while(n!=1)
            {
                while(n%num==0)
                {
                   factors.add(num);
                    n /= num;
                }
                index ++;
                num = primes[index];
            }
            return factors;
        }

    @Override
    public int exercise_8(int[] coefs, int n) {
        int result = 0;

        for (int i = coefs.length - 1; i >= 0; i--) {
            result = coefs[i] + (n * result);
        }
        return result;
    }
}
