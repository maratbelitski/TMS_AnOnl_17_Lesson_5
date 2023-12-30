import java.util.Arrays;

/**
 * @author Belitski Marat
 * @date 29.12.2023
 * @project TMS_AnOnl_17_Lesson_5
 */

//Задача 2. Умножение матриц.

public class Multiplication {
    public static void main(String[] args) {
        int[][] arrayOne = {{2, 0, 0}, {0, 1, 3}, {4, 2, 0}};
        int[][] arrayTwo = {{2, 2, 3}, {0, 0, 3}, {2, 1, 0}};
        int[][] arrayResult = new int[3][3];

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                arrayResult[i][j] = arrayOne[i][j] * arrayTwo[i][j];
            }
        }
        System.out.printf("Первая матрица: %S \n", Arrays.deepToString(arrayOne));
        System.out.printf("Вторая матрица: %S \n", Arrays.deepToString(arrayTwo));
        System.out.printf("Результат:      %S \n", Arrays.deepToString(arrayResult));

//      Вывод
//      Первая матрица: [[2, 0, 0], [0, 1, 3], [4, 2, 0]]
//      Вторая матрица: [[2, 2, 3], [0, 0, 3], [2, 1, 0]]
//      Результат:      [[4, 0, 0], [0, 0, 9], [8, 2, 0]]
    }
}
