package TemplateExample;

import GeneralClasses.FuelType;
import GeneralClasses.TransportType;

/**
 * Created by Mindaugas on 9/28/15.
 */
public class UrbanAirplaneTemplate extends Airplane {

    @Override
    public Double loadFactor() {
        return 0.0006;
    }

    @Override
    public Double maxSpeedKmH() {
        return 300.0;
    }

    @Override
    public String transportPoweredBy() {
        return FuelType.STEAM.toString();
    }

    @Override
    public String transportType() {
        return TransportType.Passenger.toString();
    }

}
