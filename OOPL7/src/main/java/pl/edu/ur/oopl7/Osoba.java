package pl.edu.ur.oopl7;

public class Osoba {
    String imie;
    String nazwisko;
    String data_ur;
    String plec;

    public Osoba(String imie, String nazwisko, String data_ur, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data_ur = data_ur;
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie=" + imie +
                ", nazwisko=" + nazwisko +
                ", data_ur=" + data_ur +
                ", plec=" + plec +
                '}';
    }
}
