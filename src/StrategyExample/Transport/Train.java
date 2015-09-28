package StrategyExample.Transport;

import StrategyExample.Cities;

/**
 * Created by Mindaugas on 9/25/15.
 */
public class Train {

    private TransportOperationStrategy trainOperationStrategy;
    private TicketStrategy ticketStrategy;

    public Train(TransportOperationStrategy trainOperationStrategy, TicketStrategy ticketStrategy) {
        this.trainOperationStrategy = trainOperationStrategy;
        this.ticketStrategy = ticketStrategy;
    }

    public String calculateTrainTravelTime(double loadKg, double speedKmH, Cities city){
        return trainOperationStrategy.travelDuration(loadKg, speedKmH, city);
    }

    public String trainDescription(){
        return trainOperationStrategy.transportDescription();
    }

}
