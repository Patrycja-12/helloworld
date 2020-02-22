package tech.barny.sda;

public class OdwracanieTablicy {
    // metoda odwraca elementy w przekazanej jako parametr tablicy
    public static void odwroc(int[] wejscie) {
// indeks pierwszego elementu
        int poczatek  = 0;
// indeks ostatniego elementu
        int koniec = wejscie.length-1;
// dopóki indeks początkowy jest mniejszy od indeksu końcowego
        while (poczatek < koniec) {
// zamieniamy elementy
            int pomoc = wejscie[poczatek];
            wejscie[poczatek]  = wejscie[koniec];
            wejscie[koniec] = pomoc;
// przesuwamy się w kierunku środka wektora zwiększając i zmniejszając odpowiednio indeksy
            poczatek++;
            koniec--;
        }
    }
// metoda wyświetla zawartość tablicy przekazanej jako parametr na ekranie

    public static void pokazTablice(int[] wejscie) {
// każdy element znajdujący się w tablicy wyświetlamy na ekranie
        for(int x : wejscie) System.out.print (x + " ");
        System.out.println ();
    }
    public static void main(String[] args) {
// tworzymy tablicę wypełniając ją od razu danymi
        int[] tablica = {1, 2, 3, 4, 5, 6, 7, 8, 9};
// wyświetlamy tablicę na ekranie
        pokazTablice(tablica);
// odwracamy tablicę
        odwroc(tablica);
// wyświetlamy odwróconą tablicę na ekranie
        pokazTablice(tablica);
    }
}

