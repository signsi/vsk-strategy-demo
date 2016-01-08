package ch.hslu.vsk.tutorials;

/**
 * Created by patricksiegfried on 07.01.16.
 */
public class DatumFormatterISO implements DatumFormatter {

    private DatumFormat format = DatumFormat.ISO;

    public String getFormat() {
        return this.format.getFull();
    }

    @Override
    public String formatDatum(Datum date) {
        return String.format("%d-%d-%d",date.getJahr(), date.getMonat(), date.getTag());
    }

}
