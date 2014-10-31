package spacol;

/**
 * Created by hdtech on 10/31/2014.
 */
public class gSystem {
        private static int intYear = 3000;
        private static int intMone = 1000;
        private static int intOxyg = 100;

    public static int getIntOxyg() {
        return intOxyg;
    }

    public static void setIntOxyg(int intOxyg) {
        gSystem.intOxyg = intOxyg;
    }

    public static int getIntMone() {
        return intMone;
    }

    public static void setIntMone(int intMone) {
        gSystem.intMone = intMone;
    }

    public static int getIntYear() {
        return intYear;
    }

    public static void setIntYear(int intYear) {
        gSystem.intYear = intYear;
    }
}
