package tech.barny.sda;

public class SpójnośćPamięci {
    private static volatile boolean przełącznik = true;
    public static void main(String[] args) throws InterruptedException {
        Thread b = new Thread(() -> {
            System.out.println("B: Czekam na przełącznik..");
            while (przełącznik) {
                // nie rób nic
            }
            System.out.println("B: Przełącznik przełączony");
        });
        b.start();
        Thread.sleep(1000);
        System.out.println("A: przełączam przełącznik");
        przełącznik = false;
        System.out.println("A: przełączyłem przełącznik");
    }
}
