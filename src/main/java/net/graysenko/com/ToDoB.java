package net.graysenko.com;


public class ToDoB {
    public synchronized void methodB(ToDoA a) {
        System.out.println("Метод Б вызван");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Метод Б пытается вызвать метод А");
        a.methodA();
    }

    public synchronized void methodB() {
        System.out.println("Метод Б вызван без параметров");
    }
}
