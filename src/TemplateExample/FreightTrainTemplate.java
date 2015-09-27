package TemplateExample;

import StrategyExample.Train.LocomotiveType;
import StrategyExample.Train.TrainType;

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
        return LocomotiveType.DIESEL.toString();
    }

    @Override
    public String trainType() {
        return TrainType.Freight.toString();
    }

}
