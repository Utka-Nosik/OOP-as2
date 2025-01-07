package Assigment2.Assigment2_2;

public class Task_7 {
    public static void main(String[] args) {
        signIn("Alice");
        signIn("user");
    }

    public static void signIn(String username) {
        if (username.equals("user")) {
            return;
        }
        System.out.println("Welcome " + username);
        System.out.println("Missed you very much, " + username);
    }
}
