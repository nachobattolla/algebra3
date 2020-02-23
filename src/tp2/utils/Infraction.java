package tp2.utils;

public class Infraction {
    final int monthNumber;
    final int infractionCode;
    final int numberOfInfractions;

    public Infraction(int monthNumber, int infractionCode, int numberOfInfractions) {
        this.monthNumber = monthNumber;
        this.infractionCode = infractionCode;
        this.numberOfInfractions = numberOfInfractions;
    }
}
