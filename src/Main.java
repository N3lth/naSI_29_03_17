public class Main {

    public static void main(String[] args) {

        String[] dane1 = {"5", "3", "2", "21", "15"};
        String[] dane2 = {"4", "3", "2", "231", "15"};


        ObiektDecyzyjny obiektDecyzyjny1 = new ObiektDecyzyjny(dane1);
        ObiektDecyzyjny obiektDecyzyjny2 = new ObiektDecyzyjny(dane2);

        Regula r1 = new Regula(obiektDecyzyjny1);
        CzyObiektSpelniaRegule.CzySpelnia(obiektDecyzyjny2, r1);
    }
}
