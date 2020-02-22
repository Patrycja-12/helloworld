package BARNABA;

public class RotatorTablic {

    public int[] rotuj(int[] tablica) {
        int długość = tablica.length;
        int[] wynik = new int[długość];
        for (int i = 0; i < długość - 1; i += 2) {
            wynik[i] = tablica[i + 1];
            wynik[i + 1] = tablica[i];
        }
        if (długość % 2 != 0) {
            wynik[długość - 1] = tablica[długość - 1];
        }
        return wynik;
    }

}
