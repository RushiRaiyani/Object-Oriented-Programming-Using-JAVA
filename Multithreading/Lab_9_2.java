/* Write a program to create two threads, one thread will print odd 
numbers and second thread will print even numbers between 1 to 20 
numbers. */
package Multithreading;

class MyThread1 extends Thread {

    public void run() {

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println("odd:" + i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }
        }
    }
}

class MyThread2 extends Thread {

    public void run() {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even:" + i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Lab_9_2 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
