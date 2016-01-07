package ch.hslu.vsk.tutorials;

/**
 * Created by patricksiegfried on 07.01.16.
 */
public class Datum {

    private int tag;
    private int monat;
    private int jahr;

    public Datum(int tag, int monat, int jahr) {

        this.setTag(tag);
        this.setMonat(monat);
        this.setJahr(jahr);

    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getMonat() {
        return monat;
    }

    public void setMonat(int monat) {
        this.monat = monat;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }
}
