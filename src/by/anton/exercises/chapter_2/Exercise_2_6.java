package by.anton.exercises.chapter_2;

/**
 * Created by Buben_AV on 22.03.2017.
 */
public class Exercise_2_6 {
    private final String TASK = "#6 Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.";

    public Exercise_2_6() {
        System.out.println(TASK);
        ArrayForExercises matrix = new ArrayForExercises();
        matrix.setMatrixRandom();
        matrix.printMatrix();
        matrix.setMatrix(changeMatrix(matrix.getMatrix()));
        matrix.printMatrix();
    }

    private int[][] changeMatrix(int[][] matrix) {
        //the counts of elements
        boolean out = false;
        Exercise_2_5 exe = new Exercise_2_5(matrix);
   //     do {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (0 < matrix[i][j] && matrix[i][j] < 10) {
                        exe.setElement(matrix[i][j],i,j);
                        matrix = exe.deleteElement();
                        i = 0;
                        break;
                    }
                }
                if (i == matrix.length-1) {
                    out = true;
                }
            }
  //      } while (out == true);
        return matrix;
    }
}
