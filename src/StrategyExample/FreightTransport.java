package StrategyExample;

import GeneralClasses.Cities;
import GeneralClasses.FuelType;
import GeneralClasses.TransportType;

/**
 * Created by Mindaugas on 9/25/15.
 */
public class FreightTransport implements TransportOperationStrategy {


    String transportDescription = "This is a %s with a %s travelling at a max speed of %s Km/H";
    String speedExceeds = "The limits of this %s do not allow the desired operation speed";
    String freightTravelDescription = "This freight %s with a load count of approximately %.0f kg will travel to %s in %.2f hours riding at a speed of %s Km/H";
    double loadFactor = 0.0004;
    private final int maxSpeedKmH = 120;

    @Override
    public String transportDescription() {
        return String.format(transportDescription, transportType(), transportPoweredBy(), maxSpeedKmH);
    }

    @Override
    public String transportPoweredBy() {
        return FuelType.DIESEL.toString();
    }

    @Override
    public String transportType() {
        return TransportType.Freight.toString();
    }

    @Override
    public String travelDuration(double loadKg, double speedKmH, Cities city) {
        if(speedKmH > maxSpeedKmH){
            return String.format(speedExceeds, transportType());
        }
        return String.format(freightTravelDescription, transportType(), loadKg, city, city.distanceValue()/speedKmH + loadKg*loadFactor, speedKmH);
    }


}
