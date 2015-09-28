package StrategyExample.Transport;

/**
 * Created by Mindaugas on 9/27/15.
 */
public class BussinessClassTicket implements TicketStrategy {

    double ticketPrice = 50.0;
    double ticketCount = 0;

    @Override
    public Double sellTicket() {
        ticketCount--;
        return ticketPrice;
    }

    @Override
    public int getRemainingTickets() {
        return 0;
    }

    @Override
    public void setTicketCount(Double ticketCount) {
        this.ticketCount=ticketCount;
    }
}
