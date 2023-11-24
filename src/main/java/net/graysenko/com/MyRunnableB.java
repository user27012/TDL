package net.graysenko.com;


public class MyRunnableB implements Runnable {
    private final ToDoA a;
    private final ToDoB b;

    public MyRunnableB(ToDoA a, ToDoB b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        b.methodB(a);
    }
}
