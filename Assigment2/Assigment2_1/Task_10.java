package Assigment2.Assigment2_1;

import java.util.Scanner;

public class Task_10 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        multiArray = new int[N][];
        for (int i = 0; i < N; i++) {
            int size = scanner.nextInt();
            multiArray[i] = new int[size];
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}
