package tp1.answers;

import tp1.Guide1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Guide1RecursiveSolution implements Guide1 {
    @Override
    public int exercise_1_a(int n) {
        return exercise_1_a_helper(n, 0);
    }

    private int exercise_1_a_helper(int n, int acc) {
        if (n == 0) {
            return acc;
        } else {
            int accc = acc + n;
            return exercise_1_a_helper(--n, accc);
        }
    }

    @Override
    public int exercise_1_b(int n) {
        return exercise_1_b_helper(n, 0);
    }

    private int exercise_1_b_helper(int n, int acc) {
        if (n == 0) {
            return acc;
        } else {
            int accc = acc + (int) Math.pow(n, 2);
            return exercise_1_b_helper(--n, accc);
        }
    }


    @Override
    public int exercise_1_c(int p, int n) {
        return exercise_1_c_helper(n, p, 1);
    }

    private int exercise_1_c_helper(int n, int p, int acc) {
        if (n == 0) {
            return acc;
        } else {
            int accc = acc + (int) Math.pow(p, n);
            return exercise_1_c_helper(--n, p, accc);
        }
    }

    @Override
    public int exercise_1_d(int n) {
        return exercise_1_d_helper(n, 0);
    }

    private int exercise_1_d_helper(int n, int acc) {
        if (n == 0) {
            return acc;
        } else {
            int accc = acc + ((2 * n) - 1);
            return exercise_1_d_helper(--n, accc);
        }
    }

    @Override
    public int exercise_1_e(int n) {
        return exercise_1_e_helper(n, 0);
    }

    private int exercise_1_e_helper(int n, int acc) {
        if (n == 0) {
            return acc;
        } else {
            int accc = acc + (n * (n + 1));
            return exercise_1_e_helper(--n, accc);
        }
    }

    @Override
    public int exercise_1_f(int n) {
        return exercise_1_f_helper(n, 0);
    }

    private int exercise_1_f_helper(int n, int acc) {
        if (n == 0) {
            return acc;
        } else {
            int accc = acc + (int) Math.pow(n, 3);
            return exercise_1_f_helper(--n, accc);
        }
    }

    @Override
    public int exercise_2_a(int n) {
        if (n == 0)
            return 1;
        else
            return (n * exercise_2_a(n - 1));
    }

    @Override
    public int exercise_2_b(int n) {
        return exercise_2_b_helper(0, n, 1);
    }

    private int exercise_2_b_helper(int i, int n, int acc) {
        if (i == n) return acc;
        else return exercise_2_b_helper(++i, n, (int) Math.pow(2, n));
    }

    public int exercise_2_c(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return exercise_2_c(n - 2) + exercise_2_c(n - 1);

    }

    public int exercise_2_d(int a, int b) {
        if (b == 0) {
            return a;
        }
        return exercise_2_d(b, a % b);
    }

    @Override
    public int exercise_3(int n) {
        char[] temp = String.valueOf(n).toCharArray();
        return exercise_3_helper(temp, temp.length - 1, 0);
    }

    private int exercise_3_helper(char[] temp, int length, int acc) {
        if (length == 0) {
            return acc;
        } else {
            if (temp[length] == '0') ++acc;
            return exercise_3_helper(temp, --length, acc);
        }
    }

    @Override
    public boolean exercise_4(int[] array) {
        String str = Arrays.toString(array).replace('[', ' ').replace(']', ' ').replace(',', ' ');
        int n = str.length();

        if (n == 0)
            return true;

        return exercise_4_helper(str, 0, n - 1);
    }

    private boolean exercise_4_helper(String str, int s, int e) {
        if (s == e)
            return true;

        if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        if (s < e + 1)
            return exercise_4_helper(str, s + 1, e - 1);

        return true;
    }


    @Override
    public boolean exercise_5(int[] array, int n) {
        return exercise_5_helper(array, 0, n);
    }

    private boolean exercise_5_helper(int[] array, int i, int n) {
        if (i == array.length - 1) return false;
        else if (array[i] == n) return true;
        else return exercise_5_helper(array, ++i, n);

    }

    @Override
    public boolean exercise_6_b_i(int n) {
        return exercise_6_b_i_helper(n, 2);
    }

    private boolean exercise_6_b_i_helper(int n, int i) {
        // Base cases
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return exercise_6_b_i_helper(n, i + 1);
    }

    @Override
    public int exercise_6_b_ii(int n) {
        if (n <= 1) return 2;

        int prime = n;
        boolean found = false;

        // TODO figure out how to do this recursively
        if (exercise_6_b_i(prime)) {
            return prime;
        } else {
            while (!found) {
                prime++;
                if (exercise_6_b_i(prime)) found = true;
            }
        }
        return prime;
    }

    @Override
    public int exercise_6_b_iii(int n) {
        return exercise_6_b_iv(n).size();
    }

    @Override
    public List<Integer> exercise_6_b_iv(int n) {
        return exercise_6_b_iv_helper(n, 2);
    }

    //overload a private method that also takes f as argument:
    private List<Integer> exercise_6_b_iv_helper(int n, int f) {
        if (n == 1) return new ArrayList<Integer>();
        if (n % f == 0) {
            List<Integer> factors = exercise_6_b_iv_helper(n / f, f);
            factors.add(f);
            return factors;
        } else
            return exercise_6_b_iv_helper(n, f + 1);
    }

    @Override
    public int exercise_8(int[] coefs, int n) {
        return exercise_8_helper(coefs, coefs.length - 1, n, 0);
    }

    private int exercise_8_helper(int[] coefs, int i, int n, int result) {
        if (i < 0) {
            return result;
        } else {
            int accc = coefs[i] + (n * result);
            return exercise_8_helper(coefs, --i, n, accc);
        }
    }
}
