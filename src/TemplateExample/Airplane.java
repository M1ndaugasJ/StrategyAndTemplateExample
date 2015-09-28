package TemplateExample;

import GeneralClasses.Cities;
import GeneralClasses.Person;

/**
 * Created by Mindaugas on 9/28/15.
 */
public abstract class Airplane {

    final String airplaneDescription = "This is a %s with a %s flying at a max speed of %s Km/H";
    private String travelDescription = "This %s with a load of %.0f kg will reach %s in %.2f hours flying at a speed of %s Km/H";
    final String speedExceeds = "Desired speed exceeds limits of this aircraft powered by %s";

    public String trainDescription() {
        return String.format(airplaneDescription, transportType(), transportPoweredBy(), maxSpeedKmH());
    }

    public String getTravelDescription() {
        return travelDescription;
    }

    public abstract Double loadFactor();
    public abstract Double maxSpeedKmH();
    public abstract String transportPoweredBy();
    public abstract String transportType();


    public String travelDuration(double loadKg, double speedKmH, Cities city) {
        if(speedKmH > maxSpeedKmH()){
            return String.format(speedExceeds, transportPoweredBy());
        }
        return String.format(travelDescription, transportType(), loadKg/ Person.Weight.averagePersonWeight, city, city.distanceValue()/speedKmH + loadKg*loadFactor(), speedKmH);
    }

}
