package TemplateExample;

/**
 * Created by Mindaugas on 9/27/15.
 */
public enum Person {

    Weight(70.8);

    double averagePersonWeight = 0;

    Person(final Double averagePersonWeight) {
        this.averagePersonWeight = averagePersonWeight;
    }

}
