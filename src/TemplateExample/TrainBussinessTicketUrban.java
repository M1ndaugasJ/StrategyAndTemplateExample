package TemplateExample;

import GeneralClasses.FuelType;
import GeneralClasses.TransportType;

/**
 * Created by Mindaugas on 9/28/15.
 */
public class TrainBussinessTicketUrban extends TrainWithTicket {

    public TrainBussinessTicketUrban(){
        setTicketCount(300);
        setTicketPrice(50);
    }

    @Override
    public Double loadFactor() {
        return 0.0000006;
    }

    @Override
    public Double maxSpeedKmH() {
        return 700.8;
    }

    @Override
    public String transportPoweredBy() {
        return FuelType.DIESEL.toString();
    }

    @Override
    public String transportType() {
        return TransportType.Passenger.toString();
    }

    @Override
    public int getRemainingTickets() {
        return getTicketCount();
    }
}
