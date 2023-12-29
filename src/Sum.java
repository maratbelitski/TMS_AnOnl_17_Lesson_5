/**
 * @author Belitski Marat
 * @date 29.12.2023
 * @project TMS_AnOnl_17_Lesson_5
 */

//Задача 3. Сумма значений в массиве.

public class Sum {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};  // 30
        int[][] array2 = {{1, 0, 3, 0, 5}, {1, 0, 3, 4, 0}}; // 17
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array2[i][j];
            }
        }
        System.out.println(sum);
    }
}
