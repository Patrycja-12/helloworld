package BARNABA;

public class OdwracanieTablicy {
            public static int[] odwroc(int[] wejscie) {
            int poczatek = 0;
            int koniec = wejscie.length-1;
            while (poczatek < koniec){
                int pomoc = wejscie[poczatek];
                wejscie[poczatek] = wejscie[koniec];
                wejscie[koniec] = pomoc;
                poczatek++;
                koniec--;
            }
            return wejscie;
        }

        public static void pokazTablice(int[] wejscie) {
            for (int x : wejscie) System.out.println(x + " ");
            System.out.println();
        }

        public static void main(String[] args) {
            int[] tablica = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            pokazTablice(tablica);
            odwroc(tablica);
            pokazTablice(tablica);
        }
    }

