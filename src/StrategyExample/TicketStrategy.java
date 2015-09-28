package StrategyExample;

/**
 * Created by Mindaugas on 9/27/15.
 */
public interface TicketStrategy {

    String ticketSold = "Ticket sold for %.2f";
    String insufficientTickets = "Insufficient tickets.";

    String sellTicket();
    int getRemainingTickets();
    void setTicketCount(int ticketCount);

}
