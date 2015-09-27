package StrategyExample.Train;

/**
 * Created by Mindaugas on 9/25/15.
 */
public enum TrainType {

    Passenger("passenger "), Freight("goods "), Mixed("goods and passenger ");

    private final String text;
    private final String train = "train";

    TrainType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text + train;
    }

}
