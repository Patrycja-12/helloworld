package tech.barny.sda;

public class App {
    public static void main(String[] args) {
        if (args.length == 2) {
            boolean x = args[0].equals("KOMP");
            boolean o = args[1].equals("KOMP");
            new Gra(x, o).uruchom();
        } else {
            System.out.println("Za mała ilość argumentów...");
        }
    }
}
