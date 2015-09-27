package StrategyExample.Train;

import StrategyExample.Cities;
import StrategyExample.TransportOperationStrategy;

/**
 * Created by Mindaugas on 9/25/15.
 */
public class TrainContext {

    private TransportOperationStrategy trainOperationStrategy;

    public TrainContext(TransportOperationStrategy trainOperationStrategy) {
        this.trainOperationStrategy = trainOperationStrategy;
    }

    public String calculateTrainTravelTime(double loadKg, double speedKmH, Cities city){
        return trainOperationStrategy.travelDuration(loadKg,speedKmH,city);
    }

    public String trainDescription(){
        return trainOperationStrategy.transportDescription();
    }

}
