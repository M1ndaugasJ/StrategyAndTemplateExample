package StrategyExample.Train;

import StrategyExample.Cities;
import StrategyExample.TransportOperationStrategy;

/**
 * Created by Mindaugas on 9/26/15.
 */
public class MuseumTransport implements TransportOperationStrategy {

    double loadFactor = 0.0007;
    private final int maxSpeedKmH = 80;
    String museumTravelDescription = "This ancient %s with a load of approximately %.0f visitors will slowly reach %s in %.2f hours crawling at a speed of %s Km/H";

    @Override
    public String transportDescription() {
        return String.format(transportDescription, transportType(), transportPoweredBy(), maxSpeedKmH);
    }

    @Override
    public String transportPoweredBy() {
        return LocomotiveType.STEAM.toString();
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
        return String.format(museumTravelDescription, transportType(), loadKg/ averagePersonWeight, city, city.distanceValue()/speedKmH + loadKg*loadFactor, speedKmH);
    }
}
