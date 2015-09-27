package StrategyExample;

import StrategyExample.Cities;

/**
 * Created by Mindaugas on 9/25/15.
 */
public interface TransportOperationStrategy {

    String transportDescription = "This is a %s with a %s travelling at a max speed of %s Km/H";
    String travelDescription = "This %s with a load of %s kg will reach %s in %.2f hours travelling at a speed of %s Km/H";
    String speedExceeds = "Desired speed exceeds limits of this %s";
    double averagePersonWeight = 70.8;

    String transportDescription();
    String transportPoweredBy();
    String transportType();
    String travelDuration(double loadKg, double speedKmH, Cities city);

}