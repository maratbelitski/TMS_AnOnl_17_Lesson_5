import java.util.Scanner;

/**
 * @author Belitski Marat
 * @date 29.12.2023
 * @project TMS_AnOnl_17_Lesson_5
 */

// Задача 0.
// Создать трехмерный массив, пройтись по нему и увеличить на указанное число.

public class ArrayX3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][][] array = {{{2, 2, 2}, {2, 2, 2}, {2, 2, 2}}, {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}}, {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}}};

        System.out.println("Введите число для увеличения массива: ");
        int number = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] += number;
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}