package by.anton.exercises.chapter_2;

/**
 * Created by Buben_AV on 22.03.2017.
 */
public class Exercise_2_5 {
    private final String TASK = "#5 Найти максимальный элемент (ы) в матрице и удалить из матрицы все\n" +
            "строки и столбцы, его содержащие.";

    public Exercise_2_5() {
        ArrayForExercises matrix = new ArrayForExercises();
        matrix.setMatrixRandom();
        matrix.printMatrix();
        matrix.setMatrix(deleteElementMax(matrix.getMatrix()));
        matrix.printMatrix();
    }

    private int[][] deleteElementMax(int[][] matrix) {
        int max[] = {matrix[0][0], 0, 0};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (max[0] > matrix[i][j]) {
                    max[0] = matrix[i][j];
                    max[1] = i;
                    max[2] = j;
                }
            }
        }
        System.out.println("Max element : " + max[0]+" i: "+max[1]+" j: "+max[2]);
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[0].length-1; j++) {
                if (i <max[1] && j <= max[2]) {
                    matrix[i][j] = matrix[i][j + 1];
                    matrix[i][j+1] = 0;
                }
                if (i >=max[1] && j <max[2]) {
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i+1][j] = 0;
                }
                if (i >=max[1] && j >= max[2]) {
                    matrix[i][j] = matrix[i + 1][j+1];
                    matrix[i+1][j+1] = 0;
                }
            }
        }

    return matrix;
    }
}
