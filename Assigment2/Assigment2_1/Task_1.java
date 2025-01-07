package Assigment2.Assigment2_1;

public class Task_1 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        double[] doubleArray = new double[10];

        for (int i = 0; i < 10; i++) {
            intArray[i] = i + 1;
            doubleArray[i] = (i + 1) * 0.5;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("intArray[" + i + "] = " + intArray[i] + ", doubleArray[" + i + "] = " + doubleArray[i]);
        }
    }
}
