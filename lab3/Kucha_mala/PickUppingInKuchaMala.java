package lab3.Kucha_mala;

import lab3.Characters.CharacterWithLegsAndHands;

public interface PickUppingInKuchaMala {
    public void happen(KuchaMala kucha, int x, boolean first, CharacterWithLegsAndHands... characters);
}
