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

        int resto;
        int auxResto;

        if (a>=b) {
            resto = a%b;

            if (resto == 0 || a == 0) {
                return b;
            } else if (b == 0) {
                return a;
            } else {
                while (resto != 0) {
                    auxResto = resto;
                    resto = b % resto;
                    b = auxResto;
                }
                return b;
            }
        }else{
            resto = b%a;

            if (resto == 0 || b == 0) {
                return a;
            } else if (a == 0) {
                return b;
            } else {
                while (resto != 0) {
                    auxResto = resto;
                    resto = a % resto;
                    a = auxResto;
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
        boolean capicúa = false;

        for (int i = 0; i < n/2; i++) {
            if (array[i] == array[n-1]){
                capicúa = true;
                n--;
            }else{
                capicúa = false;
                return capicúa;
            }
        }
        return capicúa;

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
        int[] primos = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 , 97};
        List list = new ArrayList();
            int index= 0;
            int num = primos[index];
            while(n!=1)
            {
                while(n%num==0)
                {
                   list.add(num);
                    n /= num;
                }
                index ++;
                num = primos[index];
            }
            return  list;
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
