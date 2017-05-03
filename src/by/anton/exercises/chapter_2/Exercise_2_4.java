package by.anton.exercises.chapter_2;

/**
 * Created by Buben_AV on 22.03.2017.
 */
public class Exercise_2_4 {
    private final String TASK = "#4 Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.";
    private int matrix[][];
    
    public Exercise_2_4() {
        System.out.println(TASK);
        ArrayForExercises matrix = new ArrayForExercises();
        matrix.setMatrixRandom();
        setMatrix(matrix.getMatrix());
        matrix.setMatrix(this.getMatrix());
        matrix.printMatrix();
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int [][] getMatrix(){
        int k = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = k++;
            }
        }
        return matrix;
    }
}
