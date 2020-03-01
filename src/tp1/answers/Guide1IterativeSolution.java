package tp1.answers;

import tp1.Guide1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Guide1IterativeSolution implements Guide1 {
    public int exercise_1_a(int n) {
        int temp = 0;

        for (int i = 1; i <= n; i++) {
            temp += i;
        }

        return temp;
    }

    public int exercise_1_b(int n) {
        int temp = 0;

        for (int i = 1; i <= n; i++) {
            temp += (i * i);
        }

        return temp;
    }

    public int exercise_1_c(int p, int n) {
        int temp = 1;

        for (int i = 1; i <= n; i++) {
            int pow = (int) Math.pow(p, i);
            temp += pow;
        }

        return temp;
    }

    public int exercise_1_d(int n) {
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            temp += (2 * i) - 1;
        }
        return temp;
    }

    public int exercise_1_e(int n) {
        int temp = 0;

        for (int i = 1; i <= n; i++) {
            temp += i * (i + 1);
        }

        return temp;
    }

    public int exercise_1_f(int n) {
        int temp = 0;

        for (int i = 1; i <= n; i++) {
            temp += (i * i * i);
        }

        return temp;
    }

    // Exercise 2
    public int exercise_2_a(int n) {
        int temp = 1;

        for (int i = 1; i <= n; i++) {
            temp = temp * i;
        }
        return temp;
    }


    public int exercise_2_b(int n) {
        return (int) Math.pow(2, n);
    }


    @Override
    public int exercise_2_c(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    @Override
    public int exercise_2_d(int a, int b) {
        int temp = 0;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Exercise 3
    public int exercise_3(int n) {
        char[] temp = String.valueOf(n).toCharArray();
        int count = 0;

        for (char c : temp) {
            if (c == '0') {
                count++;
            }

        }
        return count;
    }

    // Exercise 4
    public boolean exercise_4(int[] array) {
        String input = Arrays.toString(array).replace('[', ' ').replace(']', ' ').replace(',', ' ');
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        String reversed = input1.toString();
        return input.contentEquals(reversed);
    }

    // Exercise 5
    public boolean exercise_5(int[] array, int n) {
        for (int value : array) {
            if (value == n) {
                return true;
            }
        }
        return false;
    }

    // Exercise 6
    public boolean exercise_6_b_i(int n) {
        boolean flag = false;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
    }

    public int exercise_6_b_ii(int n) {
        if (n <= 1) return 2;

        int prime = n;
        boolean found = false;

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

    public int exercise_6_b_iii(int n) {
        ArrayList<Integer> prime_factors = new ArrayList<>();

        while (n % 2 == 0) {
            prime_factors.add(2);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                prime_factors.add(i);
                n /= i;
            }
        }

        if (n > 2) prime_factors.add(n);

        return prime_factors.size();
    }

    public List<Integer> exercise_6_b_iv(int n) {
        ArrayList<Integer> prime_factors = new ArrayList<>();

        while (n % 2 == 0) {
            prime_factors.add(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                prime_factors.add(i);
                n /= i;
            }
        }
        if (n > 2) prime_factors.add(n);
        return prime_factors;
    }

    // Exercise 8
    public int exercise_8(int[] coefs, int n) {
        int result = 0;
        for (int i = coefs.length - 1; i >= 0; i--)
            result = coefs[i] + (n * result);
        return result;
    }


}
