package pl.edu.ur.oopl7;

public class Student extends Osoba{
    int nr_ineksu;
    String typ_std;
    String kierunek;
    int rok_std;

    public Student(String imie, String nazwisko, String data_ur, String plec,
                   int nr_ineksu, String typ_std, String kierunek, int rok_std) {
        super(imie,nazwisko,data_ur,plec);
        this.nr_ineksu = nr_ineksu;
        this.typ_std = typ_std;
        this.kierunek = kierunek;
        this.rok_std = rok_std;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nr_ineksu=" + nr_ineksu +
                ", typ_std=" + typ_std +
                ", kierunek=" + kierunek +
                ", rok_std=" + rok_std +
                ", imie=" + imie +
                ", nazwisko=" + nazwisko +
                ", data_ur=" + data_ur +
                ", plec=" + plec +
                '}';
    }
}
