package tech.barny.sda;

public class DwaWątki {
    public static void main(String[] args) {
        Thread a = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
        Thread b = new Thread(() -> {
            try {
                a.join();
            } catch (InterruptedException e) {}
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }
        });
        a.start();
        b.start();
    }
}
