/**
 * @author Belitski Marat
 * @date 29.12.2023
 * @project TMS_AnOnl_17_Lesson_5
 */

//Задача 1. Создание и раскраска массива в шахматную доску.

public class Chess {
    public static void main(String[] args) {

        String[][] array = new String[8][8];

        String letterA;
        String letterB;

        for (int i = 0; i < array.length; i++) {

            if (i % 2 == 0) {
                letterA = "W";
                letterB = "B";

            } else {
                letterA = "B";
                letterB = "W";
            }

            for (int j = 0; j < array[i].length; j++) {
                if (j % 2 == 0) {
                    array[i][j] = letterA;
                } else {
                    array[i][j] = letterB;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
