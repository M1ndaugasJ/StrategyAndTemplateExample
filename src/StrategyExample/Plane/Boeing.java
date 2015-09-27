package StrategyExample.Plane;

import StrategyExample.Cities;
import StrategyExample.TransportOperationStrategy;

/**
 * Created by Mindaugas on 9/27/15.
 */
public class Boeing implements TransportOperationStrategy {

    double loadFactor = 0.0001;
    private final int maxSpeedKmH = 400;

    @Override
    public String transportDescription() {
        return String.format(transportDescription, transportType(), transportPoweredBy(), maxSpeedKmH);
    }

    @Override
    public String transportPoweredBy() {
        return null;
    }

    @Override
    public String transportType() {
        return null;
    }

    @Override
    public String travelDuration(double loadKg, double speedKmH, Cities city) {
        return null;
    }
}
