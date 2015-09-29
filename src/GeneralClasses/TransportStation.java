package GeneralClasses;

import TemplateExample.TrainEconomyTicketFreight;
import TemplateExample.TrainEconomyTicketUrban;

/**
 * Created by Mindaugas on 9/25/15.
 */
public class TransportStation {

    public static void main(String args[]) {
//        Train train = new Train(new FreightTransport(), new EconomyClassTicket());
//        System.out.println(train.calculateTrainTravelTime(4000, 100, Cities.Ignalina));
//        System.out.println(train.trainDescription());
//        System.out.println(train.sellTrainTicket());
//
//        Airplane airplane = new Airplane(new UrbanTransport());
//        System.out.println(airplane.calculateTrainTravelTime(4000, 500, Cities.Nida));
//        System.out.println(airplane.trainDescription());
//
//        TrainBussinessTicketUrban freightAirplaneTemplate = new TrainBussinessTicketUrban();
//        freightAirplaneTemplate.travelDuration(7000,500,Cities.Mažeikiai);

        TrainEconomyTicketFreight trainEconomyTicketFreight = new TrainEconomyTicketFreight();
        System.out.println(trainEconomyTicketFreight.sellTicket());

        TrainEconomyTicketUrban trainEconomyTicketUrban = new TrainEconomyTicketUrban();
        System.out.println(trainEconomyTicketUrban.sellTicket() + " remaining tickets " + trainEconomyTicketUrban.getRemainingTickets()
                + " " + trainEconomyTicketUrban.transportDescription());

    }

}
