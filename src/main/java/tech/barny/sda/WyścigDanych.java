package tech.barny.sda;

public class WyścigDanych {
    private static final Object LOCK = new Object();
    private static int n = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 100000; i++) {
                increment();
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.printf("Expected/Actual: %d/%d%n", 200000, n);
    }

    public static void increment() {
        synchronized (LOCK) {
            n++;
        }
    }

    public static void decrement() {
        synchronized (LOCK){
            n--;
        }
    }
}
