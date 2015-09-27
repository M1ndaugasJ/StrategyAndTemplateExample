package StrategyExample.Train;

/**
 * Created by Mindaugas on 9/26/15.
 */
public enum LocomotiveType {

    STEAM("steam "), ELECTRIC("electric "), DIESEL("diesel ");

    private final String text;
    private final String locomotive = "locomotive";

    LocomotiveType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text + locomotive;
    }

}
