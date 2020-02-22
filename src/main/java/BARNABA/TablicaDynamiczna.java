package BARNABA;

import tech.barny.sda.Tablice;

public class TablicaDynamiczna {
    private int i;
    private int[] tablica;
    public TablicaDynamiczna() {
        i = 0;
        tablica = new int[100];
    }
    public int get(int index) {
        if (index >= i || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return tablica[index];
    }
    public int size() {
        return i;
    }
    public void add(int x) {
        if (i == tablica.length) {
            zwiększTablicę();
        }
        tablica[i++] = x;
    }
    public void add(int index, int x) {
        if (i == tablica.length) {
            zwiększTablicę();
        }
        System.arraycopy(tablica, index, tablica, index + 1, i - index);
        tablica[index] = x;
        i++;
    }
    private void zwiększTablicę() {
        int nowaDługość;
        if (tablica.length == 0) {
            nowaDługość = 100;
        } else {
            nowaDługość = tablica.length * 2;
        }
        int[] nowaTablica = new int[nowaDługość];
        System.arraycopy(tablica, 0, nowaTablica, 0, i);
        tablica = nowaTablica;
    }
}