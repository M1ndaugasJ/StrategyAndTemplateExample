package StrategyExample;

import StrategyExample.Transport.Airplane;
import StrategyExample.Transport.FreightTransport;
import StrategyExample.Transport.Train;
import StrategyExample.Transport.UrbanTransport;

/**
 * Created by Mindaugas on 9/25/15.
 */
public class TransportStation {

    public static void main(String args[]) {
        Train train = new Train(new FreightTransport());
        System.out.println(train.calculateTrainTravelTime(4000, 100, Cities.Ignalina));
        System.out.println(train.trainDescription());

        Airplane airplane = new Airplane(new UrbanTransport());
        System.out.println(airplane.calculateTrainTravelTime(4000, 500, Cities.Nida));
        System.out.println(airplane.trainDescription());

    }

}
