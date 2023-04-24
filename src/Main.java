import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        for (int i = 0; i<5; i++){
            System.out.println("Podaj imie ucznia: ");
            String imie = in.next();
            System.out.println("Podaj nazwisko ucznia: ");
            String nazwisko = in.next();
            ListaUczniow.dodaj(imie,nazwisko);
        }
        ListaUczniow.wyświetl();
        ArrayList<Uczen> uczniowie = new ArrayList<>();
        uczniowie.add(new Uczen("Krzysiu","Reat"));
        uczniowie.add(new Uczen("Andrzej","Tatowski"));
        uczniowie.add(new Uczen("Adam","Nowak"));

        Comparator<Uczen> nazwisko = (o1, o2) -> o1.getNazwisko().compareTo(o2.getNazwisko());
        uczniowie.sort(nazwisko);
        for(Uczen x: uczniowie){
            System.out.println(x.getImie()+" "+ x.getNazwisko());
        }


    }
}