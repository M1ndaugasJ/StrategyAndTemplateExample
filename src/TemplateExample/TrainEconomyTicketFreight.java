package TemplateExample;

import GeneralClasses.FuelType;
import GeneralClasses.TransportType;

/**
 * Created by Mindaugas on 9/28/15.
 */
public class TrainEconomyTicketFreight extends TrainWithTicket {

    public TrainEconomyTicketFreight(){
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
    public String transportPoweredBy() {
        return FuelType.DIESEL.toString();
    }

    @Override
    public String transportType() {
        return TransportType.Freight.toString();
    }
}
