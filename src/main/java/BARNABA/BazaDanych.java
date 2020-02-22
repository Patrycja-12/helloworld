package BARNABA;
import java.util.Optional;

public interface BazaDanych {

    public Optional<Człowiek> znajdźCzłowieka(String imię, String nazwisko);

    public void dodajCzłowieka(Człowiek człowiek) throws CzłowiekInstniejeException;

}