/* Write an application that executes two threads. One thread 
displays "Good Morning" every 1000 milliseconds & another thread 
displays "Good Afternoon" every 3000 milliseconds. Create the 
threads by implementing the Runnable interface.
 */
package Multithreading;

class MyRunnable1 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable2 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Good Afternoon");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Lab_9_1 {
    public static void main(String[] args) {
        MyRunnable1 runnable1 = new MyRunnable1();
        Thread t1 = new Thread(runnable1);
        t1.start();
        MyRunnable2 runnable2 = new MyRunnable2();
        Thread t2 = new Thread(runnable2);
        t2.start();
    }
}
