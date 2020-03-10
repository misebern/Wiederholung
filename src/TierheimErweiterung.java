public class TierheimErweiterung {

    public static void main(String[] args) {

        double spazieren = wieWeitSpazieren( 17, 18, true);
        System.out.println(spazieren);

        boolean bedarf = kuschelBedarf(new int[] {10, 20, 15});
        System.out.println("Soll der Hund gekuschelt werden?" + bedarf);


    }

    public static double wieWeitSpazieren (double gewicht, double letztesMal, boolean verträgtSich) {
        int spazieren = 0;

        if (gewicht < 1 && !verträgtSich) {
            spazieren = 2;
        } else if (gewicht < 1 && verträgtSich) {
            spazieren = 4;
        } else if (gewicht > 15 || letztesMal > 24 && verträgtSich) {
          spazieren = 8;
        } else {
            spazieren = 5;
        }
        return spazieren;
    }

    public static boolean kuschelBedarf (int kuschelZeit []) {
        boolean bedarf;

        kuschelZeit[0] = 0;
        kuschelZeit[1] = 0;
        kuschelZeit[2] = 0;

        int kuschelnInsg = kuschelZeit[0] + kuschelZeit[1] + kuschelZeit[2];

        if (kuschelnInsg > 60) {
            bedarf = false;
        }

        if (kuschelZeit[0] < kuschelZeit[1] && kuschelZeit[1] < kuschelZeit[2]) {
            bedarf = true;
        } else if (kuschelZeit[1] > 25) {
            bedarf = false;
        } else {
            bedarf = true;
        }
        return bedarf;

    }

}
