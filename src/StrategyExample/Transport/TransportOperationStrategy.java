package StrategyExample.Transport;

import StrategyExample.Cities;

/**
 * Created by Mindaugas on 9/25/15.
 */
public interface TransportOperationStrategy {

    double averagePersonWeight = 70.8;

    String transportDescription();
    String transportPoweredBy();
    String transportType();
    String travelDuration(double loadKg, double speedKmH, Cities city);

}