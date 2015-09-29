package TemplateExample;

import GeneralClasses.FuelType;
import GeneralClasses.TransportType;

/**
 * Created by Mindaugas on 9/29/15.
 */
public class AirplaneEconomyTicketFreight extends AirplaneWithTicket {

    public AirplaneEconomyTicketFreight(){
        setTicketCount(300);
        setTicketPrice(50);
    }

    @Override
    public int getRemainingTickets() {
        return getTicketCount();
    }

    @Override
    public Double loadFactor() {
        return 0.0003;
    }

    @Override
    public Double maxSpeedKmH() {
        return 500.9;
    }

    @Override
    public String transportPoweredBy() {
        return FuelType.ELECTRIC.toString();
    }

    @Override
    public String transportType() {
        return TransportType.Freight.toString();
    }
}
