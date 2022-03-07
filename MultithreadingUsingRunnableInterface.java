class MyThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am Thread1");
        }
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am Thread-2");
        }
    }
}

public class MultithreadingUsingRunnableInterface {
    public static void main(String[] args) {
        MyThread1 bullet1 = new MyThread1();
        MyThread2 bullet2 = new MyThread2();

        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
