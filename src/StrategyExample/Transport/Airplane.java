package StrategyExample.Transport;

import StrategyExample.Cities;

/**
 * Created by Mindaugas on 9/27/15.
 */
public class Airplane {

    private TransportOperationStrategy airplaneOperationStrategy;

    public Airplane(TransportOperationStrategy trainOperationStrategy) {
        this.airplaneOperationStrategy = trainOperationStrategy;
    }

    public String calculateTrainTravelTime(double loadKg, double speedKmH, Cities city){
        return airplaneOperationStrategy.travelDuration(loadKg, speedKmH, city);
    }

    public String trainDescription(){
        return airplaneOperationStrategy.transportDescription();
    }
}
