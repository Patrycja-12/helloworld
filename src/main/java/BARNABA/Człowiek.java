package BARNABA;

public class Człowiek {
    private String imię;
    private String nazwisko;
    private String email;

    public Człowiek(String imię, String nazwisko, String email) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public String getImię() {
        return imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getEmail() {
        return email;
    }
}
