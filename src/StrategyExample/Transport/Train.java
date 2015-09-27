package StrategyExample.Transport;

import StrategyExample.Cities;

/**
 * Created by Mindaugas on 9/25/15.
 */
public class Train {

    private TransportOperationStrategy trainOperationStrategy;

    public Train(TransportOperationStrategy trainOperationStrategy) {
        this.trainOperationStrategy = trainOperationStrategy;
    }

    public String calculateTrainTravelTime(double loadKg, double speedKmH, Cities city){
        return trainOperationStrategy.travelDuration(loadKg, speedKmH, city);
    }

    public String trainDescription(){
        return trainOperationStrategy.transportDescription();
    }

}
