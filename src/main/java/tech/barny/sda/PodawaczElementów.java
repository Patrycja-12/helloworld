package tech.barny.sda;

import java.util.InputMismatchException;
import java.util.Scanner;
public class PodawaczElementów {
    private Scanner scanner;
    private String[] tablica;
    public PodawaczElementów(Scanner scanner, String[] tablica) {
        this.scanner = scanner;
        this.tablica = tablica;
    }
    public String podaj() {
        System.out.println("Podaj liczbę:");
        while (true) {
            try {
                return tablica[scanner.nextInt()];
            } catch (InputMismatchException fadsjflsdjlfjal) {
                String message = fadsjflsdjlfjal.getMessage();
                System.out.println(message);
                scanner.next();
                System.out.println("To nie jest liczba. Spróbuj jeszcze raz");
            } catch (ArrayIndexOutOfBoundsException aie) {
                System.out.println("Poza zakresem. Spróbuj jeszcze raz");
            }
        }
    }
    public static void main(String[] args) {
        String[] tablica = {"Kompot", "Cezary", "Baldachim"};
        PodawaczElementów podawacz = new PodawaczElementów(new Scanner(System.in), tablica);
        System.out.println(podawacz.podaj());
    }
}
