package tech.barny.sda;

public class ListaDynamiczna {

  private int[] wewnętrznaTablica;
  private int licznik;

  public ListaDynamiczna() {
  wewnętrznaTablica = new int [4];
  licznik = 0;
  }
  public void dodaj(int i) {
    if (wewnętrznaTablica.length == licznik) {
      int[] wewnetrznaTablica2 = new int[2 * wewnętrznaTablica.length];
      System.arraycopy(wewnętrznaTablica, 0, wewnetrznaTablica2, 0, wewnętrznaTablica.length);
      wewnętrznaTablica = wewnetrznaTablica2;
    }
    wewnętrznaTablica[licznik] = i;
    licznik++;
  }
  public void dodaj(int index, int i) {

  }
}
