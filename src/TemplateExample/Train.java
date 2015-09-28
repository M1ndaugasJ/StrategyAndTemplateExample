package TemplateExample;

import GeneralClasses.Cities;
/**
 * Created by Mindaugas on 9/27/15.
 */
public abstract class Train {

    final String trainDescription = "This is a %s with a %s travelling at a max speed of %s Km/H";
    private String travelDescription = "This %s with a load of %.0f kg will reach %s in %.2f hours travelling at a speed of %s Km/H";
    final String speedExceeds = "Desired speed exceeds limits of this %s";

    public String trainDescription() {
        return String.format(trainDescription, trainType(), trainLocomotive(), maxSpeedKmH());
    }

    public String getTravelDescription() {
        return travelDescription;
    }

    public abstract Double loadFactor();
    public abstract Double maxSpeedKmH();
    public abstract String trainLocomotive();
    public abstract String trainType();


    public String travelDuration(double loadKg, double speedKmH, Cities city) {
        if(speedKmH > maxSpeedKmH()){
            return String.format(speedExceeds, trainLocomotive());
        }
        return String.format(travelDescription, trainType(), loadKg, city, city.distanceValue()/speedKmH + loadKg*loadFactor(), speedKmH);

    }

}
