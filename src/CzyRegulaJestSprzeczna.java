public class CzyRegulaJestSprzeczna {
    public static boolean CzyJestSprzeczna(ObiektDecyzyjny obiektDecyzyjny, Regula r) {
        if(r.decyzja.equals(obiektDecyzyjny.decyzja))
        return false;
        return true;
    }
}
