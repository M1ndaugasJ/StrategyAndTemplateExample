package TemplateExample;

import StrategyExample.Transport.FuelType;
import StrategyExample.Transport.TransportType;

/**
 * Created by Mindaugas on 9/27/15.
 */
public class UrbanTrainTemplate extends Train {
    @Override
    public Double loadFactor() {
        return 0.0001;
    }

    @Override
    public Double maxSpeedKmH() {
        return 300.0;
    }

    @Override
    public String trainLocomotive() {
        return FuelType.ELECTRIC.toString();
    }

    @Override
    public String trainType() {
        return TransportType.Passenger.toString();
    }
}
