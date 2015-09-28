package StrategyExample.Transport;

/**
 * Created by Mindaugas on 9/27/15.
 */
public interface TicketStrategy {

    Double sellTicket();
    int getRemainingTickets();
    void setTicketCount(Double ticketCount);

}
