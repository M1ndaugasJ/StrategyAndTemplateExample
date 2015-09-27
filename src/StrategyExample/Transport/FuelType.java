package StrategyExample.Transport;

/**
 * Created by Mindaugas on 9/26/15.
 */
public enum FuelType {

    STEAM("steam "), ELECTRIC("electric "), DIESEL("diesel ");

    private final String text;
    private final String fuel = "fuel";

    FuelType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text + fuel;
    }

}
