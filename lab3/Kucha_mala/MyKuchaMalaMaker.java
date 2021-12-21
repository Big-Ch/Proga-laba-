package lab3.Kucha_mala;

import lab3.Characters.CharacterWithLegs;

public class MyKuchaMalaMaker implements KuchaMalaMaker {
    public KuchaMala make(String place, CharacterWithLegs... characters) {
        KuchaMala kucha = new KuchaMala(place);
        for (CharacterWithLegs ch: characters) {
            ch.fall();
            ch.becomeDirt();
            kucha.add(ch);
        }
        System.out.println("Kucha-mala was formed in the place: "+kucha.getPlace());
        return kucha;
    }

    @Override
    public String toString() {
        return "my kucha mala maker";
    }

    @Override
    public boolean equals(Object o) {
        return (this == o);
    }

}
