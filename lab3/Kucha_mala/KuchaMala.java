package lab3.Kucha_mala;
import lab3.Characters.CharacterWithLegs;
import lab3.Characters.Character;
import java.util.ArrayList;
import java.util.List;
public class KuchaMala extends EventWithPlace {
    protected  List  <CharacterWithLegs> kucha;

    public KuchaMala(String place) {
        this.kucha= new ArrayList <> ();
        this.place=place;
    }

    public KuchaMala() {
        this.kucha= new ArrayList <> ();
        this.place="somewhere";
    }

    public CharacterWithLegs getEnd()  {
        return this.kucha.get(0);
    }

    public CharacterWithLegs get(int x)  {
        return this.kucha.get(x);
    }

    public CharacterWithLegs getTop()  {
        return this.kucha.get(this.kucha.size()-1);
    }

    public void removeTop()  {
        this.kucha.remove(this.kucha.size()-1);
    }

    public void remove(int x)  {
        this.kucha.remove(x);
    }

    public void add(CharacterWithLegs ch)  {
        this.kucha.add(ch);
    }

    public boolean contains(Character ch)  {
       return  this.kucha.contains(ch);
    }

    public String getPlace()  {
        return this.place;
    }

    public int indexOf(Character ch)  {
        return this.kucha.indexOf(ch);
    }

    @Override
    public String toString() {
        String result="kucha mala of";
        if (kucha.size()==0) {
            result+=" nothing";
        }
        for (CharacterWithLegs ch : kucha) {
            result = result + " " + ch.toString();
        }
        result+= " in " + getPlace();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KuchaMala that = (KuchaMala) o;
        if (this.place!=that.place) { return false;}
        return kucha.equals(that.kucha);
    }

    @Override
    public int hashCode() {
        int result = place == null ? 0 : place.hashCode();
        for (CharacterWithLegs ch : kucha) {
            result = 29*result + ch.hashCode();
        }
        return result;
    }

}
