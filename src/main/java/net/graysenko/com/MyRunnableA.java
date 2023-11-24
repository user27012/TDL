package net.graysenko.com;


public class MyRunnableA implements Runnable {
    private final ToDoA a;
    private final ToDoB b;

    public MyRunnableA(ToDoA a, ToDoB b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        a.methodA(b);
    }
}
