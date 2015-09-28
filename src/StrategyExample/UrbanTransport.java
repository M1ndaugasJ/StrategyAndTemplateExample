package StrategyExample;

import GeneralClasses.Cities;
import GeneralClasses.FuelType;
import GeneralClasses.TransportType;

/**
 * Created by Mindaugas on 9/26/15.
 */
public class UrbanTransport implements TransportOperationStrategy {

    String transportDescription = "This is a %s with a %s travelling at a max speed of %s Km/H";
    double loadFactor = 0.0001;
    private final int maxSpeedKmH = 400;
    String urbanTravelDescription = "This urban %s with a traveller count of approximately %.0f will reach %s in %.2f hours at a speed of %s Km/H";

    @Override
    public String transportDescription() {
        return String.format(transportDescription, transportType(), transportPoweredBy(), maxSpeedKmH);
    }

    @Override
    public String transportPoweredBy() {
        return FuelType.ELECTRIC.toString();
    }

    @Override
    public String transportType() {
        return TransportType.Passenger.toString();
    }

    @Override
    public String travelDuration(double loadKg, double speedKmH, Cities city) {
        return String.format(urbanTravelDescription, transportType(), loadKg/averagePersonWeight, city, city.distanceValue()/speedKmH + loadKg*loadFactor, speedKmH);
    }

}
