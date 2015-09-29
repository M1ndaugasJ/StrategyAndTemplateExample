package TemplateExample;

import GeneralClasses.Cities;

/**
 * Created by Mindaugas on 9/29/15.
 */
public abstract class Transport {

    final String transportDescription = "This is a %s with a %s travelling at a max speed of %s Km/H";
    private String travelDescription = "This %s with a load of %.0f kg will reach %s in %.2f hours travelling at a speed of %s Km/H";
    final String speedExceeds = "Desired speed exceeds limits of this %s";

    public String transportDescription() {
        return String.format(transportDescription, transportType(), transportPoweredBy(), maxSpeedKmH());
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
        return String.format(travelDescription, transportType(), loadKg, city, city.distanceValue()/speedKmH + loadKg*loadFactor(), speedKmH);

    }

}
