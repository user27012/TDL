package net.graysenko.com;


public class Main {
    public static void main(String[] args) {
        ToDoA a = new ToDoA();
        ToDoB b = new ToDoB();

        Thread threadA = new Thread(new MyRunnableA(a, b));
        Thread threadB = new Thread(new MyRunnableB(a, b));

        threadA.start();
        threadB.start();
    }
}
