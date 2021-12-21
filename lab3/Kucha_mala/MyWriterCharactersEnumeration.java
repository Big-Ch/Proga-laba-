package lab3.Kucha_mala;

import lab3.Characters.Character;

public class MyWriterCharactersEnumeration implements WriterCharactersEnumeration {
    public void write(Character ... characters) {
        for (int i=0; i<characters.length; i++) {
            if (i!=characters.length-1) {
                System.out.print(characters[i].getName()+", ");
            }
            else {
                System.out.print(characters[i].getName()+" ");
            }
        }
    }

    @Override
    public String toString() {
        return "my writer characters enumeration";
    }

    @Override
    public boolean equals(Object o) {
        return (this == o);
    }
}
