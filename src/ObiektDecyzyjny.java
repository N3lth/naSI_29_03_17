import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ObiektDecyzyjny {
    Map<Integer, String> deskryptoryObiektu = new HashMap<>();
    String decyzja;
    List<Integer> kombinacjaAtrybutow = new LinkedList<>();


    public ObiektDecyzyjny(String[] deskryptory) {

        for(int i = 0; i<deskryptory.length-1; i++){
            deskryptoryObiektu.put(i, deskryptory[i]);
        }
        this.kombinacjaAtrybutow.addAll(deskryptoryObiektu.keySet());
        this.decyzja = deskryptory[deskryptory.length - 1];
    }
}
