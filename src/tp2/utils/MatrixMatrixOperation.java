package tp2.utils;

public class MatrixMatrixOperation {
    private final int[][] matrix1;
    private final int[][] matrix2;
    private int[][] result;
    private int counter;

    public MatrixMatrixOperation(int[][] matrix1, int[][] matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public int getMatrix1Value(int i, int j) {
        counter += 1;
        return matrix1[i][j];
    }

    public int getMatrix2Value(int i, int j) {
        counter += 1;
        return matrix2[i][j];
    }

    public int[][] getResult() {
        return result;
    }

    public void setResult(int[][] result) {
        this.result = result;
    }

    public int getCounter() {
        return counter;
    }

    public int getMatrix1Rows() {
        return matrix1.length;
    }

    public int getMatrix1Columns() {
        return matrix1[0].length;
    }

    public int getMatrix2Rows() {
        return matrix2.length;
    }

    public int getMatrix2Columns() {
        return matrix2.length;
    }
}
