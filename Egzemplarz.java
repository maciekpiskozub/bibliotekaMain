public class Egzemplarz {
    private  Ksiazka ksiazka;

    public enum Stan{
        WYPOZCZONY, WOLNY
    }

    private Stan stan;

    public Ksiazka getKsiazka() {
        return ksiazka;
    }

    public void setKsiazka(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }

    public Stan getStan() {
        return stan;
    }

    public void setStan(Stan stan) {
        this.stan = stan;
    }
}
