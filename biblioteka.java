import java.util.ArrayList;
import java.util.Scanner;
public class biblioteka {

    ArrayList<Ksiazka> ksiazki = new ArrayList<>();
    ArrayList<Egzemplarz> egzemplarze = new ArrayList<>();
    ArrayList<Wypozyczalnia> wypozeczenia = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);
    public void dodajKsiazke(){
        System.out.println("Podaj tytul");
        String tytul = scanner.nextLine();
        System.out.println("podaj gatunek");
        Gatunek gatunek = switch (scanner.nextLine()) {
            case "horror" -> Gatunek.HORROR;
            case "fantastyka" -> Gatunek.FANTASTYKA;
            case "kryminał" -> Gatunek.KRYMINAL;
            case "satyra" -> Gatunek.SATYRA;
            case "biografia" -> Gatunek.BIOGRAFIA;
            default -> null;
        };

        System.out.println("Podaj rok wydania");
        int rokWydania = Integer.parseInt(scanner.nextLine());
    }

    public Autor dodajAutora() {
        System.out.println("Podaj imie autora");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko autora");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj rok urodzenia");
        int rokUrodzenia = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj rok smierci(0, jesli autor zyje)");
        int rokSmierci = Integer.parseInt(scanner.nextLine());
        return new Autor(imie, nazwisko, rokUrodzenia, rokSmierci);
    }


    public Ksiazka znajdzKsiazke(String tytul){
        for(Ksiazka ksiazka : ksiazki){
            if(ksiazka.getTytul().equals(tytul)){
                return ksiazka;
            }
        }
        return null;
    }
    public ArrayList<Ksiazka> znajdzKsiazkiAutora(Autor autor){
        ArrayList<Ksiazka> wyniki = new ArrayList<>();
        for (Ksiazka ksiazka : ksiazki) {
            if (ksiazka.getAutor().equals(autor.getImie() + autor.getNazwisko())) {
                wyniki.add(ksiazka);
            }
        }
        return wyniki;
    }

    public ArrayList<Ksiazka> znajdzKsiazkiPoGatunku(Gatunek gatunek){
        ArrayList <Ksiazka> wyniki = new ArrayList<>();
        for (Ksiazka ksiazka : ksiazki) {
            if (ksiazka.getGatunek().equals(gatunek)) {
                wyniki.add(ksiazka);
            }
        }
        return wyniki;
    }
     public Egzemplarz znajdzWolnyEgzemplarzKsiazki(Ksiazka ksiazki){
        for (Egzemplarz egzemplarz : egzemplarze){
            if (egzemplarz.getKsiazka().equals(ksiazki) && egzemplarz.getStan() == (Egzemplarz.Stan.WOLNY)){
                return egzemplarz;
            }
        }
         return null;
     }

}
