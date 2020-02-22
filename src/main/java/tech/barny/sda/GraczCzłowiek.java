package tech.barny.sda;

import java.util.Scanner;

public class GraczCzłowiek implements Gracz{

    private Scanner scanner = new Scanner(System.in);

@Override
    public Współrzędne następnyRuch(Pole[][] plansza) {
// drukuj(plansza);
        System.out.println("Podaj swój następny ruch: ");
        String[] input = scanner.nextLine().split(" ");

        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        Współrzędne współrzędne = new Współrzędne(x, y);

        return współrzędne;
    }
// Współrzędne współrzędne;
// while (true) {
//    try {
//        String[] input = scanner.nextLine().split(" ");
//        int x = Integer.perseInt(input[0]);
//        int y = Integer.perseInt(input[1]);
//        współrzędne = new Współrzędne(x, y);
//        break;
//    } catch (NumberFormatException nfe) {
//        System.out.println("Nie podałeś liczby");
//        System.out.println("Spróbuj jeszcze raz");
//    } catch (Exception e){
//        String message = e.getMessage();
//        System.out.printf("Wystąpił wyjatek: %s%n", message);
//        System.out.println("Spróuj jeszczeraz!");
//    }
//    }

    private void drukuj(Pole[][] plansza) {
        for (Pole[] rząd : plansza) {
            System.out.printf("|%c|%c|%c|%n",
                    rząd[0].getZnak(),
                    rząd[1].getZnak(),
                    rząd[2].getZnak()
            );
        }
    }

}
