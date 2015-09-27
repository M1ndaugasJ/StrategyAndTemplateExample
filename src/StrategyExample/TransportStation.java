package StrategyExample;

import TemplateExample.FreightTrainTemplate;
import TemplateExample.UrbanTrainTemplate;

/**
 * Created by Mindaugas on 9/25/15.
 */
public class TransportStation {

    public static void main(String args[]) {
//        TrainContext trainContext1 = new TrainContext(new FreightTransport());
//        System.out.println(trainContext1.calculateTrainTravelTime(4000, 100, Cities.Ignalina));
//        TrainContext trainContext2 = new TrainContext(new UrbanTransport());
//        System.out.println(trainContext2.calculateTrainTravelTime(6000, 300, Cities.Kėdainiai));
//        TrainContext trainContext3 = new TrainContext(new PassengerTransport());
//        System.out.println(trainContext3.calculateTrainTravelTime(3000, 120, Cities.Šakiai));
//        TrainContext trainContext4 = new TrainContext(new MuseumTransport());
//        System.out.println(trainContext4.calculateTrainTravelTime(2000, 70, Cities.Mažeikiai));

        FreightTrainTemplate freightTrain = new FreightTrainTemplate();
        System.out.println(freightTrain.travelDuration(1000,40,Cities.Kaunas));
        System.out.println(freightTrain.trainDescription());
        UrbanTrainTemplate urbanTrain = new UrbanTrainTemplate();
        System.out.println(urbanTrain.travelDuration(1000,300,Cities.Kaunas));
        System.out.println(urbanTrain.trainDescription());

    }

}
