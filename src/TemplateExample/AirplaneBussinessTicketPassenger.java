package TemplateExample;

import GeneralClasses.FuelType;
import GeneralClasses.TransportType;

/**
 * Created by Mindaugas on 9/27/15.
 */
public class AirplaneBussinessTicketPassenger extends AirplaneWithTicket {

    public AirplaneBussinessTicketPassenger(){
        setTicketCount(300);
        setTicketPrice(50);
    }

    @Override
    public Double loadFactor() {
        return 0.0001;
    }

    @Override
    public Double maxSpeedKmH() {
        return 300.0;
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
