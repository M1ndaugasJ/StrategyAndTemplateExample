package StrategyExample.Train;

import StrategyExample.Cities;
import StrategyExample.TransportOperationStrategy;

/**
 * Created by Mindaugas on 9/25/15.
 */
public class FreightTransport implements TransportOperationStrategy {


    double loadFactor = 0.0004;
    private final int maxSpeedKmH = 120;

    @Override
    public String transportDescription() {
        return String.format(transportDescription, transportType(), transportPoweredBy(), maxSpeedKmH);
    }

    @Override
    public String transportPoweredBy() {
        return LocomotiveType.DIESEL.toString();
    }

    @Override
    public String transportType() {
        return TrainType.Freight.toString();
    }

    @Override
    public String travelDuration(double loadKg, double speedKmH, Cities city) {
        if(speedKmH > maxSpeedKmH){
            return String.format(speedExceeds, transportPoweredBy());
        }
        return String.format(travelDescription, transportType(), loadKg, city, city.distanceValue()/speedKmH + loadKg*loadFactor, speedKmH);
    }


}
