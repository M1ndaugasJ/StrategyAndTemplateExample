package TemplateExample;

import GeneralClasses.FuelType;
import GeneralClasses.TransportType;

/**
 * Created by Mindaugas on 9/28/15.
 */
public class FreightAirplaneTemplate extends Airplane {
    @Override
    public Double loadFactor() {
        return 0.0000006;
    }

    @Override
    public Double maxSpeedKmH() {
        return 700.8;
    }

    @Override
    public String transportPoweredBy() {
        return FuelType.PETROL.toString();
    }

    @Override
    public String transportType() {
        return TransportType.Freight.toString();
    }
}
