package StrategyExample.Train;

import StrategyExample.Cities;
import StrategyExample.TransportOperationStrategy;

/**
 * Created by Mindaugas on 9/25/15.
 */
public class PassengerTransport implements TransportOperationStrategy {

    double loadFactor = 0.00028;
    private final int maxSpeedKmH = 150;
    private final String passengerTravelDescription = "This %s with a traveller count of approximately %.0f will reach %s in %.2f hours riding at a speed of %s Km/H";

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
        return TrainType.Passenger.toString();
    }

    @Override
    public String travelDuration(double loadKg, double speedKmH, Cities city) {
        if(speedKmH > maxSpeedKmH){
            return String.format(speedExceeds, transportPoweredBy());
        }
        return String.format(passengerTravelDescription, transportType(), loadKg/ averagePersonWeight, city, city.distanceValue()/speedKmH + loadKg*loadFactor, speedKmH);
    }


}
