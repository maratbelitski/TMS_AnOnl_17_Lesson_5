import java.util.Arrays;

/**
 * @author Belitski Marat
 * @date 29.12.2023
 * @project TMS_AnOnl_17_Lesson_5
 */

//Задача 5. Отсортировать линии квадратного массива

public class SortLine {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 89) + 10;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] ints : array) {
            Arrays.sort(ints);
        }
        System.out.println();


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
