public class CzyObiektSpelniaRegule {
    public static boolean CzySpelnia(ObiektDecyzyjny obiektDecyzyjny, Regula r) {

        for(int i = 0; i<r.deskryptoryReguly.size(); i++){ // dla kazdego deskryptora

            if(r.deskryptoryReguly.get(i).equals(obiektDecyzyjny.deskryptoryObiektu.get(i))) {
                System.out.println("Obiekt spelnia regule (a" + (i + 1) + " = " + r.deskryptoryReguly.get(i)+")" );
                System.out.println("Czy regula jest sprzeczna: "+CzyRegulaJestSprzeczna.CzyJestSprzeczna(obiektDecyzyjny, r));
                boolean CzyJestSprzeczna = CzyRegulaJestSprzeczna.CzyJestSprzeczna(obiektDecyzyjny, r);
                if (!CzyJestSprzeczna) {
                    System.out.println("Regula jest OK!");
                    break;
                }else {
                    System.out.println("Regula nie jest ok, poniewaz decyzje sie roznia.");
                    break;
                }
            }else{
                System.out.println("Obiekt nie spelnia reguly (a" + (i + 1) + " = " + r.deskryptoryReguly.get(i)+")" );
//                return false; // odkomentuj, jesli chcesz samo sprawdzanie czyObiektSpelniaRegule
            }
        }
        return false;
    }
}