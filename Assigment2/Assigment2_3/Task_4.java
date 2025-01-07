package Assigment2.Assigment2_3;

class entity {
    public void move() {
        System.out.println("I'm moving.");
    }

    public void eat() {
        System.out.println("I'm eating.");
    }
}

class Human extends entity {
    public void speak() {
        System.out.println("I can communicate.");
    }
}

class JavaDeveloper extends Human {
    public void code() {
        System.out.println("I know how to communicate in Java.");
    }
}

public class Task_4 {
    public static void main(String[] args) {
        JavaDeveloper javaDev = new JavaDeveloper();
        javaDev.move();
        javaDev.eat();
        javaDev.speak();
        javaDev.code();
    }
}
