package TemplateExample;

import StrategyExample.Train.LocomotiveType;
import StrategyExample.Train.TrainType;

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
        return LocomotiveType.ELECTRIC.toString();
    }

    @Override
    public String trainType() {
        return TrainType.Passenger.toString();
    }
}
