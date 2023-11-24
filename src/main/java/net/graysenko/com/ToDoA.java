package net.graysenko.com;


public class ToDoA {
    public synchronized void methodA(ToDoB b) {
        System.out.println("Метод А исполнен");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Метод А пытается вызвать метод Б");
        b.methodB(this);
    }

    public synchronized void methodA() {
        System.out.println("Метод А вызван без пораметров");
    }
}
