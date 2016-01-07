package ch.hslu.vsk.tutorials;

/**
 * Created by patricksiegfried on 07.01.16.
 */
public enum DatumFormat {

    CH("Schweiz","CH"),
    US("Vereinigte Staaten von Amerika", "US"),
    ISO("Internationale Standardisierungsorganisation", "ISO");

    private final String full;
    private final String abbr;

    DatumFormat(final String full, final String abbr) {
        this.full = full;
        this.abbr = abbr;
    }

    public String getFull() {
        return full;
    }

    public String getAbbr() {
        return abbr;
    }
}
