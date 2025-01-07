package Assigment2.Assigment2_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        char[][] array = new char[height][2 * height - 1];

        for (int i = 0; i < height; i++) {
            Arrays.fill(array[i], ' ');

            int start = height - i - 1;
            int end = height + i - 1;

            for (int j = start; j <= end; j++) {
                array[i][j] = '#';
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
