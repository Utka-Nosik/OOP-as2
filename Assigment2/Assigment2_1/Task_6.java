package Assigment2.Assigment2_1;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N > 0) {
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            int max = array[0];
            for (int i = 1; i < N; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println(max);
        }
    }
}