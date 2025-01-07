package Assigment2.Assigment2_1;

public class Task_2 {
    public static String[] strings = new String[15];

    public static void main(String[] args) {
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 == 0) {
                strings[i] = "Even";
            } else {
                strings[i] = "Odd";
            }
        }
        for (String i : strings) System.out.println(i);
    }
}
