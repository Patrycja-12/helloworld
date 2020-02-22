package BARNABA;

    import java.util.Optional;

    public class WysyłaczEmaili {

        private BazaDanych bazaDanych;


        public WysyłaczEmaili(BazaDanych bazaDanych) {
            this.bazaDanych = bazaDanych;
        }

        public boolean wyślijEmaila(String imię, String nazwisko, String treść) {
            Optional<Człowiek> człowiek = bazaDanych.znajdźCzłowieka(imię, nazwisko);
            if (!człowiek.isPresent()) {
                return false;
            }

            System.out.println("Wysyłam maila na: " + człowiek.get().getEmail());
            return true;
        }
    }

