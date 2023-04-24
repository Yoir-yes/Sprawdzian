import java.util.Objects;

/**
 Nazwa Klasy: Uczeń
 Jest to klasa która pozwala nam przypisać imie i nazwisko ucznia
 imie : String, Zawiera imie ucznia
 nazwisko : String, Zawiera nazwisko ucznia
 id : Int, Jest to id ucznia
 **/
public class Uczen {

    String imie;
    String nazwisko;

    int id = 1;
    public Uczen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        id = id;
        id++;
    }


    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczen uczen = (Uczen) o;
        return id == uczen.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", id=" + id;
    }
}
