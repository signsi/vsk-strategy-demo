package ch.hslu.vsk.tutorials;

/**
 * Created by patricksiegfried on 07.01.16.
 */
public class DatumFormatterCH implements DatumFormatter {

    private final DatumFormat format = DatumFormat.CH;

    public String getFormat() {
        return this.format.getFull();
    }

    @Override
    public String formatDatum(Datum date) {
        return String.format("%d.%d.%d",date.getTag(), date.getMonat(), date.getJahr());
    }

}
