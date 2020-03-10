public class Impfen {

    public static void main(String[] args) {

        int impfung = naechsteZeckenimpfung(15,2, false);
        System.out.println(impfung);

    }

    public static int naechsteZeckenimpfung (int alter, int letztesImpfungsjahr, boolean ersteAuffrischung) {
        int impfung;

        if (ersteAuffrischung || alter >= 60) {
            impfung = letztesImpfungsjahr + 3;
        } else {
            impfung = letztesImpfungsjahr + 5;
        }
        return impfung;
    }
}
