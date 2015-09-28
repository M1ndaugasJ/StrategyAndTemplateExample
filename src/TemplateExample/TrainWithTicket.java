package TemplateExample;

/**
 * Created by Mindaugas on 9/28/15.
 */
public abstract class TrainWithTicket extends Train{

    private int ticketCount;
    private double ticketPrice;

    final String ticketSold = "Ticket sold for %.2f";
    final String insufficientTickets = "Insufficient tickets.";

    public abstract int getRemainingTickets();

    public String sellTicket() {
        if(getRemainingTickets()!=0){
            ticketCount--;
            return String.format(ticketSold, getTicketPrice());
        }
        return String.format(insufficientTickets);
    }


    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

}
