package pl.edu.ur.oopl7;

public class Wykladowca extends Osoba{
    String specjalizacja;
    String lataPracy;
    String stopien;

    public Wykladowca(String imie, String nazwisko, String data_ur, String plec,
                      String specjalizacja, String lataPracy, String stopien) {
        super(imie,nazwisko,data_ur,plec);
        this.specjalizacja = specjalizacja;
        this.lataPracy = lataPracy;
        this.stopien = stopien;
    }

    @Override
    public String toString() {
        return "Wykladowca{" +
                "specjalizacja=" + specjalizacja +
                ", lataPracy=" + lataPracy +
                ", stopien=" + stopien +
                ", imie=" + imie +
                ", nazwisko=" + nazwisko +
                ", data_ur=" + data_ur +
                ", plec=" + plec +
                '}';
    }
}
