package ch.hslu.vsk.tutorials;

/**
 * Created by patricksiegfried on 07.01.16.
 */
public class Main {

    public static void main(final String[] args) {

        Datum datum = new Datum(22,5,1992);

        DatumFormatter formatter;

        formatter = new DatumFormatterCH();
        System.out.println(formatter.formatDatum(datum));
        System.out.println(formatter.getFormat());

        System.out.println();

        formatter = new DatumFormatterISO();
        System.out.println(formatter.formatDatum(datum));
        System.out.println(formatter.getFormat());


    }

}
