package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup myThreadGroup = new ThreadGroup("My thread group");
        final Thread thread1 = new MyThread(myThreadGroup, "поток 1");
        final Thread thread2 = new MyThread(myThreadGroup, "поток 2");
        final Thread thread3 = new MyThread(myThreadGroup, "поток 3");
        final Thread thread4 = new MyThread(myThreadGroup, "поток 4");

        System.out.println("Создаю потоки...");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(15000);

        System.out.println("Завершаю все потоки.");
        myThreadGroup.interrupt();
    }
}