import java.awt.*;
import java.util.Scanner;

public class TaskOneMatrix {

    private static int[][] getArr() {
        System.out.println("Введите размер квадратной матрицы: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        return new int[size][size];
    }

    public static void xMatrix() {
        int[][] arr = getArr();
        for (int i = 0; i < arr.length; i++) {  //идём по строкам
            for (int j = 0; j < arr.length; j++) {//идём по столбцам
                if (i == j || j == arr.length - 1 - i) {
                    arr[i][j] = 1;
                }
                System.out.print(" " + arr[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
    }

    public static void crossMatrix() {
        int[][] arr = getArr();
        for (int i = 0; i < arr.length; i++) {  //идём по строкам
            for (int j = 0; j < arr.length; j++) {//идём по столбцам
                if (i == arr.length / 2 || j == arr.length / 2) {
                    arr[i][j] = 1;
                }
                System.out.print(" " + arr[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
    }

    public static void squareMatrix() {
        int[][] arr = getArr();
        for (int i = 0; i < arr.length; i++) {  //идём по строкам
            for (int j = 0; j < arr.length; j++) {//идём по столбцам
                if (i == arr.length - 1 || j == arr.length - 1 || i == 0 || j == 0) {
                    arr[i][j] = 1;
                }
                System.out.print(" " + arr[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
    }

    public static void rhombMatrix() {
        int[][] arr = getArr();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == arr.length / 2 - i || j == arr.length / 2 + i || i == arr.length / 2 + j || i == arr.length / 2 + (arr.length - 1 - j)) {
                    arr[i][j] = 1;
                }
                System.out.print(" " + arr[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
    }
}

