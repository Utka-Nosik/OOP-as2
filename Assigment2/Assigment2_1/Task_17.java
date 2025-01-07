package Assigment2.Assigment2_1;

public class Task_17 {
    public static void main(String[] args) {
        char[][] array = {
                {'a', 'b', 'c', 'd', 'e', 'f'},
                {'g', 'h', 'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p', 'q', 'r'},
                {'s', 't', 'u', 'v', 'w', 'x'}
        };

        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                array[i][j] = '-';
            }
        }

        printArray(array);
    }

    private static void printArray(char[][] array) {
        for (char[] chars : array) {
            for (char aChar : chars) System.out.print(aChar + " ");
            System.out.println();
        }
    }
}
