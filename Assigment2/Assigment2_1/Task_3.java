package Assigment2.Assigment2_1;

public class Task_3 {
    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                if(array[i] < 0){
                    array[i] = abs(array[i]);
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static int abs(int i) {
        if (i < 0) {
            return -i;
        }
        else {
            return i;
        }
    }
}
