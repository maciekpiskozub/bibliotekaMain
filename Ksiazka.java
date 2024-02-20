public class Ksiazka {

    private String tytul;
    private String autor;
    private String gatunek;
    private String rokWydanie;

    public Ksiazka(String tytul, String autor, String gatunek, String rokWydanie) {
        this.tytul = tytul;
        this.autor = autor;
        this.gatunek = gatunek;
        this.rokWydanie = rokWydanie;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public String getGatunek() {
        return gatunek;
    }

    public String getRokWydanie() {
        return rokWydanie;
    }


    @Override
    public String toString(){
        return  String.format("%s; %s; %d", autor.toString(), tytul, rokWydanie);
    }


}
