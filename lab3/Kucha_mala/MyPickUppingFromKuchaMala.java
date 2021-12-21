package lab3.Kucha_mala;

import lab3.Characters.AlreadyStandException;
import lab3.Characters.CharacterWithLegs;
import lab3.Characters.CharacterWithLegsAndHands;

public class MyPickUppingFromKuchaMala implements Event {
    protected KuchaMala kucha;
    protected int kolvo;
    protected boolean first;
    CharacterWithLegsAndHands[] characters;

    public MyPickUppingFromKuchaMala(KuchaMala kucha, int kolvo, boolean first, CharacterWithLegsAndHands... characters) {
        this.kucha=kucha;
        this.kolvo=kolvo;
        this.first=first;
        this.characters=characters;
    }


    protected CharacterWithLegs pickUpFromKuchaMala(KuchaMala kucha, CharacterWithLegsAndHands... characters) throws AlreadyStandException {
        CharacterWithLegs r=kucha.getTop();
        if (r.getStand()) {
            throw new AlreadyStandException(r.getName()+" already stand");
        }
        kucha.removeTop();
        characters[0].pickUp(r,characters);
        return r;
    }

    public void happen() {
        WriterCharactersEnumeration writer_characters_enumeration =new MyWriterCharactersEnumeration();
        writer_characters_enumeration.write(characters);
        System.out.print("picked up ");
        CharacterWithLegs[] characters2 = new CharacterWithLegs[kolvo];
        for (int i=0; i<kolvo; i++) {
            characters2[i]= pickUpFromKuchaMala(kucha,characters);
        }
        writer_characters_enumeration.write(characters2);
        if (first) {
            System.out.println("first");
        }
        else {
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "my pick upping from kucha mala";
    }

    @Override
    public boolean equals(Object o) {
        return (this == o);
    }

}
