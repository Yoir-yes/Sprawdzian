import java.util.*;
import java.util.function.BiConsumer;

public class ListaUczniow {
    /**

     **/
    private static Map<String,String> uczens =  new HashMap();

    public static void dodaj(String imie, String nazwisko){
        uczens.put(imie,nazwisko);
    }
    public static void wyświetl(){
        System.out.println(uczens.toString());
    }
    public static void usun(String imie, String nazwisko){
        uczens.remove(imie,nazwisko);
    }
    public static void losuj(int n){

    }
}

