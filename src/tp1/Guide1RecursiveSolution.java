package tp1;

import java.util.ArrayList;
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

        if(n>=0){
            return excercise1Aux(p,n,0,0);
        }
        throw new UnsupportedOperationException("TODO");

    }

    private int excercise1Aux(int p , int n,int i,int sum){

        if (i<=n) {
            sum = (int) (sum + Math.pow(p,i));
            return excercise1Aux(p,n,++i,sum);
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
        if (a>=b) {
            return exercise_2_dAux(a, b, a % b);
        } else {
            return exercise_2_dAux(b, a, b % a);
        }
    }

    private int exercise_2_dAux(int a, int b, int c) {
        int auxC;

        if (b == 0) {
            return a;
        } else if (c == 0||a == 0) {
            return b;
        } else {
            auxC = c;
            c = b % c;
            b = auxC;
            return exercise_2_dAux(b,c, b%c);
        }
    }

    @Override
    public int exercise_3(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_4(int[] array) {
        return exercise_4Aux(array,0,array.length,false);
    }

    private boolean exercise_4Aux(int[] array,int i, int n,boolean capicúa) {
        if (i<n/2){
            if (array[i]== array[n-1]){
                capicúa=true;
            }else {
                capicúa = false;
            }
        return exercise_4Aux(array, ++i, --n, capicúa);
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
        return exercise_6_b_ivAux(n,primos,list,0);
    }

    private List<Integer> exercise_6_b_ivAux (int n, int[] primos, List list, int index) {
        int num = primos[index];
        if(n!=1){
            while(n%num==0)
            {
                list.add(num);
                n /= num;
            }
            index++;
            return exercise_6_b_ivAux(n,primos,list,index);
        }
        return list;
    }

    @Override
    public int exercise_8(int[] coefs, int n) {

        return exercise_8Aux(coefs,n,coefs.length-1,0);

    }

    private int exercise_8Aux(int[] coefs, int n, int i, int result){
        if (i < 0){
            return result;
        }else {
            result = result*n + coefs[i];
            return exercise_8Aux(coefs,n,i-1,result);
        }
    }

}
