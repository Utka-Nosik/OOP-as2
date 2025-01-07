package Assigment2.Assigment2_1;

public class Task_9 {
    public static void main(String[] args) {
        int[][] array = new int[10][];
        for (int i = 0; i < 10; i++) {
            array[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                array[i][j] = i + j;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
