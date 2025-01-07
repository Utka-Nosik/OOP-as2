package Assigment2.Assigment2_1;
import java.util.Arrays;

public class Task_4 {
    public static int[] firstArray = new int[]{0, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray = new int[0];

    public static void main(String[] args) {
        for (int i = 0; i < firstArray.length; i++) {
            resultArray = addElement(resultArray, firstArray[i]);
        }
        for (int i = 0; i < secondArray.length; i++) {
            resultArray = addElement(resultArray, secondArray[i]);
        }
        for (int i : resultArray) {
            System.out.print(i + " ");
        }
    }
    public static int[] addElement(int[] resultArray, int newElement) {
        int[] newArray = Arrays.copyOf(resultArray, resultArray.length + 1);
        newArray[newArray.length - 1] = newElement;
        return newArray;
    }


}
