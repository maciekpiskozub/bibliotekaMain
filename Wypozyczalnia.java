import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Wypozyczalnia {

    private  Egzemplarz egzemplarz;
    private static double STAWKA = 0.1;
    private LocalDate dataWypozyczenia;
    private LocalDate dataOddania;
    private LocalDate planowanaDataOddania;
    private static final int DLUGOSC = 30;
    public Wypozyczalnia(Egzemplarz egzemplarz) {
        this.egzemplarz = egzemplarz;
        dataWypozyczenia = LocalDate.now();
        planowanaDataOddania = dataWypozyczenia.plusDays(DLUGOSC);
        egzemplarz.setStan(Egzemplarz.Stan.WYPOZCZONY);
    }

    public double oddaj(){
        dataOddania = LocalDate.now();
        egzemplarz.setStan(Egzemplarz.Stan.WOLNY);
        if (dataOddania.isAfter(planowanaDataOddania)){
           int dni = (int)DAYS.between(dataOddania, dataWypozyczenia);
           return dni * STAWKA;
        }
        return 0;
    }
}
