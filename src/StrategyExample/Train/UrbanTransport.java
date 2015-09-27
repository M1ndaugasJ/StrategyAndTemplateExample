package StrategyExample.Train;

import StrategyExample.Cities;
import StrategyExample.TransportOperationStrategy;

/**
 * Created by Mindaugas on 9/26/15.
 */
public class UrbanTransport implements TransportOperationStrategy {

    double loadFactor = 0.0001;
    private final int maxSpeedKmH = 400;
    String urbanTravelDescription = "This urban %s with a traveller count of approximately %.0f will fly to %s in %.2f hours teleporting at a speed of %s Km/H";

    @Override
    public String transportDescription() {
        return String.format(transportDescription, transportType(), transportPoweredBy(), maxSpeedKmH);
    }

    @Override
    public String transportPoweredBy() {
        return LocomotiveType.ELECTRIC.toString();
    }

    @Override
    public String transportType() {
        return TrainType.Passenger.toString();
    }

    @Override
    public String travelDuration(double loadKg, double speedKmH, Cities city) {
        if(speedKmH > maxSpeedKmH){
            return String.format(speedExceeds, transportPoweredBy());
        }
        return String.format(urbanTravelDescription, transportType(), loadKg/ averagePersonWeight, city, city.distanceValue()/speedKmH + loadKg*loadFactor, speedKmH);
    }

}
