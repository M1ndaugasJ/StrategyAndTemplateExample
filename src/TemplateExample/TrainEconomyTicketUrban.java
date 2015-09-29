package TemplateExample;

import GeneralClasses.FuelType;
import GeneralClasses.TransportType;

/**
 * Created by Mindaugas on 9/28/15.
 */
public class TrainEconomyTicketUrban extends TrainWithTicket {

    public TrainEconomyTicketUrban(){
        setTicketCount(300);
        setTicketPrice(50);
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
        return FuelType.ELECTRIC.toString();
    }

    @Override
    public String transportType() {
        return TransportType.Passenger.toString();
    }
}
