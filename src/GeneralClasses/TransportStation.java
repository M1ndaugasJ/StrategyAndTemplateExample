package GeneralClasses;

import TemplateExample.TrainTicketFreight;
import TemplateExample.TrainTicketUrban;

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
//        FreightAirplaneTemplate freightAirplaneTemplate = new FreightAirplaneTemplate();
//        freightAirplaneTemplate.travelDuration(7000,500,Cities.Mažeikiai);

        TrainTicketFreight trainTicketFreight = new TrainTicketFreight();
        System.out.println(trainTicketFreight.sellTicket());

        TrainTicketUrban trainTicketUrban = new TrainTicketUrban();
        System.out.println(trainTicketUrban.sellTicket() + " remaining tickets " + trainTicketUrban.getRemainingTickets()
                + " " + trainTicketUrban.trainDescription());

    }

}
