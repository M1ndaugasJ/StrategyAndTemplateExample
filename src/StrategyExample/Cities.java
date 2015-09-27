package StrategyExample;

/**
 * Created by Mindaugas on 9/26/15.
 */
@SuppressWarnings("unused")
public enum Cities {

    Alytus(05d),
    Druskininkai(129d),
    Ignalina(108d),
    Jonava(106d),
    Joniškis(253d),
    Kaunas(102d),
    Jurbarkas(188d),
    Kėdainiai(139d),
    Klaipėda(312d),
    Kretinga(314d),
    Kupiškis(154d),
    Lazdijai(147d),
    Marijampolė(139d),
    Mažeikiai(293d),
    Molėtai(62d),
    N_Akmenė(290d),
    Nida(361d),
    Pakruojis(184d),
    Palanga(326d),
    Panevėžys(135d),
    Pasvalys(173d),
    Plungė(287d),
    Prienai(95d),
    Radviliškis(195d),
    Rokiškis(158d),
    Skuodas(360d),
    Šakiai(67d),
    Šalčininkai(47d),
    Siauliai(214d);

    private final Double distanceFromVilnius;

    Cities(final Double distanceFromVilnius) {
        this.distanceFromVilnius = distanceFromVilnius;
    }

    public Double distanceValue() {
        return distanceFromVilnius;
    }

}
