package lab3.Kucha_mala;

import lab3.Characters.CharacterWithLegs;

public interface KuchaMalaMaker {
    public KuchaMala make(String place, CharacterWithLegs... characters);
}
