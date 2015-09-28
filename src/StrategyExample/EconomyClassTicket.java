package StrategyExample;

/**
 * Created by Mindaugas on 9/27/15.
 */
public class EconomyClassTicket implements TicketStrategy {

    double ticketPrice = 50.0;
    int ticketCount = 0;

    @Override
    public String sellTicket() {
        if(getRemainingTickets()!=0){
            ticketCount--;
            return String.format(ticketSold, ticketPrice);
        }
        return String.format(insufficientTickets);
    }

    @Override
    public int getRemainingTickets() {
        return ticketCount;
    }

    @Override
    public void setTicketCount(int ticketCount) {
        this.ticketCount=ticketCount;
    }
}
