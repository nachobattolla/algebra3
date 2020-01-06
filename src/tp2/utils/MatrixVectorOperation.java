package tp2.utils;

public class MatrixVectorOperation {
    private final int[][] matrix;
    private final int[] vector;
    private int[] result;
    private int counter;

    public MatrixVectorOperation(int[][] matrix1, int[]vector) {
        this.matrix = matrix1;
        this.vector = vector;
    }

    public int getMatrixValue(int i, int j) {
        counter+=1;
        return matrix[i][j];
    }

    public int getVectorValue(int i) {
        counter+=1;
        return vector[i];
    }

    public int[] getResult() {
        return result;
    }

    public void setResult(int[] result) {
        this.result = result;
    }

    public int getCounter() {
        return counter;
    }

    public int getMatrixRows() {
        return matrix.length;
    }

    public int getMatrixColumns() {
        return matrix[0].length;
    }

    public int getVectorSize() {
        return vector.length;
    }

}
