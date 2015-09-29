package GeneralClasses;

import TemplateExample.TrainEconomyTicketFreight;
import TemplateExample.TrainEconomyTicketUrban;

/**
 * Created by Mindaugas on 9/25/15.
 */
public class TransportStation {

    public static void main(String args[]) {
        TrainEconomyTicketFreight trainEconomyTicketFreight = new TrainEconomyTicketFreight();
        System.out.println(trainEconomyTicketFreight.sellTicket());

        TrainEconomyTicketUrban trainEconomyTicketUrban = new TrainEconomyTicketUrban();
        System.out.println(trainEconomyTicketUrban.sellTicket() + " remaining tickets " + trainEconomyTicketUrban.getRemainingTickets()
                + " " + trainEconomyTicketUrban.transportDescription());

    }

}
