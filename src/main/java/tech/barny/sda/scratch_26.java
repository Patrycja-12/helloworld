package tech.barny.sda;

public class scratch_26 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        long id = thread.getId();
        System.out.println(id);
        String name = thread.getName();
        System.out.println(name);
    }
}
