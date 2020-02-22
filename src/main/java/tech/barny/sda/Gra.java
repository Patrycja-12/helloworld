package tech.barny.sda;

public class Gra {

    private Gracz graczX;
    private Gracz graczO;

    public Gra(boolean graczXkomputer, boolean graczOkomputer) {
        graczX = graczXkomputer ? new GraczKomputerowy() : new GraczCzłowiek();
        graczO = graczOkomputer ? new GraczKomputerowy() : new GraczCzłowiek();
    }

    public void uruchom() {
        Plansza plansza = new Plansza();

        System.out.println("Kółko i Krzyżyk");
        System.out.println("Start!");
        System.out.println(plansza);


//        boolean udałoSięX = false;
//        for (int próba = 0; próba < 3; próba++) {
//            try {
//                Współrzędne współrzędneX = graczX.następnyRuch(plansza.obecnyStan());
//                udałoSięX = plansza.wykonajRuch(współrzędneX, Pole.KRZYŻYK);
//                udałoSięX = true;
//                break;
//            } catch (Exception e) {
//                System.out.println("Ruch niepoprawny. Spróbuj jeszcze raz");
//            }
//        }
//        if (!udałoSięX) {
//            throw new RuntimeException("Gracz X nie umie grać w prostą grę");
//        }
//


        while (true) {
            System.out.println("Kolej gracza X");

            boolean udałoSięX;
            do {
                Współrzędne współrzędneX = graczX.następnyRuch(plansza.obecnyStan());
                udałoSięX = plansza.wykonajRuch(współrzędneX, Pole.KRZYŻYK);
                if (!udałoSięX) {
                    System.out.println("Ruch niepoprawny. Spróbuj jeszcze raz");
                }
            } while (!udałoSięX);
            System.out.println(plansza);
            if (plansza.wygrał(Pole.KRZYŻYK)) {
                System.out.println("Gracz X wygrał!");
                break;
            }
            if (plansza.jestPełna()) {
                System.out.println("Plansza jest pełna, remis!");
                break;
            }

            System.out.println("Kolej gracza O");

            boolean udałoSięO;
            do {
                Współrzędne współrzędneO = graczO.następnyRuch(plansza.obecnyStan());
                udałoSięO = plansza.wykonajRuch(współrzędneO, Pole.KÓŁKO);
                if (!udałoSięO) {
                    System.out.println("Ruch niepoprawny. Spróbuj jeszcze raz");
                }
            } while (!udałoSięO);
            System.out.println(plansza);
            if (plansza.wygrał(Pole.KÓŁKO)) {
                System.out.println("Gracz O wygrał!");
                break;
            }
            if (plansza.jestPełna()) {
                System.out.println("Plansza jest pełna, remis!");
                break;
            }
        }
        System.out.println("Koniec, dziękuję za grę");
    }
}