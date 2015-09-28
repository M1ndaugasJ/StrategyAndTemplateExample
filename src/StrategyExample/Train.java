package StrategyExample;

import GeneralClasses.Cities;

/**
 * Created by Mindaugas on 9/25/15.
 */
public class Train {

    private TransportOperationStrategy trainOperationStrategy;
    private TicketStrategy ticketStrategy;

    public Train(TransportOperationStrategy trainOperationStrategy, TicketStrategy ticketStrategy) {
        this.trainOperationStrategy = trainOperationStrategy;
        this.ticketStrategy = ticketStrategy;
        ticketStrategy.setTicketCount(1000);
    }

    public String calculateTrainTravelTime(double loadKg, double speedKmH, Cities city){
        return trainOperationStrategy.travelDuration(loadKg, speedKmH, city);
    }

    public String trainDescription(){
        return trainOperationStrategy.transportDescription();
    }

    public String sellTrainTicket(){
        return ticketStrategy.sellTicket();
    }

    public int getRemainingTickets(){
        return ticketStrategy.getRemainingTickets();
    }

}
