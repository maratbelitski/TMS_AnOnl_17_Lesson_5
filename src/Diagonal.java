/**
 * @author Belitski Marat
 * @date 29.12.2023
 * @project TMS_AnOnl_17_Lesson_5
 */

//Задача 4. Вывести диагональ

public class Diagonal {
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        int number = 10;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = number;
                number++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == i) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
