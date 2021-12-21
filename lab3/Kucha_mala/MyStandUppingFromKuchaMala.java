package lab3.Kucha_mala;

import lab3.Characters.AlreadyStandException;
import lab3.Characters.CharacterWithLegs;

public class MyStandUppingFromKuchaMala implements Event {
    protected KuchaMala kucha;
    protected int kolvo;
    protected boolean first;

    public MyStandUppingFromKuchaMala(KuchaMala kucha, int x, boolean flag) {
        this.kucha=kucha;
        this.kolvo=x;
        this.first=flag;
    }

    protected CharacterWithLegs standUpFromKuchaMala() throws AlreadyStandException {
        CharacterWithLegs r=kucha.getTop();
        if (r.getStand()) {
            throw new AlreadyStandException(r.getName()+" already stand");
        }
        kucha.removeTop();
        r.standUp();
        return r;
    }

    public void happen() {
        WriterCharactersEnumeration writer_characters_enumeration = new MyWriterCharactersEnumeration();
        CharacterWithLegs[] characters = new CharacterWithLegs[kolvo];
        for (int i=0; i<kolvo; i++) {
            characters[i]= standUpFromKuchaMala();
        }
        writer_characters_enumeration.write(characters);
        System.out.print("got up");
        if (first) {
            System.out.println(" first");
        }
        else {
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "my stand upping from kucha mala";
    }

    @Override
    public boolean equals(Object o) {
        return (this == o);
    }

}

