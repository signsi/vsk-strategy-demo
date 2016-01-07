package ch.hslu.vsk.tutorials;

/**
 * Created by patricksiegfried on 07.01.16.
 */

public class DatumFormatter {

    private static DatumFormat format;

    public static void setFormat(DatumFormat format) {
        DatumFormatter.format = format;
    }

    public static String getFormat() {
        return DatumFormatter.format.getFull();
    }

    public static String formatDatum(Datum date) {

        switch (DatumFormatter.format) {
            case CH:
                return formatCH(date);
            case US:
                return formatUS(date);
            case ISO:
                return formatISO(date);
            default:
                return "Error";
        }

    }

    private static String formatCH(Datum date) {
        return String.format("%d.%d.%d",date.getTag(), date.getMonat(), date.getJahr());
    }

    private static String formatUS(Datum date) {
        return String.format("%d/%d/%d",date.getMonat(), date.getTag(), date.getJahr());
    }

    private static String formatISO(Datum date) {
        return String.format("%d-%d-%d",date.getJahr(), date.getMonat(), date.getTag());
    }

}
