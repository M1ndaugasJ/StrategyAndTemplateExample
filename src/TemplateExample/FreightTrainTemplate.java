package TemplateExample;

import StrategyExample.Transport.FuelType;
import StrategyExample.Transport.TransportType;

/**
 * Created by Mindaugas on 9/27/15.
 */
public class FreightTrainTemplate extends Train {

    @Override
    public Double loadFactor() {
        return 0.00028;
    }

    @Override
    public Double maxSpeedKmH() {
        return 150.0;
    }

    @Override
    public String trainLocomotive() {
        return FuelType.DIESEL.toString();
    }

    @Override
    public String trainType() {
        return TransportType.Freight.toString();
    }

}
