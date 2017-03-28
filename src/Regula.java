import java.util.*;

public class Regula{

    public Map<Integer, String> deskryptoryReguly = new HashMap<Integer, String>();
    public String decyzja;
    public int support;

    public Regula(ObiektDecyzyjny obiektDecyzyjny){
        this.decyzja = obiektDecyzyjny.decyzja;
        System.out.println("-- Obiekt ma nastepujace reguly --");
        for(int aKombinacjaAtrybutow : obiektDecyzyjny.kombinacjaAtrybutow){
            String wartoscAtrybutu = obiektDecyzyjny.deskryptoryObiektu.get(aKombinacjaAtrybutow);
            this.deskryptoryReguly.put(aKombinacjaAtrybutow, wartoscAtrybutu);
            System.out.println("(a"+(aKombinacjaAtrybutow+1)+" = "+wartoscAtrybutu+") => (d = "+obiektDecyzyjny.decyzja+")");
        }
        System.out.println("-- Koniec regul obiektu --\n");
    }
}

//    public Regula(ObiektDecyzyjny obiektDecyzyjny, int[] kombinacjaAtrybutow){ // kombinacjaAtr => deskryptory, bez decyzji | ObiektDecyzyjny obiektDecyzyjny <= SKAD MA WZIAC, int[] kombinacjaAtrybutow <= CO MA WZIAC
