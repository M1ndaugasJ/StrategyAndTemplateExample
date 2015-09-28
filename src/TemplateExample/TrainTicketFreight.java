package TemplateExample;

import GeneralClasses.FuelType;
import GeneralClasses.TransportType;

/**
 * Created by Mindaugas on 9/28/15.
 */
public class TrainTicketFreight extends TrainWithTicket {

    public TrainTicketFreight(){
        setTicketCount(100);
        setTicketPrice(80);
    }

    @Override
    public int getRemainingTickets() {
        return getTicketCount();
    }

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
