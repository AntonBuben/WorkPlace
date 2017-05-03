package by.anton.exercises.chapter_2;

/**
 * Created by Buben_AV on 22.03.2017.
 */
public class Exercise_2_5 {
    private final String TASK = "#5 Найти максимальный элемент (ы) в матрице и удалить из матрицы \n" +
            "строку и столбец, его содержащий.";
    private int element[] = new int[3];
    private int matrix[][];

    public Exercise_2_5() {
        System.out.println(TASK);
        ArrayForExercises matrix = new ArrayForExercises();
        matrix.setMatrixRandom();
        matrix.printMatrix();
        this.matrix = matrix.getMatrix();
        setElement();
        matrix.setMatrix(deleteElement());
        matrix.printMatrix();
    }

    public Exercise_2_5(int matrix[][]) {
        this.matrix = matrix;
    }

    public void setElement(int element,int i,int j) {
        this.element[0] = element;
        this.element[1] = i;
        this.element[2] = j;
    }

    public void setElement() {
        int max[] = {matrix[0][0], 0, 0};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
//                System.out.print(max[0]+ " ");
                if (max[0] < matrix[i][j]) {
                    max[0] = matrix[i][j];
                    max[1] = i;
                    max[2] = j;
                }
            }
        }
        this.element = max;
    }

    public int[][] deleteElement() {
        System.out.println("Max element : " + element[0]+" i: "+ element[1]+" j: "+ element[2]);
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[0].length-1; j++) {
                if (i < element[1] && j >= element[2]) {
                    matrix[i][j] = matrix[i][j + 1];
                    matrix[i][j+1] = 0;
                }
                if (i >= element[1] && j < element[2]) {
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i+1][j] = 0;
                }
                if (i >= element[1] && j >= element[2]) {
                    matrix[i][j] = matrix[i + 1][j+1];
                    matrix[i+1][j+1] = 0;
                }
            }
        }
        matrix[element[1]][matrix[0].length-1]=0;
        matrix[matrix.length-1][element[2]]=0;
    return matrix;
    }
}
