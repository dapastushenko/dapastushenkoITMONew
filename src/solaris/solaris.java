package solaris;


public enum solaris {
    // d 49500
    NEPTUNE(17f, 49500, 30.1f),

    //d = 4900
    MERCURY(.055f, 4870, 0.4f),

    //d 12150
    VENUS(.815f, 12150, .7f),

    //d 12750
    EARTH(1f, 12756, 1f),

    // d 6800
    MARS(.107f, 6670, 1.5f),

    // 142800
    JUPITER(318f, 143760, 5.2f),

    // d 120700
    SATURN(95f, 120700, 9.5f),

    // d 51100
    URANUS(14f, 51100, 19.2f);

    private static int astronomicalUnit = 150000000;
    private float EMMass, AUOrbital;
    private long KMRadius;

    Solaris(float mass, long diameter, float orbit) {
        this.EMMass = mass;
        this.KMRadius = diameter / 2;
        this.AUOrbital = orbit;
    }

    public static void main(String[] args) {
        System.out.printf("NEPTUNE - %s%n", Solaris.NEPTUNE.AUOrbital * astronomicalUnit);
    }
}