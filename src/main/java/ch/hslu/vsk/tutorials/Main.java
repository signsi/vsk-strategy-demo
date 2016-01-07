package ch.hslu.vsk.tutorials;

/**
 * Created by patricksiegfried on 07.01.16.
 */
public class Main {

    public static void main(final String[] args) {

        Datum datum = new Datum(22,5,1992);
        DatumFormatter.setFormat(DatumFormat.CH);
        String date = DatumFormatter.formatDatum(datum);
        System.out.println(date);
        System.out.println(DatumFormatter.getFormat());

    }

}
