package Assigment2.Assigment2_1;

public class Task_11 {
    public static int[][][] multiArray;

    public static void main(String[] args) {
        multiArray = new int[2][3][4];
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    multiArray[i][j][k] = i + j + k;
                }
            }
        }
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.println(multiArray[i][j][k]);
                }
            }
        }
    }
}
