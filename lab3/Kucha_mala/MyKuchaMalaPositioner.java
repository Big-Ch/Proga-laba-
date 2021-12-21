package lab3.Kucha_mala;

import lab3.Characters.Character;

public class MyKuchaMalaPositioner implements KuchaMalaPositioner {
    public boolean isAbove(KuchaMala kucha, Character character1, Character  character2) {
        if (!kucha.contains(character1) || !kucha.contains(character2)) {
            return false;
        }
        return kucha.indexOf(character1)>kucha.indexOf(character2);
    }

    @Override
    public String toString() {
        return "my kucha mala positioner";
    }

    @Override
    public boolean equals(Object o) {
        return (this == o);
    }

}
