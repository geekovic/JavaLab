// 1. Creating thread by extending Thread class
class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1 - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread 1 interrupted");
            }
        }
    }
}

// 2. Creating thread by implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2 - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread 2 interrupted");
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // Using Thread class
        MyThread1 t1 = new MyThread1();

        // Using Runnable interface
        Thread t2 = new Thread(new MyRunnable());

        // Start both threads
        t1.start();
        t2.start();
    }   }
