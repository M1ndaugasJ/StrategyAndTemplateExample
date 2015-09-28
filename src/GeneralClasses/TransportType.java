package GeneralClasses;

/**
 * Created by Mindaugas on 9/25/15.
 */
public enum TransportType {

    Passenger("passenger "), Freight("goods "), Mixed("goods and passenger ");

    private final String text;
    private final String transport = "transport";

    TransportType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text + transport;
    }

}
