public class Autor {
    private  String imie;
    private String nazwisko;
    private int rokUrodzenia;
    private int rokSmierci;

    public Autor(String imie, String nazwisko, int rokUrodzenia, int rokSmierci) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.rokSmierci = rokSmierci;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public int getRokSmierci() {
        return rokSmierci;
    }

    public void setRokSmierci(int rokSmierci) {
        this.rokSmierci = rokSmierci;
    }

    @Override
    public String toString() {
        return String.format("%s, %s (%d, %d)", nazwisko, imie, rokUrodzenia, rokSmierci);
    }
}
